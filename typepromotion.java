
//4. Write a JAVA program to implement type promotion in method overloading.
public class typepromotion {
    // type promotion is basically same function name having <method overloading>
    // different data types asked by it
    // EXAMPLE-
    void sum(int a, int b, int c) {
        System.out.println(a + "+" + b + "+" + c + "=" + (a + b + c));
        System.out.println("Function 1 here");
    }

    void sum(long a, long b) {
        System.out.println(a + "+" + b + "+" + "=" + (a + b));
        System.out.println("Function 2 here");
    }

    void sum(int a, int b, int c, float d) {
        System.out.println(a + "+" + b + "+" + c + "+" + d + "=" + (a + b + c + d));
        System.out.println("Function 3 here");
    }

    public static void main(String args[]) {
        typepromotion obj = new typepromotion();
        obj.sum(1, 2, 3);
        obj.sum(300000, 400000);
        obj.sum(1, 2, 3, 4.59f);
    }
}