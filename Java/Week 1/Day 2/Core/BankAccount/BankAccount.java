import java.util.Random;
public class BanckAccount {

    private double balanceCh;
    private double balanceSa;
    private String AccountNum;
    private static int AccountCount=0;
    private static double AmountMoney=0;

    private String NumberOfAccount(){
        Random random= new Random();
        long randomNumber = 1000000000L + random.nextLong(9999999999L);
        String randomString = Long.toString(randomNumber);
        return randomString;
    }


    public BanckAccount(double balanceCh,double balanceSa){
        this.balanceCh=balanceCh;
        this.balanceSa=balanceSa;
        this.AccountCount++;
        this.AmountMoney+=(balanceCh+balanceSa);
        this.AccountNum=NumberOfAccount();
    }


    public void DepositMoney(double balance){

        System.out.println("Please chose between cheking account or saving  1/2");
        String choice = System.console().readLine();
        // while ( !choice.equals("1") && !choice.equals("2")){
        //         System.out.println("Please chose 1 if cheking account or 2 if saving account ");
        // }

        // choice = System.console().readLine();

        if(choice.equals("1")){ 
            this.balanceCh+=balance;
        }else{
            this.balanceSa+=balance;
        }
        this.AmountMoney+=balance;

    }

    public void WithdrawMoney(double balance){

        System.out.println("Please chose between cheking account or saving  1/2");
        String choice = System.console().readLine();
        // while ( !choice.equals("1") || !choice.equals("2")){
        //         System.out.println("Please chose 1 if cheking account or 2 if saving account ");
        // }

        // choice = System.console().readLine();

        if(choice.equals("1")){
            this.balanceCh-=balance;
        }else{
            this.balanceSa-=balance;
        }
        this.AmountMoney-=balance;
    }
        


    // Getters && Setters
    public double getBalanceCh(){
        return this.balanceCh;
    }
    public double setBalanceCh(double balance){
        return this.balanceCh+=balance;
    }
    public double getBalanceSa(){
        return this.balanceSa;
    }
    public double setBalanceSa(double balance){
        return this.balanceSa+=balance;
    }
    public double getAmountMoney(){
        return this.AmountMoney;
    }
    
}