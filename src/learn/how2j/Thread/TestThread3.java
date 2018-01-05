package learn.how2j.Thread;

/**
 * Created by qqins on 2018/1/4 15:52
 */
public class TestThread3 {
    public static void main(String[] args) {
        final Hero garren=new Hero();
        garren.name = "盖伦";
        garren.hp=600;
        Thread t1=new Thread(){
            public void run(){
                while (true){
                    /*while (garren.hp==0){
                        continue;
                    }*/
                    garren.hurt();
//                    System.out.printf("t1 为%s 减血1点，减少血后，%s的血量是%.0f%n",garren.name,garren.name,garren.hp);
                    try{
                        Thread.sleep(10);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        };
        t1.start();
        Thread t2=new Thread(){
            public void run(){
                while (true){
                    garren.recover();
//                    System.out.printf("t2 为%s 回血1点，增加血后，%s的血量是%.0f%n",garren.name,garren.name,garren.hp);
                    try{
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        };
        t2.start();
    }
}
