import javax.swing.*;

public class LogInPage {
    private JPanel panel1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton cancelButton;
    private JButton logInButton;

    public LogInPage(JFrame myFrame,JFrame logInFrame){
        logInButton.setFocusable(false);
        cancelButton.setFocusable(false);
        logInButton.addActionListener(e->{
            logInFrame.setVisible(false);
            myFrame.setVisible(true);
        });
    }
    public JPanel getLoginPanel(){
        return panel1;
    }
}
