import java.awt.Color;

import javax.swing.*;

public class add {
    
    private JFrame frame;
    protected static textFields t1, t2, t3, t4, t5, t6, t7, t8; 
    
    // Argumented constructor
    public add(int width, int height){

        this.frame = new JFrame();

        // Essentials for menu display
        this.frame.setSize(width, height);          
        this.frame.setLayout(null);
        this.frame.setResizable(false);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.getContentPane().setBackground(Color.gray);
        
        
        // TextFields
        t1 = new textFields();
        this.frame.add(t1.createFields(frame, 301, 50, 200, 50, "PRODUCT NAME"));
        
        t2 = new textFields();
        this.frame.add(t2.createFields(frame, 301, 120, 200, 50, "PRODUCT CATEGORY"));
        
        t3 = new textFields();
        this.frame.add(t3.createFields(frame, 301, 190, 200, 50, "DATE"));
        
        t4 = new textFields();
        this.frame.add(t4.createFields(frame, 301, 260, 200, 50, "MONTH"));
        
        t5 = new textFields();
        this.frame.add(t5.createFields(frame, 301, 330, 200, 50, "YEAR"));
        
        t6 = new textFields();
        this.frame.add(t6.createFields(frame, 301, 400, 200, 50, "COMPANY NAME"));
        
        t7 = new textFields();
        this.frame.add(t7.createFields(frame, 301, 470, 200, 50, "COMPANY LOCATION"));
        
        t8 = new textFields();
        this.frame.add(t8.createFields(frame, 301, 540, 200, 50, "PRICE"));
        
    }

    // setter
    public void setVisible(boolean check){
        this.frame.setVisible(check);
    }
    
    public JFrame getFrame() {

        return frame;

    }

    // Buttons
    public void addButtons(){
        
        // Buttons
        buttons b6 = new buttons();
        this.frame.add(b6.newButton(frame, 151, 640, 200, 50, "SUBMIT")); 

        buttons b7 = new buttons();
        this.frame.add(b7.newButton(frame, 381, 640, 200, 50, "HOME"));  
    
    }
    
}
