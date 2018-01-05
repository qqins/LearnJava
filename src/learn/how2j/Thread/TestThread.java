package learn.how2j.Thread;

/**
 * Created by qqins on 2017/12/26 9:28
 */
public class TestThread {
    public static void main(String[] args) {
        final Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 616;
        gareen.damage = 1;

        final Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 300;
        teemo.damage = 1;

        final Hero bh = new Hero();
        bh.name = "赏金猎人";
        bh.hp = 500;
        bh.damage = 1;

        final Hero leesin = new Hero();
        leesin.name = "李青";
        leesin.hp = 455;
        leesin.damage = 1;

        /*while (!teemo.isDead()) {
            gareen.attackHero(teemo);
        }

        while (!leesin.isDead()) {
            bh.attackHero(leesin);
        }*/

        /*KillThread killThread1 = new KillThread(gareen, teemo);
        killThread1.start();
        KillThread killThread2 = new KillThread(bh, leesin);
        killThread2.start();*/

        /*Battle battle1 = new Battle(gareen, teemo);
        new Thread(battle1).start();
        Battle battle2 = new Battle(bh, leesin);
        new Thread(battle2).start();*/

        /*Thread t1 = new Thread() {
            public void run() {
                while (!teemo.isDead()) {
                    gareen.attackHero(teemo);
                }
            }
        };
        t1.start();

        Thread t2 = new Thread() {
            public void run() {
                while (!leesin.isDead()) {
                    bh.attackHero(leesin);
                }
            }
        };
        t2.start();*/

        Thread t1 = new Thread() {
            public void run() {
                while (!teemo.isDead()) {
                    gareen.attackHero(teemo);
                }
            }
        };
        /*t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        Thread t2 = new Thread() {
            public void run() {
                while (!leesin.isDead()) {
                    Thread.yield();
                    bh.attackHero(leesin);
                }
            }
        };
        t1.setPriority(5);
        t2.setPriority(5);
        t1.start();
        t2.start();
        /*t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();*/
    }
}
