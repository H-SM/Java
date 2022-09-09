import java.util.*;

public class fibb {
    public static void main(String args[]) {
        int n1 = 0, n2 = 1, n3, i, count = 10;
        System.out.print(n1 + " " + n2);
        for (i = 2; i < count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.print("\n****DETAILS****\nName- Rachit Kumar Rajput\nSAP-ID: 500094018\nBatch- B2\n");
        System.out.print("uiuriu");
    }
}
