import java.awt.*;


public class StudentDetailsForm {
    TextField nameField, regField, progField, deptField, cgpaField, phoneField;

    StudentDetailsForm() {
    Frame f = new Frame("Student Details Form");
    
    nameField=new TextField("Name:");  
    nameField.setBounds(60,100, 230,40);  
    progField=new TextField("Program:");  
    progField.setBounds(60,150, 230,40);  
    regField=new TextField("Reg No:");
    regField.setBounds(60,200, 230,40);
    deptField=new TextField("Department:"); 
    deptField.setBounds(60,250, 230,40);
    cgpaField=new TextField("CGPA:");
    cgpaField.setBounds(60,300, 230,40);
    phoneField=new TextField("Phone:");
    phoneField.setBounds(60,350, 230,40);
    f.add(phoneField);
    f.add(cgpaField);
    f.add(deptField);
    f.add(regField);
    f.add(nameField); 
    f.add(progField);  
    f.setSize(500,500);  
    f.setLayout(null);  
    f.setVisible(true);  

    }

    public static void main(String[] args) {
        new StudentDetailsForm();
    }
}
