import java.util.Scanner;
public class four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        String surname = "";
        System.out.println("Please enter your first name and your surname");
        name = sc.nextLine();
        surname = name.substring(name.indexOf(" ") + 1, name.length());
        System.out.println("Hi " + surname);
    }
}
