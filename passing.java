//import java.util.*;

public class passing {
    public static void main(String args[]) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++)
            arr[i] = Integer.parseInt(args[i]);
        int temp;
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                {
                    if (arr[j] < arr[i]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        // Arrays.sort(arr);
        System.out.println("MARKS\tGRADE\n-----------------");
        for (int i = 0; i < 10; i++) {
            if (arr[i] < 40)
                System.out.println(arr[i] + "\tFAIL");
            else if (arr[i] >= 40 && arr[i] < 50)
                System.out.println(arr[i] + "\tPASS");
            else if (arr[i] >= 50 && arr[i] < 75)
                System.out.println(arr[i] + "\tMERIT");
            else
                System.out.println(arr[i] + "\tDISTINCTION");
        }
    }
}
