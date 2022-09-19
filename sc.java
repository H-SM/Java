
public class sc {
    private int y = 90;
    public int x = 90;

    public int functcall() {
        this.y = 111;
        return y;
    }

    public static void main(String args[]) {
        int x;
        sc obj = new sc();
        x = obj.functcall();// inheriting the property (90) from functcall
        System.out.println(x);
    }
}

class C extends sc {
    // public int z = super.y;
    public int q = super.x;

    public int functcall() {
        return this.q;
    }

    /*
     * public int functcall2() {
     * return this.z;
     * }
     */

    public static void main(String args[]) {
        int z; // q;
        C obj = new C();
        z = obj.functcall();
        // q = obj.functcall2();
        System.out.println(z);
        // System.out.println(q);
    }
}
