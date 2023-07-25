import java.awt.Color;

import javax.swing.*;

public class mainMenu {

    private JFrame frame;
    
    // Argumented constructor
    public mainMenu(int width, int height){

        this.frame = new JFrame();

        // Essentials for menu display
        this.frame.setSize(width, height);          
        this.frame.setLayout(null);
        this.frame.setResizable(false);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.getContentPane().setBackground(Color.gray);
        
        
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
        this.frame.add(b3.newButton(frame, 301, 100, 200, 100, "Add")); 

        buttons b4 = new buttons();
        this.frame.add(b4.newButton(frame, 301, 300, 200, 100, "Search")); 
        
        buttons b5 = new buttons();
        this.frame.add(b5.newButton(frame, 301, 500, 200, 100, "Update"));  

    }
    
}
