import java.util.ArrayList;

public class Main {
    public static ArrayList<Accounts> getUsers() {
        ArrayList<Accounts> users = new ArrayList<>();
        users.add(new Accounts(1001,1349,"Marc Yim","marcy@gmail.com",2000));
        users.add(new Accounts(1231,6730,"John Doe","jodoe@gmail.com",232000));
        users.add(new Accounts(5235,2786,"Jane Doe","jadoe@gmail.com",7642000));
        return users;
    }
    public static Accounts currentUser(int id){
        Accounts currentUser = null;
        for(Accounts userFound:getUsers())
            if(userFound.getId() == id)
                currentUser = userFound;
        return currentUser;
    }
    public static void main(String[] args)
    {
        LoginForm lf = new LoginForm();

        DashBoard dashBoard = new DashBoard();
//        if(!lf.isVisible()){
//            dashBoard.setBalanceText(String.valueOf(currentUser(lf.getUserID()).getBalance()));
//        }
    }
}