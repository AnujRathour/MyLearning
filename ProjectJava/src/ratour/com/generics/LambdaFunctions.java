package ratour.com.generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<5;i++){
            arr.add(3*i);
        }
        arr.forEach((items)-> System.out.println(2*items));
        Consumer<Integer> fun=(items)-> System.out.println(2*items);
        arr.forEach(fun);

        Opration sum=(a,b)->a+b;
        Opration pro=(a,b)->a*b;
        Opration sub=(a,b)->a-b;
        LambdaFunctions myCalculator=new LambdaFunctions();
        System.out.println(myCalculator.oprate(5,3,sum));


    }
    private int oprate( int a,int b,Opration op){
        return op.opration(a,b);
    }
    interface Opration{
        int opration(int a,int b);
    }
}
