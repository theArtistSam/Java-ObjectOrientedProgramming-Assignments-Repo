import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;
class FileOperations <T>{

    // method to to write file
    public void writeToFile(T object, String file_name){

        try{
            File f = new File(file_name + ".ser");
            ObjectOutputStream oos;    
            
            if(f.exists()){
                oos = new MyObjectOutputStream(new FileOutputStream(f, true));
            }
            else{
                oos = new ObjectOutputStream(new FileOutputStream(f));
            }

            if(object instanceof product){
                product p1 = (product) object;
                oos.writeObject(p1);
                
            }
            else if (object instanceof company){
                company c1 = (company) object;
                oos.writeObject(c1);
                
            }
            else if(object instanceof student){
                student s1 = (student) object;
                oos.writeObject(s1);
                
            }
            else if (object instanceof department){
                department d1 = (department) object;
                oos.writeObject(d1);
                
            }
            oos.close();
        } catch(IOException e){
            System.out.println("Can't write. Error!");
        }

    }

    // method to read from file
    public void readFromFile(String file_name){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(file_name + ".ser"));
            
            while(true){
                
                if(file_name.equalsIgnoreCase("department")){
                    department d1 = (department) ois.readObject();
                    System.out.println(d1.toString());
                }
                else if (file_name.equalsIgnoreCase("student")){
                    student s1 = (student) ois.readObject();
                    System.out.println(s1.toString());

                }
                else if (file_name.equalsIgnoreCase("product")){
                    product p1 = (product) ois.readObject();
                    System.out.println(p1.toString());

                }
                else if (file_name.equalsIgnoreCase("company")){
                    company c1 = (company) ois.readObject();
                    System.out.println(c1.toString());

                }
            }
        
        
        } catch (ClassNotFoundException e) {
            System.out.println("Class don't exist!");
        } catch(EOFException e){
            try {
                ois.close();    
            } catch (Exception f) {
                System.out.println("Error! ...");
            }
            return;

        } catch(IOException e ){
            System.out.println("Error!");
        }
    }

    // method to read from file
    public void display(String file_name){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(file_name + ".ser"));
            
            while(true){
                
                if(file_name.equalsIgnoreCase("department")){
                    department d1 = (department) ois.readObject();
                    System.out.println(d1.toString());
                }
                else if (file_name.equalsIgnoreCase("student")){
                    student s1 = (student) ois.readObject();
                    JOptionPane.showMessageDialog(GUI.f2.getFrame(), s1.toString());

                }
            }
        
        } catch (ClassNotFoundException e) {
            System.out.println("Class don't exist!");
        } catch(EOFException e){
            try {
                ois.close();    
            } catch (Exception f) {
                System.out.println("Error! ...");
            }
            return;

        } catch(IOException e ){
            System.out.println("Error!");
        }
    }

    // Search by name!
    public void searchByName(String name, String file_name){
        ObjectInputStream ois = null;
        Boolean check = true;
        try {
            ois = new ObjectInputStream(new FileInputStream(file_name + ".ser"));
            
            if(file_name.equalsIgnoreCase("student")){
                
                while(check){
    
                    student s1 = (student) ois.readObject();
                    if (s1.getName().equals(name)) {
                        String text = s1.toString();
                        JOptionPane.showMessageDialog(GUI.f4.getFrame(), text);
                        System.out.println("Found");
                        check = false;
                    }
                }
            }
            else if(file_name.equalsIgnoreCase("product")){
                
                while(check){
    
                    product p1 = (product) ois.readObject();
                    if (p1.getName().equals(name)) {
                        String text = p1.toString();
                        // gonna get a frame in here
                        JOptionPane.showMessageDialog(GUI.f4.getFrame(), text);
                        System.out.println("Found");
                        check = false;
                    }
                }
            }
            else if(file_name.equalsIgnoreCase("company")){
                
                while(check){
    
                    company c1 = (company) ois.readObject();
                    if (c1.getCompanyName().equals(name)) {
                        String text = c1.toString();
                        // gonna get a frame in here
                        JOptionPane.showMessageDialog(GUI.f4.getFrame(), text);
                        System.out.println("Found");
                        check = false;
                    }
                }
            }
        
        
        } catch (ClassNotFoundException e) {
            System.out.println("Class don't exist!");
        } catch(EOFException e){
            try {
                ois.close();    
            } catch (Exception f) {
                System.out.println("Error! ...");
            }
            return;

        } catch(IOException e ){
            System.out.println("Error!");
        }
    }

    // Search by departments!
    public void searchByDepartments(String department_name, String file_name){
        ObjectInputStream ois = null;
        Boolean check = true;
        try {
            ois = new ObjectInputStream(new FileInputStream(file_name + ".ser"));
            
            while(check){

                department s1 = (department) ois.readObject();
                if (s1.getName().equals(department_name)) {
                    System.out.println("Found");
                    check = false;
                }
            }
        
        
        } catch (ClassNotFoundException e) {
            System.out.println("Class don't exist!");
        } catch(EOFException e){
            try {
                ois.close();    
            } catch (Exception f) {
                System.out.println("Error! ...");
            }
            return;

        } catch(IOException e ){
            System.out.println("Error!");
        }
    }

    // method to update items
    public void update(String select_item, String update_item, String file_name){

        ObjectInputStream ois = null;
        ArrayList<department> dep = new ArrayList<department>();
        ArrayList<student> stu = new ArrayList<student>();
        ArrayList<product> prod = new ArrayList<product>();
        ArrayList<company> comp = new ArrayList<company>();
            
        try {
            ois = new ObjectInputStream(new FileInputStream(file_name + ".ser"));
            
            while(true){
                
                if(file_name.equalsIgnoreCase("department")){
                    department d1 = (department) ois.readObject();
                    dep.add(d1);
                    
                }
                else if (file_name.equalsIgnoreCase("student")){
                    student s1 = (student) ois.readObject();
                    stu.add(s1);
                    
                }
                else if (file_name.equalsIgnoreCase("product")){
                    product p1 = (product) ois.readObject();
                    prod.add(p1);
                    
                }
                else if (file_name.equalsIgnoreCase("company")){
                    company c1 = (company) ois.readObject();
                    comp.add(c1);
                    
                }
                    
            }    
        } catch (ClassNotFoundException e) {
            System.out.println("Class don't exist!");
        } catch(EOFException e){
            try {
                ois.close();    
            } catch (Exception f) {
                System.out.println("Error! ...");
            }
            
        } catch(IOException e ){
            System.out.println("Error!");
        }

        //System.out.println(stu);
        
                
        // updatation
        if(file_name.equalsIgnoreCase("department")){
            for (int i = 0; i < dep.size(); i++) {
                if (dep.get(i).getName().equals(select_item)) {
                    dep.get(i).setName(update_item);
                }
            }

            File myFile = new File(file_name + ".ser");
            myFile.delete();
        
            for (int i = 0; i < stu.size(); i++) {
                writeToFile((T)dep.get(i), file_name);    
            }
        }

        else if (file_name.equalsIgnoreCase("student")){
            for (int i = 0; i < stu.size(); i++) {
                if (stu.get(i).getName().equals(select_item)) {
                    stu.get(i).setName(update_item);
                }
            }

            File myFile = new File(file_name + ".ser");
            myFile.delete();
        
            for (int i = 0; i < stu.size(); i++) {
                writeToFile((T)stu.get(i), file_name);    
            }
            
        }
        else if (file_name.equalsIgnoreCase("company")){
            for (int i = 0; i < comp.size(); i++) {
                if (comp.get(i).getCompanyName().equals(select_item)) {
                    comp.get(i).setCompanyName(update_item);
                }
            }

            File myFile = new File(file_name + ".ser");
            myFile.delete();
        
            for (int i = 0; i < comp.size(); i++) {
                writeToFile((T)comp.get(i), file_name);    
            }
            
        }
        else if (file_name.equalsIgnoreCase("product")){
            for (int i = 0; i < prod.size(); i++) {
                if (prod.get(i).getName().equals(select_item)) {
                    double prc =  Double.parseDouble(update_item);
                    prod.get(i).setPrice(prc);
                }
            }

            File myFile = new File(file_name + ".ser");
            myFile.delete();
        
            for (int i = 0; i < prod.size(); i++) {
                writeToFile((T)prod.get(i), file_name);    
            }
            
        }
    } 

    // method to update items
    public void delete(String select_item, String file_name){

        ObjectInputStream ois = null;
        ArrayList<department> dep = new ArrayList<department>();
        ArrayList<student> stu = new ArrayList<student>();
            
        try {
            ois = new ObjectInputStream(new FileInputStream(file_name + ".ser"));
            
            while(true){
                
                if(file_name.equalsIgnoreCase("department")){
                    department d1 = (department) ois.readObject();
                    dep.add(d1);
                    
                }
                else if (file_name.equalsIgnoreCase("student")){
                    student s1 = (student) ois.readObject();
                    stu.add(s1);
                    
                }
                    
            }    
        } catch (ClassNotFoundException e) {
            System.out.println("Class don't exist!");
        } catch(EOFException e){
            try {
                ois.close();    
            } catch (Exception f) {
                System.out.println("Error! ...");
            }
            
        } catch(IOException e ){
            System.out.println("Error!");
        }

        System.out.println(stu);
        
                
        // updatation
        if(file_name.equalsIgnoreCase("department")){
            for (int i = 0; i < dep.size(); i++) {
                if (dep.get(i).getName().equalsIgnoreCase(select_item)) {
                    dep.remove(i);
                    break;
                }
            }

            File myFile = new File(file_name + ".ser");
            myFile.delete();
        
            for (int i = 0; i < stu.size(); i++) {
                writeToFile((T)dep.get(i), file_name);    
            }
        }

        else if (file_name.equalsIgnoreCase("student")){
            for (int i = 0; i < stu.size(); i++) {
                if (stu.get(i).getName().equalsIgnoreCase(select_item)) {
                    stu.remove(i);
                    break;
                }
            }

            File myFile = new File(file_name + ".ser");
            myFile.delete();
        
            for (int i = 0; i < stu.size(); i++) {
                writeToFile((T)stu.get(i), file_name);    
            }
            
        }
    }
    
}