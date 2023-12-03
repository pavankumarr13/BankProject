public class BankFactory {
    public BankInterface getObject(){
        return new BankImpl();
    }
}
