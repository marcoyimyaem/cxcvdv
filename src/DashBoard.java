import javax.swing.*;
import java.awt.*;

public class DashBoard extends JFrame{
    public void setBalanceText(String balanceText) {
        this.balanceText.setText(balanceText);
    }

    private JLabel balanceText;
    private JButton cashInDepositButton;
    private JButton moneyTransferButton;
    private JButton button3;
    private JButton logoutButton;
    private JPanel dashboardPanel;

    public DashBoard() {
        setTitle("BankApp Dashboard");
        setContentPane(dashboardPanel);
        setSize(300,200);
        setVisible(false);

    }
}
