import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI2{

    private JFrame frame;
    
    // Argumented constructor
    public GUI2(int width, int height){

        this.frame = new JFrame();

        // Essentials for menu display
        this.frame.setSize(width, height);          
        this.frame.setLayout(null);
        this.frame.setResizable(false);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.getContentPane().setBackground(Color.GRAY);
        
        
    }


    public JFrame getFrame() {

        return frame;

    }
        
    // setter
    public void setVisible(boolean check){
        this.frame.setVisible(check);
    }

    // Buttons
    public void addButtons(){
        
        // Buttons
        buttons b3 = new buttons();
        this.frame.add(b3.newButton(frame, 300, 100, 200, 100, "Add")); 

        buttons b4 = new buttons();
        this.frame.add(b4.newButton(frame, 300, 300, 200, 100, "Search")); 
        
        buttons b5 = new buttons();
        this.frame.add(b5.newButton(frame, 300, 500, 200, 100, "Update")); 

        buttons b6 = new buttons();
        this.frame.add(b6.newButton(frame, 550, 100, 200, 100, "Delete")); 

        buttons b7 = new buttons();
        this.frame.add(b7.newButton(frame, 550, 300, 200, 100, "Display")); 

    }

}

class textFields{

    JTextField field;
    JLabel label;

    public textFields(){
        
    }

    public JTextField createFields(JFrame frame, int x, int y, int width, int height, String text){
        
        this.field = new JTextField(20);
        this.label = new JLabel();

        this.field.setBounds(x, y, width, height);;
        this.label.setText(text);
        this.label.setForeground(Color.WHITE);
        this.label.setBounds(x - 150, y, width, height);

        frame.add(label);
        frame.add(field);

        return field;
    }

    public String getFieldText(){
        return field.getText();
    }
}