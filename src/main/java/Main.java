public class Main {
    public static void main(String[] args) {
        TryCatch tryCatch1 = new TryCatch();
        Account account1 = new Account();
        //----------------------------------------
        account1.testLäggTill();

        System.out.println("hello");
        //tester
        int i = 0;
        while (true && i < 10) {
            System.out.println("Welcome! \nWould you like to login or register a new account? \n1. Login \n2. Register an account \n3. Exit \n4. print users");
            int choice = tryCatch1.tryCatch1();
            switch (choice) { // denna ska göras om, jsut nu bara för testning
                case 1:
                    account1.loginCheck();
                break;
                case 2:
                    account1.createAccount();
                break;
                case 3:
                    System.exit(0); // vil kolalr vad detta är
                return;
                case 4:
                    account1.displayAllUser();
                break;
            }
        }

            System.out.println("Welcome User! \n1. Search for a specific book\n2. Print all book\n3. Lend a book \n4. Return a book");


    }
}
