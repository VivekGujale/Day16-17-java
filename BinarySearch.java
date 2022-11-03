public class BinarySearch {
    static int binarySearch(String[] arr, String x) {
        int a = 0, l = arr.length - 1;
        while (a <= l) {
            int m = a + (l - a) / 2;
            int value = x.compareTo(arr[m]);
            if (value == 0)
                return m;
            if (value > 0)
                a = m + 1;
            else
                l = m - 1;
        }
        return -1;
    }


    public static void main(String[] args) {
        String[] arr = {"Peach", "Apple", "Mango", "Papaya"};
        String x = "Mango";
        int result = BinarySearch.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at position " + result);
    }
}

