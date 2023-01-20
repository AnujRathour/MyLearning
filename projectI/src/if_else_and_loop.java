package com.anuj;

import java.util.Scanner;

public class if_else_and_loop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter n");
        int n = input.nextInt();
//
//     if (income>180000){
//         income=income+income*0.5;
//     }
//     else if(income>500000){
//         income=(income-1800000)*0.1+32000;
//     }
//     else
//    {
//        income=(income-500000)*0.2+9200000;
//    }
//     System.out.println(income);

     for(int count=1;count<=n;count++) {
         if(count==1)
             System.out.println("one"+count);
     }
  }


}
