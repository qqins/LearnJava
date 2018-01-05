package learn.how2j.Thread;

import com.sun.xml.internal.ws.encoding.soap.streaming.SOAPNamespaceConstants;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.io.ObjectInputStream;

/**
 * Created by qqins on 2018/1/3 9:45
 */
public class TestThread1 {
    public static void main(String[] args) {
        /*Thread t1 = new Thread() {
            public void run() {
                int seconds = 0;
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.printf("已经玩了LOL %d 秒 %n", seconds++);
                }
            }
        };
        t1.setDaemon(true);
        t1.start();*/
        final Object someObject=new Object();
        final Hero gareen=new Hero();
        gareen.name = "盖伦";
        gareen.hp=10000;
        System.out.printf("盖伦的初始血量为 %.0f%n",gareen.hp);
        int n=10000;
        Thread[] addThreads = new Thread[n];
        Thread[] reduceThreads = new Thread[n];
        for (int i = 0; i < n; i++) {
            Thread t=new Thread(){
                public void run(){
                    synchronized (gareen) {
                        gareen.recover();
                    }
                    try{
                        Thread.sleep(1);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            };
            t.start();
            addThreads[i]=t;
        }
        for (int i = 0; i < n; i++) {
            Thread t=new Thread(){
              public void run(){

                      gareen.hurt();

                  try {
                      Thread.sleep(1);
                  }catch (InterruptedException e){
                      e.printStackTrace();
                  }
              }
            };
            t.start();
            reduceThreads[i]=t;
        }
        for(Thread t:addThreads){
            try{
                t.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        for (Thread t:reduceThreads){
            try {
                t.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.printf("%d 个增加线程和 %d 个减少线程结束后 %n 盖伦的血量变成了 %.0f%n",n,n,gareen.hp);
    }
}
