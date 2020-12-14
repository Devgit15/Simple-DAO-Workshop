public class Main {
    public static void main(String[] args) {
        User mati = new User("ola", "alo@alo.pl", "abcabc");

        System.out.println(UserDAO.create(mati));
    }
}
