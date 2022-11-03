public class Permutation {

    public static void permute(String a, int l, int r) {
        if (l == r) {
            System.out.println(a);
        } else {
            for (int i = l; i <= r; i++) {
                a = swap(a, l, i);
                permute(a, l + 1, r);
                a = swap(a, l, i);
            }
        }
    }

    public static String swap(String m, int n, int o) {

        //Converting string into char
        char[] chars = m.toCharArray();
        char temp = chars[n];
        chars[n] = chars[o];
        chars[o] = temp;
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String a = "ABC";
        Permutation.permute(a, 0, a.length() - 1);
    }
}
