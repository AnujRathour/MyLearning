package ratour.com.anuj;

//public class leet {
//    public static void main(String[] args) {
//        System.out.println(reverse(1534236469));
//    }
//
//    static int reverse(int x) {
//
//       signed int sum = 0;
//        if (x == 0) return 0;
//        int y = 0;
//        if (x < 0) {
//            y = Math.abs(x);
//        } else {
//            y = x;
//        }
//        while (y > 0) {
//            int rem = y % 10;
//            sum = sum * 10 + rem;
//            if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) return 0;
//            y = y / 10;
//        }
//        if (x < 0) return sum * (-1);
//        return sum;
//    }
//}