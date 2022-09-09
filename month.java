import java.util.Scanner;

public class month {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input a month number: ");
        int n = in.nextInt();
        switch (n) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("MAY");
                break;
            case 6:
                System.out.println("jun");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("aug");
                break;
            case 9:
                System.out.println("sept");
                break;
            case 10:
                System.out.println("oct");
                break;
            case 11:
                System.out.println("nov");
                break;
            case 12:
                System.out.println("dec");
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
