class BubleShort {
    public static void main(String[] args) {
        int[] my_array = {12, 6, 9, 5, 3, 2};
        int n = my_array.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (my_array[j] > my_array[j+1]) {
                    int temp = my_array[j];
                    my_array[j] = my_array[j+1];
                    my_array[j+1] = temp;
                }
            }
        }

        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(my_array[i] + " ");
        }
        System.out.println();
    }
}