package learn.how2j.string_learn.using_string;

/**
 * Created by qqins on 2017/11/3 10:22
 */
public class UsingStr {
    public static void firstToUpper(){
        String str = "let there be light";
        String[] spiltStr=str.split(" ");
        String newStr="";
        for (String s:spiltStr){
            char[] c = s.toCharArray();
//            c[0]=(char)(c[0]-32);
            c[0]=Character.toUpperCase(c[0]);
            newStr=newStr+String.valueOf(c)+" ";
        }
        System.out.println(newStr.trim());
    }
    public static void countP(){
        String str = "peter piper picked a peck of pickled pepepers";
        String[] newStr=str.split(" ");
        int count=0;
        for (String s:newStr){
            if(s.charAt(0)=='p')
                count++;
        }
        System.out.println(count);
    }
    public static void upAndLow(){
        String str = "lengendary";
        char[] ch=str.toCharArray();
        for (int i = 0; i < ch.length; i=i+2) {
            ch[i]=Character.toUpperCase(ch[i]);
        }
        System.out.println(String.valueOf(ch));
    }
    public static void lastToUp(){
        String str = "lengendary";
        char[] ch=str.toCharArray();
        ch[ch.length-1]=Character.toUpperCase(ch[ch.length-1]);
        str = String.valueOf(ch);
        System.out.println(str);
    }
    public static void lastTwoToUp(){
        String str = "Nature has given us that two ears," +
                " two eyes, and but one tongue, " +
                "to the end that we should hear and see more than we speak";
        char[] ch=str.toCharArray();
        int index=str.lastIndexOf(" two ");
        ch[index+1] = Character.toUpperCase(ch[index+1]);
        System.out.println(String.valueOf(ch));
    }
    public static void main(String[] args) {
        firstToUpper();
        countP();
        upAndLow();
        lastToUp();
        lastTwoToUp();
    }
}
