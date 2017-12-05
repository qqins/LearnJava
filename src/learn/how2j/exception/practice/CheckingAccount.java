package learn.how2j.exception.practice;

/**
 * Created by qqins on 2017/12/3 16:17
 */
public class CheckingAccount extends Account{
    private double overdraftProtection;
    public CheckingAccount(double balance){
        super(balance);
    }
    public CheckingAccount(double balance,double overdraftProtection){
        this(balance);
        this.overdraftProtection=overdraftProtection;
    }

    public double getOverdraftProtection() {
        return overdraftProtection;
    }

    @Override
    public void withdraw(double amt) throws OverdraftException {
        if(amt>overdraftProtection+this.balance){
            throw new OverdraftException("余额不足",amt-overdraftProtection-this.balance);
        }else {
            this.balance=this.balance-amt;
        }
    }

    public static void main(String[] args) {
        CheckingAccount ca = new CheckingAccount(1000, 1000);
        System.out.println(ca.getBalance());
        System.out.println(ca.getOverdraftProtection());
        try {
            ca.withdraw(3000);
        }catch (OverdraftException e){
            System.out.println("还需"+e.getDeficit());
            e.printStackTrace();
        }
    }
}
