 class MaxDepositAmountException extends Exception{
    public String getMessage(){
        return "The Maximum deposit amount is 10000";
    }
}

class MinDepositAmountException extends Exception{
    public String getMessage(){
        return "The Minimum deposit amount is 1";
    }
}

class MinWithdrawAmountException extends Exception{
    public String getMessage(){
        return "The Minimum withdraw amount is 100";
    }
}

class InvalidAmountException extends Exception{
    public String getMessage(){
        return "The entered amount is more than balance,  insufficient balance";
    }
}

class InvalidAccounntException extends Exception{
    public String getMessage(){
        return "Wrong Account Number";
    }
}

class InvalidOldpinException extends Exception{
    public String getMessage(){
        return "Wrong Old PIN ";
    }
}

class InvalidPinException extends Exception{
    public String getMessage(){
        return "Wrong PIN ";
    }
}
