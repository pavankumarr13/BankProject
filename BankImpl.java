import java.util.Scanner;

public class BankImpl implements BankInterface {
    Scanner sc =new Scanner(System.in);

    @Override
    public void checkBalance(Bankc b) {
        System.out.println("\nAccount Holder Name: " + b.getName());
        System.out.println("Account Number     : " + b.getAccountNumber());
        System.out.println("\nBalance            : "+b.getBal());
        System.out.println();
    }

    @Override
    public void choice() {
        System.out.println("Enter your choice");
        System.out.println("1.Deposit Amount");
        System.out.println("2.Withdraw Amount");
        System.out.println("3.Check Balance");
        System.out.println("4.Update PIN");
        System.out.println("5.Exit");
    }

    @Override
    public void deposit(Bankc b) {
        System.out.println("Enter the amount to deposit");
        int amt=sc.nextInt();
        try {
            if(amt>10000){
                throw new MaxDepositAmountException();
            }
            else if(amt<1){
                throw new MinDepositAmountException();
            }
            else{
                int a=amt+b.getBal();
                b.setBal(a);
            }
        }
        catch(MaxDepositAmountException e){
            System.out.println(e.getMessage());
        }
        catch(MinDepositAmountException e){
            System.out.println(e.getMessage());
        }
        
    }

    @Override
    public void updatePin(Bankc b) {
        System.out.println("Enter the account number");
        long acNum=sc.nextLong();
        if(acNum==b.getAccountNumber()){
            System.out.println("Enter the old pin");
            int oldPin=sc.nextInt();
            if(oldPin==b.getPin()){
                System.out.println("Enter the new pin");
                int newPin=sc.nextInt();
                b.setPIN(newPin);
                validate(b);
            }else{
                try {
                throw new InvalidOldpinException();
                } catch (InvalidOldpinException e) {
                    System.out.println(e.getMessage());
                }
            }
        }else{
            try {
                throw new InvalidAccounntException();
            } catch(InvalidAccounntException e) {
                System.out.println(e.getMessage());
            }
        }

        
        }
        

    


    @Override
    public boolean validate(Bankc b) {
        boolean a= false;
        int count=3;
        while(count>0){
            System.out.println("Enter the PIN");
            int pin=sc.nextInt();
            if(pin==b.getPin()){
                a=true;
                break;
            }
            else{
                try{
                    count--;
                    throw new InvalidPinException();
                }
                catch(InvalidPinException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        return a;


    }
            
        
        
        
    

    @Override
    public void withdraw(Bankc b) {
        System.out.println("Enter the amount to withdraw");
        int amount = sc.nextInt();
        try {
            if (amount < 100) {
                throw new MinWithdrawAmountException();
                
            }
            else if (amount>b.getBal()) {
                throw new InvalidAmountException();
                
            }
            else{
                int a = b.getBal()-amount;
                b.setBal(a);
            }
        
            }
        catch(MinWithdrawAmountException e){
              System.out.println(e.getMessage());
            }
        catch(InvalidAmountException e){
        System.out.println(e.getMessage()); 
            }
        }

    
    
    }
