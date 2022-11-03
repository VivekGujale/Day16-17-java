public class BubbleSort {
    private void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++)
            for (int j = 0; j < array.length - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    void print(int array[]) {
        for (int i = 0; i < array.length; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    // Driver method to test above
    public static void main(String args[]) {
        BubbleSort bubbleSort = new BubbleSort();
        int array[] = {25, 12, 20, 9, 5, 23, 40, 34};
        bubbleSort.sort(array);
        System.out.println("Below are the sorted arrays by using bubble sort method");
        bubbleSort.print(array);
    }

}
