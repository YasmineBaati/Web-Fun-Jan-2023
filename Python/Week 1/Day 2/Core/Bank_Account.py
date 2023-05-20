class BankAccount:
     #Attr
    def __init__(self, int_rate, balance): 
        self.interst_rate=int_rate
        self.balance=balance 
    #Methods 
    def deposit(self, amount):
        self.balance+=amount
    def withdraw(self, amount):
         if self.balance >= amount:
            self.balance -= amount
         else:
            print("Insufficient funds: Charging a $5 fee")
            self.balance -= 5
            return self
    def display_account_info(self):
        print("Balance: $" + str(self.balance))
        return self
    def yield_interst(self):
        if self.balance > 0:
           self.balance += (self.balance * self.interst_rate)
           return self
 #Account 1 
account1=BankAccount()
account1.deposit().deposit().deposit().display_account_info()
account1.withdraw().display_account_info()
account1.yield_interest().display_account_info()
#Account 2 
account2=BankAccount()
account2.deposit().deposit().display_account_info()
account2.withdraw().withdraw().withdraw().withdraw(10).display_account_info()
account2.yield_interest(10).display_account_info()
@classmethod
def print_accounts(cls):
        for account in cls.accounts:
            print(f"Balance: {account.balance}")