package deep_bubleshort;

public class ImproveBubleShort {

    public static void main(String[] args) {
        int[] array = {45, 8, 12, 3, 5};
        int n = array.length;

        for (int i=0; i<n-1; i++) {
            boolean swapped = false;
            for (int j=0; j<n-i-1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
            
        }
        for (int i=0; i<n; i++) {
            System.out.println(array[i]);
        }
    }
    
}
