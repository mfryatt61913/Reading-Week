import java.util.Scanner;
import java.util.Random;
public class LotteryDraw {    
    public static boolean alreadyChosen(int compare, int num1, int num2, int num3, int num4, int num5, int num6) {
        int same = 0;
        if (compare==num1) {
            same += 1;
        }
        if (compare==num2) {
            same += 1;
        }
        if (compare==num3) {
            same += 1;
        }
        if (compare==num4) {
            same += 1;
        }
        if (compare==num5) {
            same += 1;
        }
        if (compare==num6) {
            same += 1;
        }
        if (same==1) {
            return false;
        } else {
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] random_num;
        random_num = new int[7];
        int bonus_ball = 0;
        int[] guess;
        guess = new int[7];
        int matches = 0;
        boolean bonus = false;        
        for (int m=1; m<7; m++) {
            do {
                System.out.println("Please enter guess " + m);
                guess[m] = sc.nextInt();
            } while (guess[m]<1 || guess[m]>49 || alreadyChosen(guess[m], guess[1], guess[2], guess[3], guess[4], guess[5], guess[6]));
        }
        Random r = new Random();
        for (int n=1; n<7; n++) {
            do {
                random_num[n] = r.nextInt((49-1)+1)+1;
            } while (alreadyChosen(random_num[n], random_num[1], random_num[2], random_num[3], random_num[4], random_num[5], random_num[6]));
        }
        do {
            bonus_ball = r.nextInt((49-1)+1)+1;
        } while (bonus_ball==random_num[1] || bonus_ball==random_num[2] || bonus_ball==random_num[3] ||
        + bonus_ball==random_num[4] || bonus_ball==random_num[5] || bonus_ball==random_num[6]);
        System.out.println("You chose: " + guess[1] + " " + guess[2] + " " + guess[3] + " " + guess[4] + " " +
        + guess[5] + " " + guess[6]);
        System.out.println("The numbers were: " + random_num[1] + " " + random_num[2] + " " + random_num[3] + " " + 
        + random_num[4] + " " +  random_num[5] + " " + random_num[6]);
        System.out.println("The bonus ball was: " + bonus_ball);
        for (int i=1; i<7; i++) {
            for (int j=1; j<7; j++) {
                if (guess[i]==random_num[j]) {
                    matches += 1;
                }
            }
            if (guess[i]==bonus_ball) {
                bonus = true;
            }
        }
        switch (matches) {
            case 3:
            System.out.println("You have correctly matched three numbers, winning £10.");
            break;
            case 4:
            System.out.println("You have correctly matched four numbers, winning £100.");
            break;
            case 5:
            if (bonus) {
                System.out.println("You have correctly matched five numbers and the bonus ball, winning £100,000.");
            } else {
                System.out.println("You have correctly matched five numbers, winning £10,000.");
            }
            break;
            case 6:
            System.out.println("You have correctly matched all six numbers, winning £1,000,000.");
            break;
            default:
            System.out.println("You did not match enough numbers to win.");
            break;
        }          
    }
}