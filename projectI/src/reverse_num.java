import java.util.Scanner;

public class reverse_num {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n=12345;
        int ans=0;
        while(n>0){
            int rem=n%10;
                n=n/10;
                ans=ans*10+rem;
        }
        System.out.println(ans);
    }
}
