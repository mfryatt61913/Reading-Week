import java.util.Scanner;
public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        System.out.println("Please enter your name");
        name = sc.nextLine();
        System.out.println(name.length());
    }
}
