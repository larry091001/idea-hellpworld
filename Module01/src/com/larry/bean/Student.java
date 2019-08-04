package com.larry.bean;

/**
 * @version V1.0
 * @Author: Larry(PC)
 * @Email: zhang_ying@suixingpay.com
 * @phone: 13552892515
 * 创建日期：2019/7/17 19:14
 */
public class Student extends Person{
    //模板一：psvm（main）
    public static void main(String[] args) {
        //模板二：sout
        System.out.println("hello !");
        //变形：soutp / soutm / soutv / xxx.sout
        //soutp
        System.out.println("args = [" + args + "]");
        //soutm
        System.out.println("Student.main");
        int num = 10;
        //soutv
        System.out.println("num = " + num);
        int num1 = 10;
        //xxx.sout
        System.out.println(num1);

    }
}

