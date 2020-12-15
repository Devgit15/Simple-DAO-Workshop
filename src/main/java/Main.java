import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDAO;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        pl.coderslab.entity.User mati = new pl.coderslab.entity.User("marta", "o@marto.pl", "123123");

//        System.out.println(pl.coderslab.entity.UserDAO.create(mati));
//
//        pl.coderslab.entity.User user = pl.coderslab.entity.UserDAO.read(9);
//        if (user != null) {
//            user.setUserName("updated_username");
//            if(pl.coderslab.entity.UserDAO.update(user)) {
//                System.out.println("update successful");
//            }
//        }

//        System.out.println(pl.coderslab.entity.UserDAO.delete(2));


        List<User> users = UserDAO.findAll();
        if (users != null) {
            for (User user : users) {
                System.out.println(user);
            }
        }

    }
}
