package learn.how2j.exception.practice;

/**
 * Created by qqins on 2017/12/3 16:06
 */
public class OverdraftException extends Exception{
    private double deficit;
    public OverdraftException(String msg,double deficit){
        super(msg);
        this.deficit=deficit;
    }
    public double getDeficit(){
        return this.deficit;
    }
}
