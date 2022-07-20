package com.study.java;

/**
 * Created with IntelliJ IDEA.
 * Description:杨辉三角、数组运算
 * User: zhao
 * Date: 2022-07-17
 * Time: 20:53
 */
public class ArrayTest2 {
    public static void main(String[] args) {
/*

//       13题 求杨辉三角
       int[][] arr=new int[10][];
        for (int i = 0; i < arr.length; i++) {
               arr[i]=new int[i+1];
               arr[i][0]=1;
               arr[i][i]=1;
               if(i>1){
                   for (int j = 1; j < arr[i].length-1; j++) {
                        arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                   }

               }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


//      16题  数组运算
         int[] arr=new int[10];
        for (int i = 0; i < arr.length; i++) {
           arr[i]=(int)(Math.random()*90+10);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
//        求最大值
        int max=arr[0];
        for (int j = 0; j < arr.length; j++) {
            max=max>=arr[j]?max:arr[j];
        }
        System.out.println("最大值"+max);
//        求最小值
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = min <= arr[i]?min:arr[i];
        }
        System.out.println("最小值"+min);

//        求和
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("和"+sum);
//        平均数
        double avg=(double) sum/arr.length;
        System.out.println("平均数"+avg);

 */
    }
}
