import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GUI{
    protected static GUI2 f2 = new GUI2(1280, 720);
    protected static GUI3 f3 = new GUI3(800, 800);
    protected static GUISearch f4 = new GUISearch(800, 500);
    protected static update f5 = new update(1000, 400);
    protected static delete f6 = new delete(800, 500);
    protected static add a1 = new add(800, 800);
    protected static updateProduct up1 = new updateProduct(1000, 400);
    protected static mainMenu m1 = new mainMenu(1280, 720);
    protected static FileOperations f1 = new FileOperations();

    public static void main(String[] args) {

        department d1 = new department("CS", "ISB");
        /* student s1 = new student("hafif", "123456789101", "Male", "BCS 3A", 4, 3, d1);
        student s2 = new student("Sam", "123456789101", "Male", "BCS 3A", 4, 3, d1);
        student s3 = new student("Mansoor", "123456789101", "Male", "BCS 3A", 4, 3, d1);
        */
        
        My_Date d2 = new My_Date(2, 4, 2001);
        company c1 = new company("nestle", "isb");
        product p1 = new product("slice Five", "juice", 50, d2, c1);
        
        /* System.out.println(d2.toString());
        System.out.println(c1.toString());
        System.out.println(p1.toString()); */
        
        /* My_Date d2 = new My_Date();
        company c1 = new company();
        product p1 = new product();
         */
        
         //f1.writeToFile(d1, "department");
        // f1.writeToFile(p1, "product");

        /* f1.writeToFile(d1, "department");
        
        f1.writeToFile(s1, "student");
        f1.writeToFile(s2, "student");
        f1.writeToFile(s3, "student"); */
        
        /* f1.readFromFile("student");
        f1.readFromFile("department");
 */
        
        /* f2.addButtons();
        f2.setVisible(true); */

        m1.addButtons();;
        m1.setVisible(true);

        
    }
}

class myFrame{
    
    private JFrame frame;

    // Default constructor
    public myFrame(){

    }

    // Argumented constructor
    public myFrame(int width, int height){

        this.frame = new JFrame();

        // Essentials for menu display
        this.frame.setSize(width, height);          
        this.frame.setLayout(null);
        this.frame.setResizable(false);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.getContentPane().setBackground(Color.GRAY);
        
        
    }

    // setter
    public void setVisible(boolean check){
        this.frame.setVisible(check);
    }

    // Buttons
    public void addButtons(){
        
        // Buttons
        buttons b1 = new buttons();
        this.frame.add(b1.newButton(frame, 395, 200, 200, 200, "Click ME")); 

        buttons b2 = new buttons();
        this.frame.add(b2.newButton(frame, 605, 200, 200, 200, "Exit")); 
    
    }

}

class buttons implements ActionListener{

    private JButton button;

    // Default Constructor
    public buttons(){

    }

