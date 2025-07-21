package deep_selectionshort;

public class Main {
    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int n = array.length;

        for (int i=0; i<n; i++) {
            int minIndex = i;
            for (int j=i+1; j<n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        for (int i=0; i<n; i++) {
            System.out.println(array[i]);
        }
    }
}