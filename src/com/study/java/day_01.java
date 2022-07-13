package com.study.java;

/**
 * Created with IntelliJ IDEA.
 * Description:p90-
 * User: zhao
 * Date: 2022-07-12
 * Time: 18:02
 */
public class day_01 {
    public static void main(String[] args) {
        /*p90-2:定义三个int类型变量并赋值使用三元运算符或者if-else来求三个数中的最大值

         int a=12,b=20,c=5;
      // 三元运算符
         int max1=a>b?a:b;
         int max=max1>c?max1:c;
        System.out.println("最大值为："+max);


        // if-else语句
        if(a>b){
            if(a>c){
                System.out.println("最大值为:"+a);
            }else{
                System.out.println("最大值为:"+c);
            }
        }else{
            if(b>c){
                System.out.println("最大值为:"+b);
            }else{
                System.out.println("最大值为:"+c);
            }
        }



//        p90-3
//        编写程序声明两个double类型变量并赋值，
//        判断第一个数大于10.0，第二个数小于20.0，打印两个数之和，否则打印两个数之差
        double d1=15.2;
        double d2=21.3;
        if (d1>10.0&&d2<20.0){

            System.out.println("两数之和"+(d1+d2));

        }else{
            if (d1>d2){
                System.out.println("两数之差"+(d1-d2));
            }else{
                System.out.println("两数之差"+(d2-d1));

            }
        }


//        交换两个变量值代码的实现
           int num1=20;
           int num2=30;
           int temp=0;
           temp=num1;
           num1=num2;
           num2=temp;
        System.out.println(num1+"    "+num2);


//     p93 如何求一个0~255范围内数字的十六进制的值，如60的十六进制是3c
           int in1=60;
           int in2=in1&15;
           String str1=(in2>9)?(char)(in2-10+'A')+"":in2+"";
           int temp=in1>>>4;
           in2=temp & 15;
           String str2=(in2>9)?(char)(in2-10+'A')+"":in2+"";
        System.out.println(str2+""+str1);
*/

    }
}
