package com.larry.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Customer extends Person{
    //主方法
    public static void main(String[] str){
        System.out.println("hello world !");
        int sum = 0;
        for(int i = 0; i <= 100; i++){
            sum =  sum + i;
            System.out.println("hello world !" + i );
        }
        List<String> list = new ArrayList<>();
        list.add("11");
        list.add("12");
        list.add("13");
        list.add("14");

        list.stream().forEach(temp -> {
            System.out.println("=======" + temp);

        });
        System.out.println("sum ======================================================================= " + sum );
        Map map = new HashMap<>();
        map.put("1","111");
        map.put("2","222");
        map.put("3","333");
        Producer producer = new Producer();
    }

    /**
     * 方法
     * @param count
     */
    public void method(int count){
        System.out.println(count);
    }

    public void eat(){
        System.out.println("客户吃饭");
    }
}
