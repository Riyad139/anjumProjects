import javax.swing.*;
import java.awt.*;

public class IDCard extends JFrame {
    private JPanel panel1;
    private JLabel name;
    private JLabel dept;
    private JLabel issueOn;
    private JLabel ExpiresOn;
    private JLabel id;
    private JLabel bloodGrp;
    private JLabel number;

    public IDCard(String name,String Id,String Dept,
                  String Mobile,String bloodGrp,
                  String expiresOn,String issueOn){
        JFrame IDCardFrame = new JFrame();
        IDCardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        IDCardFrame.setSize(400,500);
        IDCardFrame.setMinimumSize(new Dimension(300,300));

        this.name.setText(name);
        this.id.setText(Id);
        this.dept.setText(Dept);
        this.bloodGrp.setText("Blood group: "+bloodGrp);
        this.ExpiresOn.setText("Expires on: "+expiresOn);
        this.issueOn.setText("Issue on: "+issueOn);
        this.number.setText("Mobile: "+Mobile);

        IDCardFrame.add(panel1);
        IDCardFrame.setVisible(true);
    }


}
