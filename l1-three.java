import java.util.Scanner;
public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password1 = "";
        String password2 = "";
        do {
            System.out.println("Please enter your password");
            password1 = sc.nextLine();
            System.out.println("Please re-enter your password");
            password2 = sc.nextLine();
        } while (!(password1.equals(password2)));
        System.out.println("Password verified");
    }
}
