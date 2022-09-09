public class ForEachEaxmple {
    public static void main(String[] args) {
        // Declaring an array
        int a[] = new int[10];
        int y = a.length;
        /*
         * dataType[][] arrayRefVar; (or)
         * dataType [][]arrayRefVar; (or)
         * dataType arrayRefVar[][]; (or)
         * dataType []arrayRefVar[];
         */
        int arr[] = { 12, 23, 44, 56, 78 };
        // Printing array using for-each loop
        for (int i : arr) {
            System.out.println(i);
        }
    }
}