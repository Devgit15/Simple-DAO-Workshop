
import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class UserDAO {
    public static final String CREATE_USER_QUERY = "INSERT INTO users(username, email, password) VALUES (?,?,?)";


    public static boolean create(User user){
        try (Connection connection = DbUtil.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(CREATE_USER_QUERY, PreparedStatement.RETURN_GENERATED_KEYS);

            statement.setString(1, user.getUserName());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getPassword());

            statement.executeUpdate();

            ResultSet result = statement.getGeneratedKeys();
            if(result.next()) {
                long id = result.getLong(1);
                user.setId(id);
                System.out.println("Inserted ID for " + user.getUserName() + " is: " + id);
                return true;
            }

        } catch (SQLException e) {
            System.out.println("SQL exception in method CREATE");
            e.printStackTrace();
        }
        return false;
    }



}
