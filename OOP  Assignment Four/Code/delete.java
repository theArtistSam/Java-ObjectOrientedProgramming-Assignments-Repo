import java.awt.Color;

import javax.swing.JFrame;

public class delete {
    private JFrame frame;
    protected textFields t12; 
    // Argumented constructor
    public delete(int width, int height){

        this.frame = new JFrame();

        // Essentials for menu display
        this.frame.setSize(width, height);          
        this.frame.setLayout(null);
        this.frame.setResizable(false);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.getContentPane().setBackground(Color.gray);
        
        t12 = new textFields();
        this.frame.add(t12.createFields(frame, 300, 50, 200, 50, "NAME"));
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
        buttons b8 = new buttons();
        this.frame.add(b8.newButton(frame, 152, 150, 200, 50, "Delete")); 

        buttons b9 = new buttons();
        this.frame.add(b9.newButton(frame, 380, 150, 200, 50, "HOME"));  
    
    }
}
