import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public static void main(String[] args)  {
        //// frame for main panel
        JFrame myFrame = new JFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(700,900);
        myFrame.setMinimumSize(new Dimension(500,700));
        myFrame.setVisible(false);
        //////////////

        ///frame for welcome///

        JFrame welcomeFrame = new JFrame();
        welcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        welcomeFrame.setSize(700,900);
        welcomeFrame.setMinimumSize(new Dimension(500,700));
        ///////////////////////////////////////////////////////////

        /////// frame for log in ////////////////
        JFrame logInFrame = new JFrame();
        logInFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logInFrame.setSize(700,900);
        logInFrame.setMinimumSize(new Dimension(500,700));
        myFrame.setVisible(false);
        //////////////////////////////





        JPanel form = new detailsForm(myFrame).getMainPanel();
        JPanel logInPage = new LogInPage(myFrame,logInFrame).getLoginPanel();
        JPanel welcome = new WelcomePage(logInFrame,welcomeFrame).getWelcomePanel();
        myFrame.add(form);
        welcomeFrame.add(welcome);
        logInFrame.add(logInPage);

        welcomeFrame.setVisible(true);

    }
}