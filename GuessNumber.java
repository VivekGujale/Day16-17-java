import java.util.Scanner;

public class GuessNumber {
    static Scanner S = new Scanner(System.in);

    static int findNum() {
        int low = 0, high = 127, mid;
        while (low != high) {
            mid = (low + high) / 2;
            System.out.println("enter 1 if number is between " + low + " - " + mid +
                    "\nEnter 2 if number is between "
                    + (mid + 1) + " - " + high);
            int c = S.nextInt();
            mid = (low + high) / 2;
            if (c == 1)
                high = mid;
            else
                low = mid + 1;
        }
        return low;
    }

    public static void main(String[] args) {

        System.out.println("guess a no between 0 to 127 ");
        S.next();
        System.out.println("Your number is : " + findNum());
    }
}
