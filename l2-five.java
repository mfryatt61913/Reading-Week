import java.util.Scanner;
public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String guess = "";
        String random = "RANDOM";
        char letter = ' ';
        char compare = ' ';
        String result = "";
        do {
            guess = "";
            result = "";
            System.out.println("please enter your guess");
            guess = sc.nextLine().toUpperCase();
            for (int j=0; j<6; j++) {
                letter = guess.charAt(j);
                compare = random.charAt(j);
                if (letter == compare) {
                    result = result + Character.toString(compare);
                } else {
                    result = result + "?";
                }
            }
            System.out.println(result);
        } while (!(guess.equals(random)));
        System.out.println("correct");
    }
}