package ratour.com.anuj;

import java.util.Scanner;

public class code {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in=new Scanner(System.in);
//        int t=in.nextInt();

            int H=18;//in.nextInt();
           int X=4;//in.nextInt();
            int Y=6;//in.nextInt();
            int c=0;

//            for(int m=1;;m++){
//                H=H+Y;
//                H=H-X;
//                if(H==c){
//                    System.out.println("0");
//                    break;
//                }
//                c=H;
//
//                if(H<=0){
//                    System.out.println("1");
//                    break;
//                }
//            }
        int d = H;
        while(true) {
            if(H <= 0) {
                System.out.println("1");
                break;
            }
            else if(d < H) {
                System.out.println("0");
                break;
            }
            d = H;
            H= H + Y- X;
        }
        }
    }

