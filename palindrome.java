import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palindrome = "";
        String reversed = "";
             
        System.out.println("please enter a palindrome");
        palindrome = sc.nextLine();
        
        for (int i=palindrome.length()-1; i>-1; i--) {
            reversed = reversed + palindrome.charAt(i);
        }
        
        if (reversed.equals(palindrome)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}