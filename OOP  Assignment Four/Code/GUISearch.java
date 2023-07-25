import java.awt.Color;
import javax.swing.JFrame;

public class GUISearch{

    private JFrame frame;
    protected textFields t9; 
    // Argumented constructor
    public GUISearch(int width, int height){

        this.frame = new JFrame();

        // Essentials for menu display
        this.frame.setSize(width, height);          
        this.frame.setLayout(null);
        this.frame.setResizable(false);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.getContentPane().setBackground(Color.GRAY);
        
        t9 = new textFields();
        this.frame.add(t9.createFields(frame, 300, 50, 200, 50, "NAME"));
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
        this.frame.add(b8.newButton(frame, 150, 150, 200, 50, "SEARCH")); 

        buttons b9 = new buttons();
        this.frame.add(b9.newButton(frame, 380, 150, 200, 50, "HOME"));  
    
    }
}