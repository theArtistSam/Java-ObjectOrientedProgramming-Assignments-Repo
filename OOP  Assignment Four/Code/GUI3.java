import java.awt.Color;
import javax.swing.JFrame;

public class GUI3{

    private JFrame frame;
    protected static textFields t1, t2, t3, t4, t5, t6, t7, t8; 
    
    // Argumented constructor
    public GUI3(int width, int height){

        this.frame = new JFrame();

        // Essentials for menu display
        this.frame.setSize(width, height);          
        this.frame.setLayout(null);
        this.frame.setResizable(false);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.getContentPane().setBackground(Color.GRAY);
        
        
        // TextFields
        t1 = new textFields();
        this.frame.add(t1.createFields(frame, 300, 50, 200, 50, "NAME"));
        
        t2 = new textFields();
        this.frame.add(t2.createFields(frame, 300, 120, 200, 50, "PHONE"));
        
        t3 = new textFields();
        this.frame.add(t3.createFields(frame, 300, 190, 200, 50, "GENDER"));
        
        t4 = new textFields();
        this.frame.add(t4.createFields(frame, 300, 260, 200, 50, "DEPT NAME"));
        
        t5 = new textFields();
        this.frame.add(t5.createFields(frame, 300, 330, 200, 50, "DEPT LOCATION"));
        
        t6 = new textFields();
        this.frame.add(t6.createFields(frame, 300, 400, 200, 50, "GPA"));
        
        t7 = new textFields();
        this.frame.add(t7.createFields(frame, 300, 470, 200, 50, "SEMESTER"));
        
        t8 = new textFields();
        this.frame.add(t8.createFields(frame, 300, 540, 200, 50, "SECTION"));
        
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
        this.frame.add(b6.newButton(frame, 150, 640, 200, 50, "SUBMIT")); 

        buttons b7 = new buttons();
        this.frame.add(b7.newButton(frame, 380, 640, 200, 50, "HOME"));  
    
    }

}
