package learn.how2j.io.practice;

import learn.how2j.io.Hero;

import java.io.*;

/**
 * Created by qqins on 2017/12/11 21:14
 */
public class SerialArray {
    public static void main(String[] args) {
        Hero[] heroes = new Hero[10];
        for (int i = 0; i < heroes.length; i++) {
            heroes[i]=new Hero("hero:"+i);
        }
        File file = new File("d:/111/lola.txt");
        try (FileOutputStream fos=new FileOutputStream(file);
             ObjectOutputStream oos=new ObjectOutputStream(fos);
             FileInputStream fis=new FileInputStream(file);
             ObjectInputStream ois=new ObjectInputStream(fis)){
            oos.writeObject(heroes);
            Hero[] heroes1=(Hero [])ois.readObject();
            for(Hero h:heroes1){
                System.out.println(h.name);
            }
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
