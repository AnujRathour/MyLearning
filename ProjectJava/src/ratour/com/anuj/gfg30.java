package ratour.com.anuj;

public class gfg30 {
    public static void main(String[] args) {


        String up = "aabb";

        System.out.println(remove(up));
    }
    static String remove( String up ){
        if(up.isEmpty()){
            return up;
        }
        if(up.length()<=1){
            return up;
        }
//        char ch=up.charAt(1);
        if (up.charAt(0)==up.charAt(1)) {
            return remove(up.substring(1));

        }
        return up.charAt(0)+remove(up.substring(1));
    }
}
