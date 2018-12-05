package com.sunyf.tij.ch07.review1;

public class Main {

    // 反转字符串
    public static String reverse(String str) {
        StringBuffer buffer = new StringBuffer();
        for (int i = str.length() -1; i >=0 ; i--) {
            buffer.append(str.charAt(i));
        }
        return buffer.toString();
    }

    public static void main(String[] args) {
        String str =  reverse("abcde");
        System.out.println(str);
    }

}
