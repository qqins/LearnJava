package learn.how2j.io;

import java.io.*;

/**
 * Created by qqins on 2017/12/11 20:15
 */
public class ObjectStream {
    public static void main(String[] args) {
        Hero h=new Hero();
        h.name = "garen";
        h.hp=666;
        File file = new File("d:/111/garen.txt");
        try (FileOutputStream fos=new FileOutputStream(file);
             ObjectOutputStream oos=new ObjectOutputStream(fos);
             FileInputStream fis=new FileInputStream(file);
             ObjectInputStream ois=new ObjectInputStream(fis)){
            oos.writeObject(h);
            Hero h2=(Hero) ois.readObject();
            System.out.println(h2.name);
            System.out.println(h2.hp);
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
