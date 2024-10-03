import java.util.HashMap;

public class Account {

    TryCatch tryCatch = new TryCatch();
    HashMap<String, User> users = new HashMap();
    HashMap<String, User> admin = new HashMap();
    public void testLäggTill() {
        admin.put("1", new User("Bibliotekarie", "Admin123" ));
        users.put("2", new User("Oliwer", "Lösen"));
        users.put("3", new User("Karolina", "Lösen768"));
        users.put("4", new User("Mergim", "LösenhejHå"));
    }

    //----------------METHODS for user---------------------------------------
    public void createAccount() {
        System.out.println("please enter username");
        String username = tryCatch.tryCatchAccountCreation();
        System.out.println("please enter password");
        String password = tryCatch.tryCatchAccountCreation();
        users.put("5", new User(username, password));
        System.out.println("You have successfully created a new account with username " + username + " and password " + password);
    }

    public void loginCheck() {
        int i = 0;
        boolean p = true;
        while (i < 3 && p == true)  {
            i ++;
            System.out.println("please enter username");
            String usernameToTest = tryCatch.tryCatchAccountCreation();
            System.out.println("please enter password");
            String passwordToTest = tryCatch.tryCatchAccountCreation();
            for (User user : users.values()) {
                if (usernameToTest.equals(user.getUserName()) && passwordToTest.equals(user.getPassword())) {
                    System.out.println("You have successfully logged in!");
                    p = false;


                }
            }
        }
    }

    //--------------METHODS for Lib --------------------------
    public void displayAllUser() { // bara för admin
        for (User user : users.values()) {
            user.displayUserDetails();
        }
    }


}




