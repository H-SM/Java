
public class larger {
    public static void main(String args[]) {
        int a = 0, b = 0, c = 0;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);

        if (a > b && a > c)
            System.out.println(a + " is the greatest number.");
        else if (b > c)
            System.out.println(b + " is the greatest number");
        else
            System.out.println(c + " is the greatest number");
    }
}
