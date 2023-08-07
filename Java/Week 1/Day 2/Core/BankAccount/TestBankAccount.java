public class TestBankAccount{
    public static void main(String[] args){

        BanckAccount user1= new BanckAccount(4890,1000);
        

        user1.DepositMoney(500);
        double balance=user1.getBalanceSa();
        System.out.println("your balance saving is "+ balance);
        user1.WithdrawMoney(374.5);
        System.out.println("your balance saving is "+ user1.getBalanceCh());
    }
}