import java.util.ArrayList;

public class Account {

    TryCatch tryCatch = new TryCatch();
    ArrayList<User> users = new ArrayList<User>();
    ArrayList<User> admin = new ArrayList<>();
    public void testLäggTill() {
        admin.add(new User("Bibliotekarie", "Admin123" ));
        users.add(new User("Oliwer", "Lösen"));
        users.add(new User("Karolina", "Lösen768"));
        users.add(new User("Mergim", "LösenhejHå"));
    }

    //----------------METHODS for user---------------------------------------
    public void createAccount() {
        System.out.println("please enter username");
        String username = tryCatch.tryCatchAccountCreation();
        System.out.println("please enter password");
        String password = tryCatch.tryCatchAccountCreation();
        users.add(new User(username, password));
        System.out.println("You have successfully created a new account with username " + username + " and password " + password);
    }

    public void loginCheck() {
        while (true) {
            System.out.println("please enter username");
            String usernameToTest = tryCatch.tryCatchAccountCreation();
            System.out.println("please enter password");
            String passwordToTest = tryCatch.tryCatchAccountCreation();
            if (true) { // vi måste looopa igenom indexen efter namn och sen skriva nåt som jämför att det stämmer med inmatat.
                System.out.println("You have successfully logged in");
                break; // men ändra till att vi ska komam till meny här ifrån ifall vi lyckas logga in
            } else {
                System.out.println("You have unsuccessfully logged in");
            }
        }
    }

    //--------------METHODS for Lib --------------------------
    public void displayAllUser() { // bara för admin
        for (User user : users) {
            user.displayUserDetails();
        }
    }


}




