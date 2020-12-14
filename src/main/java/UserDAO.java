
import com.mysql.cj.protocol.Resultset;
import org.mindrot.jbcrypt.BCrypt;

import java.sql.*;

public class UserDAO {
    public static final String CREATE_USER_QUERY = "INSERT INTO users(username, email, password) VALUES (?,?,?)";


    public static User create(User user){
        try (Connection connection = DbUtil.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(CREATE_USER_QUERY, PreparedStatement.RETURN_GENERATED_KEYS);

            statement.setString(1, user.getUserName());
            statement.setString(2, user.getEmail());
            statement.setString(3, hashPassword(user.getPassword()));

            statement.executeUpdate();

            ResultSet result = statement.getGeneratedKeys();
            if(result.next()) {
                int id = result.getInt(1);
                user.setId(id);
                System.out.println("Inserted ID for " + user.getUserName() + " is: " + id);
                return user;
            }

        } catch (SQLException e) {
            System.out.println("SQL exception in method CREATE");
            e.printStackTrace();
        }
        return null;
    }


    private static String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

}
