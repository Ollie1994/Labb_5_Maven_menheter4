import java.util.Scanner;

public class TryCatch {

    public int tryCatch1() {
        int choice = 0;
        while (choice <= 0 || choice > 4) {
            try {
                Scanner sc = new Scanner(System.in);
                choice = sc.nextInt();
                if (choice <= 0 || choice > 4) {
                    System.out.println("Wrong input, please choose between numbers 1-4!");
                }
            } catch (Exception e) {
                System.out.println("Wrong input, please choose between numbers 1-4!");
            } finally {

            }
        }
        return choice;
    }
    public String tryCatchAccountCreation() {
        String choice = " ";
        try {
            Scanner sc = new Scanner(System.in);
            choice = sc.nextLine();
        } catch (Exception e) {
            System.out.println("Wrong input, please input correctly");
        } finally {
        }
        return choice;
    }


}
