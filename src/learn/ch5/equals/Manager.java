package learn.ch5.equals;

import java.util.Objects;

/**
 * Created by qqins on 2017/9/28 14:03
 */
public class Manager extends Employee {
    private double bonus;
    public Manager(String name,double salary,int year,int month,int day){
        super(name,salary,year,month,day);
        bonus=0;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    @Override
    public double getSalary(){
        return super.getSalary()+this.bonus;
    }
    @Override
    public boolean equals(Object obj){
        if (!super.equals(obj)) {
            return false;
        }
        Manager m=(Manager)obj;
        return Objects.equals(this.bonus, m.bonus);
    }
    @Override
    public int hashCode(){
        return Objects.hash(bonus)+super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString()+"[bonus:"+this.bonus+"]";
    }
}
