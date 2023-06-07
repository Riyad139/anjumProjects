import javax.swing.*;

public class WelcomePage {
    private JPanel panel1;
    private JButton logInToApplyButton;

    WelcomePage(JFrame frame,JFrame welcomeFrame){
        this.logInToApplyButton.setFocusable(false);

        this.logInToApplyButton.addActionListener(e->{
            welcomeFrame.setVisible(false);
            frame.setVisible(true);
        });
    }
    public JPanel getWelcomePanel(){
        return this.panel1;
    }
}
