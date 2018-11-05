import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Copyright (C) 2016 rats
 * <p/>
 *
 * @author : rats
 * @version : v1.0
 * @since : 2018/11/5
 */
public class QueueApp {

    public static void main(String[] args) {

        //创建队列
        ArrayDeque<String> queue = new ArrayDeque<>(10);
        queue.addFirst("banana");
        queue.addLast("apple");


        // 添加一个元素到队尾
        queue.push("book");
        //添加一个元素到队尾，如果队列已满，则返回false
        queue.offer("mongo");
        //添加一个元素到队尾，如果队列已满，则抛出一个IIIegaISlabEepeplian异常
        queue.add("cap");


        //从队列头部弹出元素，如果队列为空，则返回null
        String elem = queue.poll();
        //从队列头部弹出元素，如果队列为空，则返回null
        elem = queue.pop();
        //从队列头部弹出元素，如果队列为空，则抛出一个NoSuchElementException
        elem = queue.remove();

        //返回队列头部的元素, 如果队列为空，则返回null
        elem = queue.peek();
        //返回队列头部的元素, 如果队列为空，则抛出一个NoSuchElementException异常
        elem = queue.peek();

    }
}
