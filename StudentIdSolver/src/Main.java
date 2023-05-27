import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public static void main(String[] args)  {
        JFrame myFrame = new JFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(700,900);
        myFrame.setMinimumSize(new Dimension(500,700));
        JPanel form = new detailsForm().getMainPanel();

        myFrame.add(form);
        myFrame.setVisible(true);
    }
}