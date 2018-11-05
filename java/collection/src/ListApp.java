import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Copyright (C) 2016 rats
 * <p/>
 *
 * @author : rats
 * @version : v1.0
 * @since : 2018/11/5
 */
public class ListApp {

    public static void main(String[] args) {
        
        List<String> arrayList = new ArrayList();
        List<String> linkedList = new LinkedList();

        //大小
        int size =   arrayList.size();

        //清空
        arrayList.clear();

        //添加元素
        arrayList.add("banana");
        arrayList.add("apple");
        arrayList.add(0,"orange");

        //添加集合
        arrayList.addAll(linkedList);

        //获取元素
        String item = arrayList.get(0);

        //删除元素
        arrayList.remove("apple");

        //是否包含
        boolean contains = arrayList.contains("banana");

        //元素位置
        int index = arrayList.indexOf("banana");

        //截取队列
        List<String> subList =  arrayList.subList(0,2);

    }
}
