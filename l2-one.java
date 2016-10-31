import java.util.Scanner;
public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String saying = "";
        int words = 1;
        System.out.println("please enter a saying.");
        saying = sc.nextLine();
        for (int i=0; i<saying.length(); i++) {
            if (saying.charAt(i)==' ') {
                words += 1;
            }
        }
        System.out.println("There are " + words + " in that saying.");
    }
}