

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Below are the prime numbers between 0 to 1000");
        int flag;
        //0 & 1 are not prime numbers & 2 is even prime number.
        for (int i = 0; i <= 1000; i++) {
            if (i == 0 || i == 1)
                continue;
            flag = 1;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(i);
        }
    }
}