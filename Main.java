import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wellcome to the Bank \n");
        System.out.println("Enter the details to create a new bank account: ");
        System.out.println("Enter your name: ");
        
        String name = sc.nextLine();
        System.out.println();
        System.out.println("Enter the account number to be created: ");
        long n=sc.nextLong();
        System.out.println("Create a new PIN: ");
        int pin=sc.nextInt();


        Bankc b=new Bankc(name,n);

        b.setPIN(pin);

    

        BankFactory f=new BankFactory();
        BankInterface bi=f.getObject();

        boolean a=bi.validate(b);
        while(a){
            bi.choice();
            int ch=sc.nextInt();
            if(ch>0){
                switch(ch){
                case 1: bi.deposit(b);
                break;
                case 2: bi.withdraw(b);
                break;
                case 3: bi.checkBalance(b);
                break;
                case 4: bi.updatePin(b);
                break;
                case 5: break;
                default: System.out.println("Invalid option !!! please try again");
                break;
            }
            if(ch==5 || ch>5){
                break;
            }
            }else{
                System.out.println("Invalid option !!! Exiting...");
                break;
            }
        }

        while(!a){
            System.out.println("===Contact the Bank===");
        }

        System.out.println("================================THANK YOU VISIT AGAIN =================================================");

        sc.close();
            
        


        

        
        

    }
}
