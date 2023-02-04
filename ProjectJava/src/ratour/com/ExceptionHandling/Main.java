package ratour.com.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a=4;
        int b=0;

        try {
            divide(a,b);
           // int div=a/b;
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("this will always run");
        }

        }
    static int divide(int a,int b){
        if(b==0)throw new ArithmeticException("please do not divide by 0");
        return a/b;
    }

}
