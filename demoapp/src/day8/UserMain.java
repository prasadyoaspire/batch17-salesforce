package day8;

public class UserMain {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setUserId(101);
        user1.setFirstName("raj");
        user1.setLastName("Kumar");
        user1.setRole(Role.CUSTOMER);

        System.out.println("UserId: "+user1.getUserId());
        System.out.println("FirstName: "+user1.getFirstName());
        System.out.println("LastName: "+user1.getLastName());
        System.out.println("Role: "+user1.getRole());
    }
}
