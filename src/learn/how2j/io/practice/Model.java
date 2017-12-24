package learn.how2j.io.practice;

import java.io.*;
import java.util.Scanner;

/**
 * Created by qqins on 2017/12/11 21:29
 */
public class Model {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入类名：");
        String className = in.nextLine();
        System.out.println("请输入属性的类型：");
        String type = in.nextLine();
        System.out.println("请输入属性的名称");
        String property = in.nextLine();
        String Uproperty = toUpperFirstLetter(property);

        File file = new File("d:/111/Model.txt");
        String modelStr = null;
        try (FileReader fr = new FileReader(file)) {
            char[] ch = new char[(int) file.length()];
            fr.read(ch);
            modelStr = new String(ch);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String javaStr = modelStr.replaceAll("@class@", className);
        javaStr = javaStr.replaceAll("@type@", type);
        javaStr = javaStr.replaceAll("@property@", property);
        javaStr = javaStr.replaceAll("@Uproperty@", Uproperty);
        System.out.println(javaStr);
        String javaName = className + ".java";
        File javaFile = new File("d:/111/" + javaName);
        try (FileWriter fw = new FileWriter(javaFile);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.write(javaStr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String toUpperFirstLetter(String str) {
        char c = Character.toUpperCase(str.charAt(0));
        String s = str.substring(1);
        return c + s;
    }
}
