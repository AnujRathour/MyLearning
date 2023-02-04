package ratour.com.generics;

import java.util.Arrays;

public class CustomGenArrayList<T extends Number> {
    Object[]data;
    private static int DEFAULT_SIZE=10;
    private static int size=0;
    public CustomGenArrayList(){
        this.data=new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if (isFull()) {
            resize();
        }
        data[size++]=num;
    }
    private boolean isFull(){
        return size==data.length;
    }
    private void resize(){
        Object []temp=new Object[data.length*2];
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
    public T get(int index){
        return (T) data[ index];
    }
    public void set(T index,T value){
        data[(int) index]=value;
    }
    public T remove(){
        T removed=(T)data[--size];
        return removed;
    }
    public String toString(){
        return "CustomArrayList{"+"data="+ Arrays.toString(data)+",size="+size+'}';
    }

    public static void main(String[] args) {
//        ArrayList list=new ArrayList<>();
        CustomGenArrayList<Float>lis=new CustomGenArrayList<>();
        lis.add(3.5F);
        lis.add(4f);
        lis.add(5f);
        System.out.println(lis);
    }
}
