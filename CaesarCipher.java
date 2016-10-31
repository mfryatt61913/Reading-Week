import java.util.Scanner;
public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String plaintext = "";
        int shift = 0;
        int asciiletter = 0;
        String encoded = "";
        
        System.out.println("please enter the text");
        plaintext = sc.nextLine();
        System.out.println("enter the caesar shift");
        shift = sc.nextInt();
        
        for (int i=0; i<plaintext.length(); i++) {
            asciiletter = (int)plaintext.charAt(i);
            for (int j=1; j<shift+1; j++) {
                switch (asciiletter) {
                    case 90:
                    asciiletter = 65;
                    break;
                    case 122:
                    asciiletter = 97;
                    break;
                    default:
                    asciiletter += 1;
                }
            }
            encoded = encoded + Character.toString((char)(int)asciiletter);
        }
        
        System.out.println(encoded);
    }
}
                    