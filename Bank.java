public class Bank {

    int[] balance;
    int nextFreeAccount;

    public Bank() {
        this.balance = new int[1000]; // Bank będzie pamiętał 1000 kont
        this.nextFreeAccount = 0;

    }

    public int addNewAccount() {

        int newAccountNumber = this.nextFreeAccount;
        this.nextFreeAccount = nextFreeAccount + 1;
        this.balance[newAccountNumber] = 0;

        return newAccountNumber;

    }


    public boolean isCorrectAccountNumber (int number) {
        if (number <0 || number >= nextFreeAccount) {
            return false;
        }

        return true; 
    }

    public int addMoney() {


        System.out.println("Jaką kwotę chcesz wpłacić?");

        int amount = Integer.parseInt(System.console().readLine()); 

                
        int newBalance = this.balance[] + amount; 
    }
}
