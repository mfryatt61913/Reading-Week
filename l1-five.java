import java.util.Scanner;
public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        System.out.println("Please enter your full name");
        name = sc.nextLine();
        System.out.println(name.charAt(0) + " " + name.charAt(name.indexOf(" ")+1) + " " + name.charAt(name.lastIndexOf(" ")+1));
    }
}
