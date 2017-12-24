package learn.how2j.io.practice;

import java.io.*;

/**
 * Created by qqins on 2017/12/11 19:11
 */
public class RemoveComments {
    public static void main(String[] args) {
        File file = new File("d:/111/LOL.exe");
        remove(file);
    }

    private static void remove(File file) {
        StringBuffer sb = new StringBuffer();
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr);) {
            while (true) {
                String line = br.readLine();
                if (line == null)
                    break;
                if (!line.trim().startsWith("//")) {
                    sb.append(line).append("\r\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter fw = new FileWriter(file);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
