package learn.how2j.io;

import java.io.*;

/**
 * Created by qqins on 2017/12/11 19:30
 */
public class DataStream {
    public static void main(String[] args) {
        File file = new File("d:/111/data.txt");
        write(file);
        read(file);
    }

    public static void write(File file) {
        try (FileOutputStream fos = new FileOutputStream(file);
             DataOutputStream dos = new DataOutputStream(fos)) {
            dos.writeBoolean(true);
            dos.writeInt(666);
            dos.writeUTF("Hai qin");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read(File file) {
        try (FileInputStream fis = new FileInputStream(file);
             DataInputStream dis = new DataInputStream(fis)) {
            boolean b = dis.readBoolean();
            int i = dis.readInt();
            String str = dis.readUTF();
            System.out.println(b);
            System.out.println(i);
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
