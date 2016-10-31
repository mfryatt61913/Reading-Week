import java.util.Scanner;
public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String postcode = "";
        System.out.println("Please enter your postcode");
        postcode = sc.nextLine();
        System.out.println(postcode.toUpperCase());
    }
}
