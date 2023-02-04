package ratour.com.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    int []data;
    private static int DEFAULT_SIZE=10;
    private static int size=0;
    private CustomArrayList(){
        this.data=new int[DEFAULT_SIZE];
    }
    void add(int num){
        if (isFull()) {
            resize();
        }
        data[size++]=num;
    }
   private boolean isFull(){
        return size==data.length;
    }
   private void resize(){
        int []temp=new int[data.length*2];
        for(int i=0;i< data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    public int size(){
        return size;
    }
//    public int add(int num){
//        return data[0]=num;
//    }
    public int get(int index){
        return data[index];
    }
    public void set(int index,int value){
        data[index]=value;
    }
    public int remove(){
        int removed=data[--size];
        return removed;
    }
public String toString(){
        return "CustomArrayList{"+"data="+ Arrays.toString(data)+",size="+size+'}';
}

    public static void main(String[] args) {
//        ArrayList list=new ArrayList<>();
        CustomArrayList lis=new CustomArrayList();
        lis.add(3);
        lis.add(4);
        lis.add(5);
        System.out.println(lis);
    }
}
