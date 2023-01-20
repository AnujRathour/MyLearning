
import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {

        System.out.println("Enter a,b,c integer");
        Scanner input = new Scanner(System.in);
        int max;
        int a= input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if ((a > b) && (a > c)) {
            max = a;
        } else {
            if (b > c) {
                max = b;
            } else {
                max = c;
            }
        }
        if (max == a) {
            if (b > c)
                System.out.println(b);
            else System.out.println(c);
        }
        if (max == b) {
            if (a > c)
                System.out.println(a);
            else System.out.println(c);

        }
        if (max == c) {
            if (a > b)
                System.out.println(a);
            else System.out.println(b);
        }
    }
}
