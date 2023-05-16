package ClaseDeBaza;

public class Main {

    public static void main(String[] args) {
        User user = new User("Mirceaaa", 30);
        System.out.println(user);

        User user1 = new User("Mircea", 30);
        User user2 = user;
        System.out.println(user.equals(user2));
        System.out.println(user.equals(user1));
        System.out.println(user.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user1.hashCode());
    }
}
