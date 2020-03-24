package per.gyx;

import java.lang.reflect.InvocationHandler;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList list = new ArrayList<>();
        list.add(1);
        list.add("abc");
        System.out.println(list.get(0).getClass());
        System.out.println(list.get(1).getClass());
        System.out.println(list.getClass());

        Lock lock = new ReentrantLock();
        try {
            lock.lock();
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }


    }

    public static void test() {

    }
}
