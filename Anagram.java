import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "ARRAY";
        String str2 = "YARRA";

        // converting strings into char array.
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();

        if (str1.length() == str2.length()) {

            // sort the char array
            Arrays.sort(charArr1);
            Arrays.sort(charArr2);

            // if sorted char arrays are same then the string is anagram
            boolean result = Arrays.equals(charArr1, charArr2);
            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagram.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagram.");
            }
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagram.");
        }
    }
}
