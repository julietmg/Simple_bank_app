public class Main {

public static void main (String args []) {

    Bank bank = new Bank (); // Stworzy bank, który będzie zawierał informacje na temat klientów
    
    boolean finished = false; 
    while (! finished) {
        

        System.out.println("Wybierz jedną z opcji: ");

       System.out.println("0. Zakończ");
      System.out.println("1. Dodaj konto");
     System.out.println("2. Wpłata");

        String input = System.console().readLine();

        if (input.length() != 1) {
            System.out.println("Ta opcja jest niedozwolona: " + input);
            continue; // dzięki temu wracamy na początek pętli i uytkownik 
            // moze jeszcze raz kliknac 
        }

        switch (input.charAt(0)) {
            case '0': {
                finished = true;
                break;
            }


            case'1': {

            
                

                int account = bank.addNewAccount(); 

                System.out.println("Nowy numer konta: " + account);

                break;
               
                
            }

            case'2': {
                
                


                break;
            }

            default: {
                System.out.println("Niedozwolona opcja: " + input);
                continue;
            }
        }
    }





}

}