package com.study.java;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:数组赋值、复制、反转、二分查找
 * User: zhao
 * Date: 2022-07-18
 * Time: 0:25
 */
public class ArrayExer2 {
    public static void main(String[] args) {
 /*
//        数组的赋值
          int[] arr1=new int[]{2,3,5,7,11,13,17,19};
          int[] arr2=new int[8];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
//        数组的赋值
//        arr2=arr1;

//        实现数组的复制
        arr2=new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i]=arr1[i];
        }


        for (int i = 0; i < arr2.length; i++) {
            if (i%2==0){
                arr2[i]=i;
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();


//        数组的反转
        int[] arr1=new int[]{1,2,3,4,5,6};
        int[] arr2=new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i]=arr1[arr1.length-i-1];
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();


//        数组的反转2
        int[] arr11=new int[]{1,2,3,4,5,6};
        for (int i = 0; i < arr11.length/2; i++) {
            int temp=arr11[i];
            arr11[i]=arr11[arr11.length-i-1];
            arr11[arr11.length-i-1]=temp;
        }
        for (int i = 0; i < arr11.length; i++) {
            System.out.print(arr11[i]+" ");
        }


//     18题   二分查找法
        int[] arr1=new int[]{1,2,3,4,5,6,7,8,9};
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你想要查询的数:");
        int i = sc.nextInt();
        boolean flag=true;

        int min=0;
        int max=arr1.length-1;


        while (min<=max){
            int mid=(min+max)/2;
            if (arr1[mid]==i){
                flag=false;
                System.out.println("这个数是"+arr1[mid]);
                break;
            }

            if (arr1[mid]>i){
                max=mid-1;

            }else{
                min=mid+1;
            }

        }
        if (flag==true){

            System.out.println("没找到");
        }

*/


    }
}
