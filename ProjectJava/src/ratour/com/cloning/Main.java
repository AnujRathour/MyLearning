package ratour.com.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
    Human anuj=new Human(20,"Anuj");
            Human twin =(Human)anuj.clone();
        System.out.println(twin.age+" "+twin.name);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[4]=5;
        //shallow copy means twin and anuj will point to same object in case of non primitive
        //in case of primitive creating a variable copy put the value over there
        System.out.println(Arrays.toString(anuj.arr));
        System.out.println(Arrays.toString(twin.arr));

    }
}
