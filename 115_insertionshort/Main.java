public class Main {
    public static void main(String[] args) {
        int[] array = {9, 12, 8, 13, 6, 4, 16, 22, 2};
        int n = array.length;
        
        for(int i=0; i<n-1; i++) {
            int min_index = i;
            for(int j=i+1; j<n; j++) {
                if(array[j] < array[i]) {
                    min_index = j;
                }
            }
            int min_value = array[min_index];
            for(int k=min_index; k>i; k--) {
                array[k] = array[k-1];
            }
            array[i] = min_value;
        }

        for (int i=0; i<n; i++) {
            System.out.print(array[i] + " ");
        }

    }
}