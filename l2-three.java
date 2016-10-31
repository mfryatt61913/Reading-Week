import java.util.Scanner;
public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = "";
        char letter = ' ';
        int vowels = 0;
        int consonants = 0;
        System.out.println("please enter a word");
        word = sc.nextLine().toUpperCase();
        if (!(word == "")) {
            for (int i=0; i<word.length(); i++) {
                letter = word.charAt(i);
                switch (letter) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                    vowels += 1;
                    break;
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    consonants += 1;
                    break;
                    default:
                    break;
                }
            }
            System.out.println("vowels: " + vowels);
            System.out.println("consonants: " + consonants);
        }
    }
}