    public JButton newButton(JFrame frame, int x, int y, int width, int height, String text){

        // Creating a new button
        this.button = new JButton();
        this.button.setText(text);
        this.button.setBounds(x, y, width, height);
        this.button.addActionListener(this);
        this.button.setBackground(Color.white);

        // Imported frame as it'd add on top of the above screen
        frame.add(button);

        return button;
    }

    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == button && button.getX() == 300 && button.getY() == 100){
            JFrame frame2 = GUI.f2.getFrame();
            frame2.setVisible(false);

            
            GUI.f3.addButtons();
            GUI.f3.setVisible(true);
            
            //frame.dispose();
            System.out.println("Add ");
        }


        else if(e.getSource() == button && button.getX() == 300 && button.getY() == 300){
            JFrame frame2 = GUI.f2.getFrame();
            frame2.setVisible(false);

            GUI.m1.setVisible(false);

            GUI.f4.addButtons();
            GUI.f4.setVisible(true);
            
            System.out.println("Search ");
        }
        else if(e.getSource() == button && button.getX() == 300 && button.getY() == 500){
            JFrame frame2 = GUI.f2.getFrame();
            frame2.setVisible(false);

            GUI.f5.addButtons();
            GUI.f5.setVisible(true);
            System.out.println("Update ");
        }
        else if(e.getSource() == button && button.getX() == 550 && button.getY() == 100){
            JFrame frame2 = GUI.f2.getFrame();
            frame2.setVisible(false);

            GUI.f6.addButtons();
            GUI.f6.setVisible(true);
            System.out.println("Delete ");
        }
        else if(e.getSource() == button && button.getX() == 550 && button.getY() == 300){
            
            GUI.f1.display("student");
        
            System.out.println("Display ");
        }
        else if(e.getSource() == button && button.getX() == 395){
            System.out.println("Clicked Me :)");
        }
        else if(e.getSource() == button && button.getX() == 605){
            System.out.println("Exit on page 1 ");
        }
        else if(e.getSource() == button && button.getX() == 150 && button.getY() == 640){
            String name = GUI.f3.t1.getFieldText();
            String phone = GUI.f3.t2.getFieldText();
            String gender = GUI.f3.t3.getFieldText();
            String deptName = GUI.f3.t4.getFieldText();
            String deptLoc = GUI.f3.t5.getFieldText();
            String GPA = GUI.f3.t6.getFieldText();
            String semester = GUI.f3.t7.getFieldText();
            String section = GUI.f3.t8.getFieldText();
            
            department d3 = new department(deptName, deptLoc);
            student s4 = new student(name, phone, gender, section, Integer.parseInt(GPA), Integer.parseInt(semester), d3);

            GUI.f1.writeToFile(s4, "student");
        
            JOptionPane.showMessageDialog(GUI.f3.getFrame(), "Added!");
            GUI.f3.setVisible(false);
            GUI.f3.getFrame().dispose();
            
            GUI.f2.setVisible(true);
            System.out.println("SUBMIT FIELDS");
        }
        else if(e.getSource() == button && button.getX() == 380 && button.getY() == 640){
            JFrame frame3 = GUI.f3.getFrame();
            frame3.setVisible(false);

            GUI.f2.setVisible(true);
            System.out.println("HOME");
        }
        else if(e.getSource() == button && button.getX() == 381 && button.getY() == 640){
            JFrame frame3 = GUI.a1.getFrame();
            frame3.setVisible(false);

            GUI.m1.setVisible(true);
            System.out.println("HOME");
        }
        else if(e.getSource() == button && button.getX() == 150 && button.getY() == 150){
            String text = GUI.f4.t9.getFieldText();
            GUI.f1.searchByName(text, "product");


            System.out.println("Search on search");
        }
        /* else if(e.getSource() == button && button.getX() == 151 && button.getY() == 150){
            String oldName = GUI.f5.t10.getFieldText();
            String newName = GUI.f5.t11.getFieldText();
            
            GUI.f1.update(oldName, newName, "student");

            JOptionPane.showMessageDialog(GUI.f5.getFrame(), "Updated!");
            
            System.out.println(oldName);
            System.out.println(newName);
            System.out.println("updated on update");
        } */
        /* else if(e.getSource() == button && button.getX() == 152 && button.getY() == 150){
            String name = GUI.f6.t12.getFieldText();
            
            GUI.f1.delete(name, "student");

            JOptionPane.showMessageDialog(GUI.f5.getFrame(), "Deleted!");
            
            System.out.println("updated on update");
        } */

        else if(e.getSource() == button && button.getX() == 380 && button.getY() == 150){
            
            JFrame frame3 = GUI.f4.getFrame();
            frame3.setVisible(false);
            
            JFrame frame5 = GUI.f5.getFrame();
            frame5.setVisible(false);
            
            JFrame frame6 = GUI.f6.getFrame();
            frame6.setVisible(false);

        
            GUI.m1.setVisible(true);
            //GUI.f2.setVisible(true);
            System.out.println("HOME");

            System.out.println("HOME on Search");
        }
        
        // ------------------------ LAB TASK -------------------------
        else if(e.getSource() == button && button.getX() == 301 && button.getY() == 100){
            JFrame frame2 = GUI.m1.getFrame();
            frame2.setVisible(false);

            GUI.a1.addButtons();
            GUI.a1.setVisible(true);
            //GUI.a.setVisible(true);
            
            //frame.dispose();
            System.out.println("Add ");
        }
        else if(e.getSource() == button && button.getX() == 151 && button.getY() == 640){
            String product_name = GUI.a1.t1.getFieldText();
            String product_category = GUI.a1.t2.getFieldText();
            String day = GUI.a1.t3.getFieldText();
            String month = GUI.a1.t4.getFieldText();
            String year = GUI.a1.t5.getFieldText();
            String company_name = GUI.a1.t6.getFieldText();
            String company_location = GUI.a1.t7.getFieldText();
            String price = GUI.a1.t8.getFieldText();
            Double prc = Double.parseDouble(price);
            My_Date d1 = new My_Date(Integer.parseInt(day), Integer.parseInt(month), Integer.parseInt(year));
            company c1 = new company(company_name, company_location);
            product p1 = new product(product_name, product_category, prc, d1, c1);
            
            GUI.f1.writeToFile(p1, "product");
        
            JOptionPane.showMessageDialog(GUI.a1.getFrame(), "Added!");
            GUI.a1.setVisible(false);
            GUI.a1.getFrame().dispose();
            
            GUI.m1.setVisible(true);
            System.out.println("SUBMIT FIELDS");
        }
        else if(e.getSource() == button && button.getX() == 301 && button.getY() == 300){
            JFrame frame2 = GUI.m1.getFrame();
            frame2.setVisible(false);

            GUI.f4.addButtons();
            GUI.f4.setVisible(true);
            
            System.out.println("Search ");
        }
        else if(e.getSource() == button && button.getX() == 301 && button.getY() == 500){
            JFrame frame2 = GUI.m1.getFrame();
            frame2.setVisible(false);

            GUI.up1.addButtons();
            GUI.up1.setVisible(true);
            System.out.println("Update ");
        }
        else if(e.getSource() == button && button.getX() == 152 && button.getY() == 150){
            String oldName = GUI.up1.t10.getFieldText();
            String newName = GUI.up1.t11.getFieldText();
            
            GUI.f1.update(oldName, newName, "product");

            JOptionPane.showMessageDialog(GUI.up1.getFrame(), "Updated!");
            
            System.out.println(oldName);
            System.out.println(newName);
            System.out.println("updated on update");
        }
        else if(e.getSource() == button && button.getX() == 381 && button.getY() == 150){
            JFrame frame3 = GUI.a1.getFrame();
            frame3.setVisible(false);

            GUI.m1.setVisible(true);
            System.out.println("HOME on update");
        }
        
    }

}