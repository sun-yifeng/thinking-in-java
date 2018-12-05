package com.sunyf.tij.ch07.review2;

/**
 * @program: thinking-in-java
 * @description:
 * @author: sunyf
 * @create: 2018-12-04 18:10
 **/
public class Main {

    // 反转数字，并且去掉重复的数字
    public static int uniqueNumber(int num) {
        // 转换成为字符串
        String str = String.valueOf(num);
        // 去重后的字符串
        StringBuffer buffer = new StringBuffer();
        // 倒序遍历字符串
        for (int i = str.length() - 1; i >= 0; i--) {
            char rightChar = str.charAt(i);
            // 标志位：是否有重复
            boolean isRepeated = false;
            // 倒序后的字符串中是否有重复的
            for (int j = 0; j < buffer.length(); j++) {
                if (rightChar == buffer.charAt(j)) {
                    isRepeated = true;
                    break;
                }
            }
            // 无重复则追加
            if (!isRepeated) {
                buffer.append(rightChar);
            }
        }
        // 返回数字
        return Integer.valueOf(buffer.toString());
    }

    public static void main(String[] args) {
        int num = 98776673;
        System.out.println(uniqueNumber(num));
    }

}
