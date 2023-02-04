package ratour.com.cloning;

public class Human implements Cloneable{
    int age ;
    int []arr;
    String name;
    public Human(int age,String name){
        this.age=age;
        this.name=name;
        this.arr=new int[]{7,48,3,5,9,1};
    }
    public Human(Human other){
        this.age=other.age;
        this.name=other.name;
    }
//    public Object clone() throws CloneNotSupportedException{
//        //this is shallow copy
//        return super.clone();
//    }
    public Object clone()throws CloneNotSupportedException{
        //this is a deep copy
        Human twin =(Human)super.clone();//this actually shallow copy
        //make a deep copy
        twin.arr=new int[twin.arr.length];
        for(int i=0;i<twin.arr.length;i++){
            twin.arr[i]=this.arr[i];
        }
return twin;

    }
}
