import java.util.Scanner;
public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String reverseMe = "";
        System.out.println("Please enter something to be reversed.");
        reverseMe = sc.nextLine();
        for (int i=reverseMe.length()-1; i>-1; i--) {
            System.out.print(reverseMe.charAt(i));
        }
        System.out.println();
    }
}