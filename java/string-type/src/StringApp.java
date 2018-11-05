/**
 * Copyright (C) 2016 rats
 * <p/>
 *
 * @author : rats
 * @version : v1.0
 * @since : 2018/11/5
 */
public class StringApp {

    public static void main(String[] args) {

        //创建字符串
        String str_a = "hello";

        StringBuffer sb_a = new StringBuffer(str_a);
        sb_a.append("world");
        sb_a.append("!");
        String str_b = sb_a.toString();

        StringBuilder sb_b = new StringBuilder(str_a);
        sb_b.insert(0,"world");
        sb_b.append("!");
        String str_c = sb_b.toString();

        //字符串相等比较
        boolean equal = str_a.equals(str_b);
        System.out.println(str_a);

        //字符串相等比较，忽略大小写
        boolean equal_b = str_a.equalsIgnoreCase(str_b);

        //长度
        int len = str_a.length();

        //是否以某字符串开始
        boolean starts = str_a.startsWith("/");
        //是否以某字符串结束
        boolean ends = str_a.endsWith("/");
        //是否包含
        boolean contains = str_a.contains("hello");
        //判断某个字符或字符串在字符串的位置
        int index = str_a.indexOf("a");
        //判断某个字符或字符串在字符串的最后一个位置
        int lastIndex = str_a.lastIndexOf("a");
        //比较字符串大小
        int compare = str_a.compareTo("main0");

        //转为大写
        str_a.toUpperCase();
        //转为小写
        str_a.toLowerCase();
        //:删除头尾空格
        str_a.trim();

        //分割
        String[] split = str_a.split(",");
        //拼接
        String concat = str_a.concat(str_b);
        //截取
        String str_1  = str_a.substring(2);
        String str_2  = str_a.substring(2,4);
        //:替换
        String str_3 = str_a.replace("ob", "op");
        String str_4 = str_a.replaceAll("ob", "op");
        String str_5 = str_a.replaceFirst("ob", "op");
    }
}
