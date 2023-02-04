package ratour.com.anuj;

import java.util.Arrays;

public class validbraces {
    public static void main(String[] args) {
        char []ch={'{','(','[',']',')','}'};
        System.out.println(check(ch,6));
    }
    static char closingbraces(char Ch){
        if(Ch=='{') return '}';
        if(Ch=='[') return ']';
        if(Ch=='(') return ')';
        return Character.MIN_VALUE;
    }
    static boolean check(char[] ch,int n){
        if(n==0) return true;
        if(n==1)return false;
        if(ch[0]=='}'||ch[0]==')'||ch[0]==']') return false;
        char closebrace=closingbraces(ch[0]);
        int i;
        int count=0;
        for( i=1;i<n;i++){
            if(ch[i]==ch[0]) count++;
            if(closebrace==ch[i]){
                if(count==0) break;
                count--;
            }
        }
        if(i==n)return false;
        if(i==1) return check(Arrays.copyOfRange(ch,i+1,n),n-2);
        return check(Arrays.copyOfRange(ch,1,i),i+1)&&check(Arrays.copyOfRange(ch,i+1,n),n-i-1);

    }

}
