import  javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    private JLabel lbl1;
    private JButton btn1;
    private JLabel lbl2;
    private JButton btn2;

    public Window(){
        setLayout(new FlowLayout());
        lbl1 = new JLabel("");
        add(lbl1);
        btn1 = new JButton("Click on me!");
        add(btn1);
        EventHandling eventHandling = new EventHandling();
        btn1.addActionListener(eventHandling);

        btn2 = new JButton("Close btn");
        add(btn2);
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
   }

    public class EventHandling implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            //lbl1.setText("To see some changes, please push the button! ");
            String text = lbl1.getText();
            lbl1.setText(text + text.length());
        }
    }
}
