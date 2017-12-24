package learn.how2j.io;

import java.io.Serializable;

/**
 * Created by qqins on 2017/12/11 20:16
 */
public class Hero implements Serializable {
    public Hero(String name){
        this.name=name;
    }
    public Hero(){

    }
    private static final long serialVersionUID=1L;
    public String name;
    public float hp;
}
