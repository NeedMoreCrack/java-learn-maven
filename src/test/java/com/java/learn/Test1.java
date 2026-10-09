package com.java.learn;

import org.junit.jupiter.api.Test;

public class Test1 {
    @Test
    public void test(){
        int count = 0;
        int x = count++;

        System.out.println("x: "+x);     // 0：取得加一前的值
        System.out.println("count: "+count); // 1：變數本身已經加一
    }
}
