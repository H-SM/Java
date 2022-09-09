import java.io.*;
import java.util.*;

public class Calculate {

    public int sum(int input1, int input2) {
        return input1 + input2;
    }

    public static void main(String[] args) {
        Calculate obj = new Calculate();
        int result = obj.sum(40, 20);

        System.out.println("Addition of numbers: " + result);
    }
}