import java.util.Arrays;

/**
 * Copyright (C) 2016 rats
 * <p/>
 *
 * @author : rats
 * @version : v1.0
 * @since : 2018/11/5
 */
public class ArrayApp {

    public static void main(String[] args) {

        //一维数据
        String[] dayOfWeek = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        int[] numbers = new int[10];

        //二维数组
        int[][] hetu = {
            {4, 9, 2},
            {3, 5, 7},
            {8, 1, 6}
        };

        //获取元素
        String day1 = dayOfWeek[0];

        //长度
        int len = dayOfWeek.length;

        //遍历数组
        for(int i=0;i< dayOfWeek.length;i++){
            System.out.println(dayOfWeek[i]);
        }
        for(String item : dayOfWeek) {
            System.out.println(item);
        }

        //填充数组
        Arrays.fill(numbers,0xff);
        //排序数组
        Arrays.sort(dayOfWeek);
        //查找数组元素
        Arrays.binarySearch(chars,'c');
        //复制数组
         String[] day_1 =  Arrays.copyOf(dayOfWeek,10);
        //复制数组,包括下标from，不包括上标to
        String[] day_2 = Arrays.copyOfRange(dayOfWeek,2,7);
        //复制数组
        String [] newArr = new String[10];
        System.arraycopy(dayOfWeek,2,newArr,2,5);


    }
}
