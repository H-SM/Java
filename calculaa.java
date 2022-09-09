public class calculaa {
    public static void main(String args[]) {
        int a = 0, c = 0;
        String b = args[1];
        a = Integer.parseInt(args[0]);
        c = Integer.parseInt(args[2]);
        System.out.println(a);
        System.out.println(c);
        if (b.equals("+"))
            System.out.println(a + c);
        else if (b.equals("-"))
            System.out.println(a - c);
        else if (b.equals("x"))
            System.out.println(a * c);
        else
            System.out.println(a / c);
    }
}
