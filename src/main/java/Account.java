import java.util.HashMap;

public class Account {

    TryCatch tryCatch = new TryCatch();
    HashMap<String, User> users = new HashMap();
    HashMap<String, User> admin = new HashMap();


    //----------------METHODS for user---------------------------------------
    public void createAccount() { // (User user)
        System.out.println("please enter username");
        String username = tryCatch.tryCatchAccountCreation();
        System.out.println("please enter password");
        String password = tryCatch.tryCatchAccountCreation();
        System.out.println("You have successfully created a new account with username " + username + " and password " + password);
        users.put("5", new User(username, password));
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




