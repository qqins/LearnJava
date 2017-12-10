package learn.how2j.io;

import java.io.*;

/**
 * Created by qqins on 2017/12/10 21:51
 */
public class TestStream {
    public static void main(String[] args) {
        File file = new File("d:/111/lol.txt");
        try (FileWriter fw = new FileWriter(file);BufferedWriter bw=new BufferedWriter(fw) /*printwriter pw = new printwriter(fw)*/) {
            /*pw.println("qin");
            pw.flush();
            pw.println("sheng");
            pw.flush();
            pw.println("shuai");
            pw.flush();*/
            bw.write("qin");
            bw.newLine();
            bw.write("sheng");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)) {
            while (true) {
                String str = br.readLine();
                if (str != null)
                    System.out.println(str);
                else
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
