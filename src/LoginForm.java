import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class LoginForm extends JFrame {
    public static void main(String[] args) {
        LoginForm lf = new LoginForm();
//        Login login = new Login();


    }
    private JPanel mainLoginPanel;
    private JTextField enterYourAccountIDTextField;
    private JPasswordField passwordField1;

    public LoginForm()  {
        setContentPane(mainLoginPanel);
        setSize(300,200);
        setVisible(true);
        setTitle("Sign in to BankApp");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Login.checkIfLog(Integer.parseInt(enterYourAccountIDTextField.getText()),Integer.parseInt(passwordField1.getText()))!=null)
                 new Login(Integer.parseInt(enterYourAccountIDTextField.getText()));
                System.out.println(Login.getUserId());
            }
        });
    }

    private JButton loginButton;
}
