public class MinVal {

    public static void main(String[] args) {
        int myArray[] = {10, 4, 2, 8, 30, 9};
        int minVal = myArray[0];
        for (int i : myArray) {
            System.out.println(i);
            if (i < minVal) {
                minVal = i;
            }
        }
        
        System.out.println("Minimal value is: " + minVal);
    }
    
}
