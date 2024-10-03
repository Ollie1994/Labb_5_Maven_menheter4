public class User {
    private String userName;
    private String password;
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    //--------------- METHODS ------------------------------------
    //Meny
    //sök på bok
    //visa upp alla böcker/tillgängliga böcker
    //se lista på lånade böcker vid login och hur lång tid man har kvar på dem
    //



    public void displayUserDetails() {
        System.out.println("UserName: " + getUserName() + "\nPassword: " + getPassword());
        System.out.println();
    }


    //------------ G & S -----------------------------------------------
    public String getUserName() {return userName;}
    public String getPassword() {return password;}


}
