package ratour.com.anuj;

import java.util.Scanner;

public class gfg {
//    public static void main(String[] args) {
//   printNos(10);
//   int []arr =  {1, 4, 45, 6, 10, -8};
//        System.out.println(min(arr,0,Integer.MAX_VALUE));
//        FirstUpperCase("anuJ");
//        System.out.println((MakeUpper("my name is")));
//        stringlength("anujrathour",
//        Scanner input=new Scanner(System.in);
//        int A=input.nextInt();
//        int B=input.nextInt();
//        int C=input.nextInt();
//
//        System.out.println(geeknocii(6,A,B,C));
//        int[]arr={10,20,30,40,50};
//        int n=5;
//
//       boolean hai= fxn(arr,n,0,false);
//        System.out.println(hai);
//    }
//    static void printNos(int N)
//    {
//        if(N==0){
//
//            return;
//        }
//        printNos(N-1);
//        System.out.print(N);
//
//    }
    static int max(int [] arr, int index, int Max){
        if(arr.length==1){
            return arr[0];
        }

        if(arr.length==index){
            return Max;
        }
        if(arr[index]>Max){
            Max=arr[index];
           return max(arr,index+1,Max);
        }

          return  max(arr,index+1,Max);



    }
    static int min(int [] arr,int index,int Min){
        if(arr.length==1){
            return arr[0];
        }
        if(arr.length==index){
            return Min;
        }
        if(arr[index]<Min){
            Min=arr[index];
            return min(arr,index+1,Min);
        }

        return  min(arr,index+1,Min);



    }
    static void FirstUpperCase(String s){
        if(s.length()==0){
            return;
        }
        char ch=s.charAt(0);
        if(Character.isUpperCase(ch)){
            System.out.println(ch);
        }
        else{
            FirstUpperCase(s.substring(1));
        }
    }
    static String MakeUpper(String s){
        char []ch=s.toCharArray();
    for(int i=0;i<s.length();i++){
        if(i==0&&ch[i]!=' '|| ch[i-1]==' '&&ch[i]!=' '){
          ch[i] = Character.toUpperCase(ch[i]);
        }

    }
    String v=new String(ch);
        return v;
    }
    static void stringlength(String s,int count){
        if(s.isEmpty()){
            System.out.println(count);
            return ;
        }
        stringlength(s.substring(1),count+1);
    }
    static int geeknocii(int n, int A, int B, int C){

       if(n==1){
    return A;
       }
       if(n==2){
           return B;
       }
       if(n==3){
           return C;
       }
       return geeknocii(n-1,A,B,C)+geeknocii(n-2,A,B,C)+geeknocii(n-3,A,B,C);



    }


    }


