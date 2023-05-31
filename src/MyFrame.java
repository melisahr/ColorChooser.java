import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Pick a Color");
        button.addActionListener(this);

        label = new JLabel();
        label.setBackground(Color.white);
        //We add text and a font
        label.setText("Enter text :D");
        label.setFont(new Font("Verdana", Font.PLAIN,80));
        label.setOpaque(true);

        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            JColorChooser colorChooser = new JColorChooser();
            //Dialog box
            Color color = JColorChooser.showDialog(null, "Pick a Color", Color.BLACK);
            //Implements the change of the color to the text
            label.setForeground(color);
        }
    }
}
