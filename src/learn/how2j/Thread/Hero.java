package learn.how2j.Thread;

import com.sun.javafx.logging.PulseLogger;

/**
 * Created by qqins on 2017/12/26 9:21
 */
public class Hero {
    public String name;
    public float hp;
    public int damage;

    public synchronized void recover() {
        hp = hp + 10;
        System.out.printf("%s 回血10点，增加血后，%s的血量是%.0f%n",name,name,hp);
        this.notify();
    }

    public synchronized void hurt() {
        if(hp==0){
            try{
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        hp = hp - 10;
        System.out.printf("%s 减血10点，减少血后，%s的血量是%.0f%n",name,name,hp);
    }

    public void attackHero(Hero h) {
       /* try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        h.hp -= damage;
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n", name, h.name, h.name, h.hp);
        if (h.isDead()) {
            System.out.println(h.name + "挂了");
        }
    }

    public boolean isDead() {
        return 0 >= hp ? true : false;
    }
}
