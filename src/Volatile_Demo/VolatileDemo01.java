package Volatile_Demo;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/7
 */
public class VolatileDemo01 {


    public static void main(String[] args) {
        MyThread01 myThread01 = new MyThread01();
        myThread01.start();
        ReentrantLock lock  = new ReentrantLock();

        while (true) {
            lock.lock();
                if (myThread01.isFlag()) {
                    System.out.println("主函数执行··· flag = " + myThread01.flag);
            }lock.unlock();
        }

    }

    static class MyThread01 extends Thread{
        private volatile boolean flag = false;

        @Override
        public void run() {

            try {
                Thread.sleep(20);
                flag = true;
                System.out.println("flag = " + flag);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        public boolean isFlag() {
            return flag;
        }

        public void setFlag(boolean flag) {
            this.flag = flag;
        }
    }
}
