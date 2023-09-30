import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    private static int userId;
    private int userPin;

    public Login(int userId) {
        this.userId = userId;
    }
    public Login() {

    }

    public static void main(String[] args) {
        int id = 0,pin= 0;
        Scanner input = new Scanner(System.in);
        Login userSession = new Login();
                System.out.println("Enter ID:");
        id = input.nextInt();
        System.out.println("Enter pin:");
        pin = input.nextInt();
        if(checkIfLog(id,pin)!=null)
            userSession = new Login(id);
        System.out.println(userSession.getUserId());
    }

    public static Accounts checkIfLog( int id, int pin) {
        ArrayList<Accounts> users= Main.getUsers();
        Accounts userFound = null;


        for(Accounts user:users){
            if(user.getId()==id && user.getPin() == pin)
                userFound=user;
        }

        return userFound;
    }

    public static int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserPin() {
        return userPin;
    }

    public void setUserPin(int userPin) {
        this.userPin = userPin;
    }
}
