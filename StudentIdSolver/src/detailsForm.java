import javax.swing.*;
import java.awt.*;

public class detailsForm {
    private JTextField name;
    private JTextField Id;
    private JTextField Dept;
    private JTextField Mobile;
    private JTextField Blood;
    private JTextField issue;
    private JTextField expire;
    private JTextArea error;
    private JButton submitButton;
    private JPanel MainPanel;
    private JLabel feedBack;

    public detailsForm(JFrame frame){

       this.submitButton.setFocusable(false);
       handler(frame);

       this.feedBack.setVisible(false);
    }

    public JPanel getMainPanel(){
       return this.MainPanel;
    }

    private void handler(JFrame frame){
       submitButton.addActionListener(e->{

           if(this.name.getText().length() == 0 || this.Id.getText().length() == 0 || this.Dept.getText().length() == 0 || this.Blood.getText().length() == 0 || this.issue.getText().length() == 0
           || this.expire.getText().length() == 0 || this.error.getText().length() == 0 || this.Mobile.getText().length() == 0
           ) {
               this.feedBack.setText("Input field must contain some data !");
               this.feedBack.setFont(new Font("Inter",Font.PLAIN,16));
               this.feedBack.setForeground(Color.RED);
               this.feedBack.setVisible(true);
               return;
           }


           this.feedBack.setText("Your information has been accepted successfully");
           this.feedBack.setFont(new Font("Inter",Font.PLAIN,16));
           this.feedBack.setForeground(new Color(0x379956));
           DataModels dataModels = new DataModels();
           dataModels.addData(this.name.getText(),this.Id.getText(),this.Dept.getText(),this.Mobile.getText(),this.Blood.getText(),this.expire.getText(),this.issue.getText(),this.error.getText());
           new IDCard(this.name.getText(),this.Id.getText(),this.Dept.getText(),this.Mobile.getText(),this.Blood.getText(),this.expire.getText(),this.issue.getText());
           frame.setVisible(false);
           this.feedBack.setVisible(true);
       });
    }

}
