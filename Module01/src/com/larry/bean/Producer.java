package com.larry.bean;

import java.util.ArrayList;

/**
 *
 * @Author: Larry(PC)
 * @Email: zhang_ying@suixingpay.com
 * @phone: 13552892515
 * 创建日期：2019/7/14 21:12
 * @version V1.0
 */
public class Producer extends Person{
    //模板六：prsf
    private static final int count = 10;
    //变形：psf
    public static final Customer customer = new Customer();
    //变形：psfs
    public static final String mation = "chain";

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

        //模板三：fori
        String[] arr = new String[]{"zhangsan","lisi","wangwu"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        for (Object o : list) {
            System.out.println(o);
        }
        //变形：list.fori / list.forr
        //list.fori
        for (int i = 0; i < list.size(); i++) {
        }
        //list.forr 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
        }

        //模板五：ifn
        if (list == null) {
        }
        //变形：inn
        if (list != null) {
        }
        //变形：xxx.nn / xxx.null
        //xxx.nn
        if (list != null) {
        }
        //xxx.null
        if (list == null) {
        }
    }

    class ProducerInfo{
        /*统计数据*/
        private int count;
        private String name;

    }

    public void eat(){
        System.out.println("客户吃饭");
    }
}
