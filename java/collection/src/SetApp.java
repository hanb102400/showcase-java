import java.util.HashSet;
import java.util.Set;

/**
 * Copyright (C) 2016 rats
 * <p/>
 *
 * @author : rats
 * @version : v1.0
 * @since : 2018/11/5
 */
public class SetApp {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        //添加元素
        set.add("12");
        set.add("11");
        set.add("13");
        set.add("12");
        set.add("14");
        set.add("15");
        set.add("12");
        set.add("12");


        //集合大小
        int size = set.size();
        System.out.println("set size:"+size);

        //删除元素
        set.remove(15);

        //是否包含
        boolean contains = set.contains("13");
    }
}
