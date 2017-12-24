package learn.how2j.io.practice;

import java.io.*;
import java.util.Arrays;

/**
 * Created by qqins on 2017/12/11 19:54
 */
public class ExtractData {
    public static void main(String[] args) {
        File file = new File("d:/111/data.txt");
//        bufferStream(file);
        dataStream(file);
    }

    public static void bufferStream(File file) {
        try (FileOutputStream fos = new FileOutputStream(file);
             PrintWriter pw = new PrintWriter(fos)) {
            pw.write("66@88");
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
            while (true) {
                String str = br.readLine();
                if (str == null)
                    break;
                String[] s = str.split("@");
                System.out.println(Arrays.toString(s));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void dataStream(File file) {
        try (FileOutputStream fos = new FileOutputStream(file);
             DataOutputStream dos = new DataOutputStream(fos)) {
            dos.writeInt(33);
            dos.writeInt(44);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileInputStream fis = new FileInputStream(file);
             DataInputStream dis = new DataInputStream(fis)) {
            System.out.println(dis.readInt());
            System.out.println(dis.readInt());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
