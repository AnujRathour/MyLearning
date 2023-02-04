package ratour.com.anuj;

import java.util.Scanner;

public class hakerrank {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt(2);
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int series0=a+b;
            int series=a+b;

            System.out.print(series0+" ");


            for(i=1;i<n;i++){
                series=series+(pow(2,i)*b);
                System.out.print(series+" ");
            }
        }


    }
    static int pow(int a,int b){
        int base=a;
        int ans=1;
        while(b>0){
            if((b&1)==1)
                ans=ans*base;
            base=base*base;
            b=b>>1;
        }

        return ans;
    }
}
