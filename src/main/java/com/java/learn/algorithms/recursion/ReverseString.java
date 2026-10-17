package com.java.learn.algorithms.recursion;

public class ReverseString {
    public static void main(String[] args) {
        reverse("ab",0);
    }

    public static void reverse(String str,int count) {
        if(str.length() == count){
            return;
        }
        reverse(str, count+1);
        System.out.print(str.charAt(count));
    }
}
