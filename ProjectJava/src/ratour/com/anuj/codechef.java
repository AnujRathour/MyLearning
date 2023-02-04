package ratour.com.anuj;

import java.util.Scanner;

public class codechef {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        int t=input.nextInt();

            int A=input.nextInt();
            int B=input.nextInt();
            int n=input.nextInt();

            System.out.println(sfibo(n,A,B));


    }
    static int sfibo(int n, int A, int B) {

        if (n == 0) {
            return A;
        }
        if (n == 1) {
            return B;
        }

        return sfibo(n - 1, A, B) ^ sfibo(n - 2, A, B);


    }
    }
