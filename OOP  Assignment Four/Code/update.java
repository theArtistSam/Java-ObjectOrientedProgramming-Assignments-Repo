import java.awt.Color;

import javax.swing.JFrame;

public class update {

    private JFrame frame;
    protected textFields t10, t11;

    // Argumented constructor
    public update(int width, int height){

        this.frame = new JFrame();

        // Essentials for menu display
        this.frame.setSize(width, height);          
        this.frame.setLayout(null);
        this.frame.setResizable(false);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.getContentPane().setBackground(Color.gray);
        
        t10 = new textFields();
        this.frame.add(t10.createFields(frame, 300, 50, 200, 50, "OLD NAME"));
        
        t11 = new textFields();
        this.frame.add(t11.createFields(frame, 700, 50, 200, 50, "NEW NAME"));
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
        buttons b10 = new buttons();
        this.frame.add(b10.newButton(frame, 151, 150, 200, 50, "UPDATE")); 

        buttons b11 = new buttons();
        this.frame.add(b11.newButton(frame, 380, 150, 200, 50, "HOME"));  
    
    }
    
    
}
