import java.util.Scanner;
public class ISBN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ISBN = "";
        String checkDigit = "";
        int digit = 0;
        int total = 0;
        
        do {
            System.out.println("please enter the isbn");
            ISBN = sc.nextLine();
        } while (ISBN.length()!=12);
        
        for (int i=0; i<12; i++) {
            digit = Integer.parseInt(ISBN.substring(i, i+1));
            if (i%2==1) {
                total = total + (digit*3);
            } else {
                total = total + digit;
            }
        }
        
        if (total%10==0) {
            checkDigit = "0";
        } else {
            checkDigit = String.valueOf(10 - (total%10));
        }
        
        ISBN = ISBN + checkDigit;
        System.out.println(ISBN);
    }
}