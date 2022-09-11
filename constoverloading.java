public class constoverloading {
    // 5. Write a JAVA program to implement constructor overloading.
    double width, height, depth;// related to a shape <for specimen purpose only>
    int No;

    constoverloading(double w, double h, double d, int num) {
        width = w;
        height = h;
        depth = d;
        No = num;
    }

    // constructor used when no dimensions specified
    constoverloading() {// making all Zero here...
        width = height = depth = 0;
    }

    constoverloading(int num) {
        // this is used for calling the default parameter here ...
        this.No = num;
    }

    public static void main(String[] args) {
        constoverloading obj1 = new constoverloading(1, 2, 3, 4);// using all w,h,d,num
        constoverloading obj2 = new constoverloading(1);// only using num here...
        System.out.println(obj1.width + "\n" + obj2.width);

    }
}
