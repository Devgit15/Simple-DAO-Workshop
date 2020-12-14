public class Main {
    public static void main(String[] args) {
        User mati = new User("marta", "o@marto.pl", "123123");

        System.out.println(UserDAO.create(mati));
    }
}
