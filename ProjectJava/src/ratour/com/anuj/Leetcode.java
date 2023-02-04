package ratour.com.anuj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode {


 public static void main(String[] args) {
//        List<List<String>> v=new ArrayList<>();
//
//        pallindrome("","aab",v);
//        System.out.println(v);
//static void pallindrome(String p,String up,List<List<String>> list){
//
//        boolean isPllindrome=isPallindrome(p);
//        List<String> ans=new ArrayList<>();
//        if(isPllindrome){
//            ans.add(p);
//           ans.remove(ans.size()-1);
//        }
//        //we need backtracking
//        if(up.isEmpty()){
//            list.add(ans);
//            return ;
//        }
//        char ch=up.charAt(0);
//      pallindrome(p + ch, up.substring(1), list);
//        pallindrome(p,up.substring(1),list);
//    int arr[]={1,2,3,4,5};
//    System.out.println(pivot(arr));
//     int []nums= {8, 5, 4, 5, 1, 4, 5, 2, 2};
//     System.out.println(check(nums));

 }
//   static boolean isPallindrome(String pll){
//        if(pll.isEmpty()){
//            return false;
//        }
//        String c=pll;
//        String ans="";
//        for(int i=pll.length()-1;i>=0;i--){
//            ans= ans+pll.charAt(i);
//        }
//        if(ans.equals(c)){
//            return true;
//        }
//        return false;
//    }

//   static boolean palind(String s) {
//        String a = new StringBuilder(s).reverse().toString();
//        if (a.equals(s)) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    static void call(int ind, List<List<String>> ans, List<String> vec, String s) {
//        if (ind == s.length()) {
//            ans.add(new ArrayList<String>(vec));
//        }
//
//        for (int i = ind; i < s.length(); i++) {
//            if (palind(s.substring(ind, i + 1))) {
//                vec.add(s.substring(ind, i + 1));
//                call(i + 1, ans, vec, s);
//                vec.remove(vec.size() - 1);
//            }
//        }
//    }
//    public static void main (String args[]) {
//        List<List<String>> ans = new ArrayList<List<String>>();
//        List<String> vec = new ArrayList<String>();
//        String s="aab";
//        call(0, ans, vec, s);
//        System.out.println(ans);
//    }
//public static void main(String[] args) {
//    String [] s= {"A", " ", "m", "a", "n", ",", " ", "a", " ", "p", "l", "a", "n", ",", " ", "a", " ", "c", "a", "n", "a", "l", ":", " ", "P", "a", "n", "a", "m", "a"};
//    int start=0;
//    int e=s.length-1;
//    for(int i=start;i<=e/2;i++){
//        swap(s,start,e);
//        start++;
//        e--;
//    }
//    System.out.println(Arrays.toString(s));
//
//}
//   static void swap(String []s,int start,int e){
//        String temp=s[start];
//        s[start]=s[e];
//        s[e]=temp ;
//    }
//    static int pivot(int []arr){
//
//    int s=0;
//    if(arr[s]>arr[s+1])return s;
//
//    int e=arr.length;
//    if(arr[e]>arr[e-1])return e;
//    while(e>=s){
//        int m=s+(e-s)/2;
//        if(arr[m]>arr[s]){
//            if(arr[m]>arr[m+1]) return m;
//            else s=m+1;
//        }
//        else if(arr[m]<arr[s]){
//            if(arr[m-1]<arr[m]) e=m-1;
//            else return m-1;
//        }
//        else if(arr[m]>arr[e]){
//            if(arr[m+1]<arr[m]){
//                return m+1;
//            }
//            else s=m+1;
//        }
//    }
//    return -1;
//    }

//    static boolean check(int[] nums) {
//        int max=nums[0];
//        int index=0;
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]>=max){
//                max=nums[i];
//                index=i;
//            }
//        }
//        if(nums.is)
//static boolean check(int[] nums) {
//    if(nums.length==1||nums.length==0){
//        return true;
//    }
//    int max=nums[0];
//    int index=0;
//    for(int i=0;i<nums.length;i++){
//        if(nums[i]>=max){
//            max=nums[i];
//            index=i;
//        }
//    }
//
//    int ans[];
//    int res[];
//    if(index+1==nums.length)
//    {
//        return issorted(nums,nums.length);
//    }
//
//    res=new int[nums.length-index+1];
//    ans=new int[index+1];
//    if(ans.length==0||(ans.length==1&&res.length==1)||nums.length==2)return true;
//    for(int k=0;k<ans.length;k++){
//        ans[k]=nums[k];
//    }
//    if(res.length==0||(ans.length==1&&res.length==1)||nums.length==2)return true;
//    for(int j=index+1;j<res.length;j++){
//        res[j]=nums[j];
//    }
//
//    return issorted(ans,ans.length)&&issorted(res,res.length);
//
//}
//    static boolean issorted(int arr[],int n ){
//        if(n==1||n==0){
//            return true;
//        }
//        if(arr[n-1]<arr[n-2]){
//            return false;
//        }
//        return issorted(arr,n-1);
//    }


}
