import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Copyright (C) 2016 rats
 * <p/>
 *
 * @author : rats
 * @version : v1.0
 * @since : 2018/11/5
 */
public class MapApp {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(10);

        //添加元素
        map.put("gy", "qlyyd");
        map.put("zf", "zbsm");
        map.put("lb", "sgj");


        //集合大小
        map.size();

        //获取元素
        String item = map.get("lb");

        //删除元素
        map.remove("zf");


        //根据entrySet遍历
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key:" + entry.getKey() + ",value:" + entry.getValue());
        }

        //根据keySet遍历
        for (String  key : map.keySet()) {
            System.out.println("key:" +key + ",value" + map.get(key));
        }

    }
}
