class Bankc{
    private String name;
    private long accountNumber;
    private int pin;
    private int bal=0;

    Bankc(String name, long accountNumber){
        this.name = name;
        this.accountNumber=accountNumber;
    }

    public void setPIN(int pin){
        this.pin = pin;
    }

    public void setBal(int bal){
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public int getPin() {
        return pin;
    }

    public int getBal() {
        return bal;
    }
    

}