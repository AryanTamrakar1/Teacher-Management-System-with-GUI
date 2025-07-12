import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;



public class TeacherGUI implements ActionListener
{
        /*It store the object of Teacher in a array list called TeacherList*/
        ArrayList<Teacher>TeacherList=new ArrayList<Teacher>();
        
        JFrame guiframe = new JFrame("Teacher GUI");//It creates a frame for the TeacherGUI
        
        //JLabel: creates a label of a text in a gui
        JLabel teacherGui = new JLabel("Teacher GUI");
    
        JLabel IdLabel = new JLabel("TeacherId:");
        
        JLabel NameLabel = new JLabel("Teacher Name:");
        
        JLabel AddressLabel = new JLabel("Address:");
        
        JLabel WorkingTypeLabel = new JLabel("WorkingType:");
        
        JLabel EmploymentStatusLabel = new JLabel("EmploymentStatus:");
        
        JLabel WorkingHoursLabel = new JLabel("WorkingHours:");
        
        JLabel DepartmentLabel = new JLabel("Department:");
        
        JLabel YearsOfExperienceLabel = new JLabel("YearsofExperience:");
        
        JLabel GradedScoreLabel = new JLabel("GradedScore:");
        
        JLabel SalaryLabel = new JLabel("Salary:");
        
        JLabel SpecializationLabel = new JLabel("Specialization:");
        
        JLabel AcademicQualificationsLabel = new JLabel("Academic Qualifications:");
        
        JLabel PerformanceIndexLabel = new JLabel("PerformanceIndex:");
        
        //JTextField: it create a textfield to input value from the user  
        JTextField Teacherid_Field=new JTextField();
    
        JTextField Teachername_Field=new JTextField();
    
        JTextField Address_Field=new JTextField();
    
        JTextField Workingtype_Field=new JTextField();
    
        JTextField Employmentstatus_Field=new JTextField();
    
        JTextField Workinghours_Field=new JTextField();
    
        JTextField Department_Field=new JTextField();
    
        JTextField YearofExperience_Field=new JTextField();
    
        JTextField Gradedscore_Field=new JTextField();
    
        JTextField Salary_Field=new JTextField();
    
        JTextField Specialization_Field=new JTextField();
    
        JTextField AcademicQualifications_Field=new JTextField();
    
        JTextField PerformanceIndex_Field=new JTextField();
        
        //JButton: it create a button to be clicked by users
        JButton lecturer=new JButton("Add Lecturer");
        
        JButton tutor=new JButton("Add Tutor");
    
        JButton gradeassignment=new JButton("Grade Assignments");
    
        JButton salaryoftutor=new JButton("Set Salary Of Tutor");
    
        JButton removethetutor=new JButton("Remove Tutor");
    
        JButton display=new JButton("Display");
    
        JButton clear=new JButton("Clear");
        
        /*JPanel:it create a container for holding different component like JLabel
                 ,JButton, JTextField, etc for the gui*/
        JPanel greyPanel = new JPanel();
        
        JPanel greenPanel =  new JPanel();
        
        JPanel bluePanel = new JPanel();
        
        JPanel pinkPanel = new JPanel();
        
        

        
    public TeacherGUI()//it create a construtor where we can make the gui for TeacherGUI
    {
        /*setBounds: it set the bounds which are x-coordinate,y-coordinate and width and height for the
                     elements such as JLabels,JTextFields,JButtons,etc*/ 
        teacherGui.setBounds(700,0,100,100);

        IdLabel.setBounds(150, 40, 150, 50); 
        
        Teacherid_Field.setBounds(260, 40, 260, 60);
        
        
        NameLabel.setBounds(140, 120, 150, 50);
        
        Teachername_Field.setBounds(260, 120, 260, 60);
        
        
        AddressLabel.setBounds(150, 200, 150, 50);
        
        Address_Field.setBounds(260, 200, 260, 60);
        
        
        WorkingTypeLabel.setBounds(90, 40, 150, 50);
        
        Workingtype_Field.setBounds(240, 40, 260, 60);
        
        
        EmploymentStatusLabel.setBounds(120,280, 150, 50);
        
        Employmentstatus_Field.setBounds(260, 280, 260, 60);
        
        
        WorkingHoursLabel.setBounds(90, 120, 150, 50);
        
        Workinghours_Field.setBounds(240, 120, 260, 60);
        
        
        DepartmentLabel.setBounds(600, 40, 150, 50);
        
        Department_Field.setBounds(780, 40, 260, 60);
        
        
        YearsOfExperienceLabel.setBounds(600, 120, 150, 50);
        
        YearofExperience_Field.setBounds(780, 120, 260, 60);
        
        
        GradedScoreLabel.setBounds(90, 100, 150, 50);
        
        Gradedscore_Field.setBounds(240, 100, 260, 60);
        
        
        SalaryLabel.setBounds (90, 200, 150, 50);
        
        Salary_Field.setBounds(240, 200, 260, 60);
        
        
        SpecializationLabel.setBounds(600, 280, 150, 50);
        
        Specialization_Field.setBounds (780, 280, 260, 60);
        
        
        AcademicQualificationsLabel.setBounds(600, 200, 160, 50);
        
        AcademicQualifications_Field.setBounds(780, 200, 260, 60);
        
        
        PerformanceIndexLabel.setBounds(90, 30, 150, 50);
        
        PerformanceIndex_Field.setBounds(240, 30, 260, 60);

        
        lecturer.setBounds(1100, 40, 180, 80);
        
        tutor.setBounds(1100, 150, 180, 80);
        
        gradeassignment.setBounds(280, 170, 180, 80);
        
        salaryoftutor.setBounds(280, 290, 180, 80);
        
        removethetutor.setBounds(1100, 260, 180, 80);
        
        display.setBounds(50, 20, 180, 80);
        
        clear.setBounds(250, 20, 180, 80);
        
        /*
         * setSize: it set the size of the gui
         * setLayout(null): it set the layout to null meaning we set the components wherever we want
         * setVisible(true): it show the gui to the screen when setted to true
         * setResizable(false): it doesnot let you resize it as it is false
         * .add(): it add the components to a specfic frame or panel
         * setBackground(new color(R,G,B)): it add a background color to panel or frame.
                                            also RGB is red,green and blue and it ranges 
                                            from 0 to 255 which mean we add create new colors 
                                            once we adjust those numbers in three seperate digits.
        */
        guiframe.setSize(1460,1000);
        guiframe.setLayout(null);
        guiframe.setVisible(true);
        guiframe.setResizable(false);
        guiframe.add(teacherGui);
        
        guiframe.add(greyPanel);
        greyPanel.setLayout(null);
        greyPanel.setBackground(new Color(211, 211, 211));//Light Grey
        greyPanel.setBounds(70,80,1320,400);
        greyPanel.add(IdLabel);
        greyPanel.add(Teacherid_Field);
        greyPanel.add(NameLabel);
        greyPanel.add(Teachername_Field);
        greyPanel.add(AddressLabel);
        greyPanel.add(Address_Field);       
        greyPanel.add(EmploymentStatusLabel);
        greyPanel.add(Employmentstatus_Field); 
        greyPanel.add(DepartmentLabel);
        greyPanel.add(Department_Field);       
        greyPanel.add(YearsOfExperienceLabel);
        greyPanel.add(YearofExperience_Field);
        greyPanel.add(AcademicQualificationsLabel);
        greyPanel.add(AcademicQualifications_Field);
        greyPanel.add(SpecializationLabel);
        greyPanel.add(Specialization_Field);
        greyPanel.add(lecturer);
        greyPanel.add(tutor);
        greyPanel.add(removethetutor);
        
        guiframe.add(greenPanel);
        greenPanel.setLayout(null);
        greenPanel.setBackground(new Color(144, 238, 144));//Light Green
        greenPanel.setBounds(70,520,640,400);
        greenPanel.add(WorkingTypeLabel);
        greenPanel.add(Workingtype_Field);
        greenPanel.add(WorkingHoursLabel);
        greenPanel.add(Workinghours_Field);
        greenPanel.add(SalaryLabel);
        greenPanel.add(Salary_Field);
        greenPanel.add(salaryoftutor);

        guiframe.add(pinkPanel);
        pinkPanel.setLayout(null);
        pinkPanel.setBackground(new Color(255, 228, 225)); // Pale Pink color
        pinkPanel.setBounds(750,520,640,260);
        pinkPanel.add(PerformanceIndexLabel);
        pinkPanel.add(PerformanceIndex_Field);
        pinkPanel.add(GradedScoreLabel);
        pinkPanel.add(Gradedscore_Field);
        pinkPanel.add(gradeassignment);
        
        guiframe.add(bluePanel);
        bluePanel.setLayout(null);
        bluePanel.setBackground(new Color(135, 206, 250));//Light sky blue
        bluePanel.setBounds(850,800,480,120);
        bluePanel.add(display);
        bluePanel.add(clear);
        
        /*.addActionListener: it add an action(by action i mean the code inside the buttons)
        when the user click on the components like display or clear.*/
        lecturer.addActionListener(this);
        
        tutor.addActionListener(this);
        
        gradeassignment.addActionListener(this);
        
        salaryoftutor.addActionListener(this);
        
        removethetutor.addActionListener(this);
        
        display.addActionListener(this);
        
        clear.addActionListener(this);
    }
    
    //it is used to call the action when clicking the button
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==lecturer)//it check if the event source is lecture or not
        {
            /*
             * try and catch: it does try and if error it use catch and show the required output
             * int TeacherId = Integer.parseInt(Teacherid_Field.getText()):it convert the text that is entered in
                Teacherid_Field into an integer and assign it to TeacherId.
             * for(Teacher lecturer: TeacherList):it access the teacher lecturer object like TeacherId,Address,
                                                  Department,etc in the TeacherList
             * if(lecturer instanceof Lecturer):it checks if lecturer belong to class Lecturer
             * if (TeacherId == lecturer.getteacherid()):it check if the Teacherid is the same of the teacherid in lecturer
             * JOptionPane.showMessageDialog(): its a method to show to information or error in a dialog box to the user
             * TeacherList.add(new Lecturer(TeacherId, Teachername, Address, Workingtype, Employmentstatus, Workinghours,Department,YearofExperience)):
               it add the lecturer to TeacherList with the given parameters  
             */
            try
            {
                int TeacherId = Integer.parseInt(Teacherid_Field.getText());               
                String Teachername = Teachername_Field.getText();
                String Address = Address_Field.getText();
                String Workingtype = Workingtype_Field.getText();
                String Employmentstatus = Employmentstatus_Field.getText();
                int Workinghours =Integer.parseInt(Workinghours_Field.getText());           
                String Department = Department_Field.getText();
                int YearofExperience = Integer.parseInt(YearofExperience_Field.getText()); 
            
                boolean isequal= false;
                
            
                for(Teacher lecturer: TeacherList)
                {
                    if(lecturer instanceof Lecturer)
                    {
                        if (TeacherId == lecturer.getteacherid())
                        {
                            isequal = true;
                            System.out.println("Please enter a different teacher ID");
                            JOptionPane.showMessageDialog(null, "Please enter a different Teacher ID.", "Add Lecturer Result", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            
                if(isequal == false)
                {
                    TeacherList.add(new Lecturer(TeacherId, Teachername, Address, Workingtype, Employmentstatus, Workinghours,Department,YearofExperience));
                    JOptionPane.showMessageDialog(null, "Lecturer has been added successfully!", "Add Lecturer Result", JOptionPane.INFORMATION_MESSAGE);
                }
                
            }
            catch (NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(null, "Please enter a valid Teacher Id!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else if (e.getSource()==tutor)
        {
            /*
             * try and catch: it does try and if error it use catch and show the required output
             * int TeacherId = Integer.parseInt(Teacherid_Field.getText()):it convert the text that is entered in
                Teacherid_Field into an integer and assign it to TeacherId.
             * for(Teacher tutor: TeacherList):it access the Teacher tutor object like TeacherId,Salary,
                                                  Specialization,etc in the TeacherList
             * if(tutor instanceof Tutor):it checks if tutor belong to class Tutor
             * if (TeacherId == tutor.getteacherid()):it check if the Teacherid is the same of the teacherid in tutor
             * JOptionPane.showMessageDialog(): its a method to show to information or error in a dialog box to the user
             * TeacherList.add(new Tutor(TeacherId, Teachername, Address, Workingtype, Employmentstatus, Workinghours, Salary, Specialization, AcademicQualifications, PerformanceIndex));
               it add the Tutor to TeacherList with the given parameters
            */  
            try
            {
                int TeacherId= Integer.parseInt(Teacherid_Field.getText());
                String Teachername = Teachername_Field.getText();
                String Address = Address_Field.getText();
                String Workingtype = Workingtype_Field.getText();
                String Employmentstatus = Employmentstatus_Field.getText();
                int Workinghours =Integer.parseInt(Workinghours_Field.getText());
                double Salary= Double.parseDouble(Salary_Field.getText());
                String Specialization = Specialization_Field.getText();
                String AcademicQualifications = AcademicQualifications_Field.getText();
                int PerformanceIndex = Integer.parseInt(PerformanceIndex_Field.getText());
        
                Boolean isequal= false ;
            
                for(Teacher tutor: TeacherList)
                {
                    if(tutor instanceof Tutor)
                    {
                        if (TeacherId == tutor.getteacherid())
                        {
                            isequal = true;
                            System.out.println("Please enter a different teacher ID");
                            JOptionPane.showMessageDialog(null, "Please enter a different Teacher ID.", "Add Tutor Result", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            
                if(isequal == false)
                {
                    TeacherList.add(new Tutor(TeacherId, Teachername, Address, Workingtype, Employmentstatus, Workinghours, Salary, Specialization, AcademicQualifications, PerformanceIndex));
                    JOptionPane.showMessageDialog(null, "Tutor has been added successfully!", "Add Tutor Result", JOptionPane.INFORMATION_MESSAGE);
                }
                
            }
            
            catch (NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(null, "Please enter a valid Teacher Id!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
            
        else if (e.getSource()==gradeassignment)
        {
            /*
             * try and catch: it does try and if error it use catch and show the required output
             * int TeacherId = Integer.parseInt(Teacherid_Field.getText()):it convert the text that is entered in
                Teacherid_Field into an integer and assign it to TeacherId.
             * for(Teacher gradeassignment: TeacherList):it access the Teacher grade assignment object like TeacherId,GradedScore,
                                                  Department,etc in the TeacherList
             * if (gradeassignment instanceof Lecturer):it checks if grade assignment belong to class Lecturer
             * if (gradeassignment instanceof Lecturer):it check if the Teacherid is the same of the teacherid in grade assignment
             * JOptionPane.showMessageDialog(): its a method to show to information or error in a dialog box to the user
             */  
            try
            {
                int TeacherId= Integer.parseInt(Teacherid_Field.getText());
                int GradedScore = Integer.parseInt(Gradedscore_Field.getText());
                String Department = Department_Field.getText();
                int YearofExperience = Integer.parseInt(YearofExperience_Field.getText());
            
                Boolean isequal= false ;
                for( Teacher gradeassignment:TeacherList)
                {
                    if (gradeassignment instanceof Lecturer)
                    {
                        Lecturer lecturer = (Lecturer) gradeassignment; 
                        isequal = true;
                        System.out.println(lecturer.GradeAssignment(GradedScore, Department, YearofExperience));
                        JOptionPane.showMessageDialog(null, "Assignment graded successfully!", "Grade Assignment Result", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                }
            
                if (isequal == false)
                {
                    JOptionPane.showMessageDialog(null,"Add Lecturer", "Grade Assignment Result",JOptionPane.ERROR_MESSAGE);
                }
            }
            catch (NumberFormatException ex)
            {
            JOptionPane.showMessageDialog(null, "Please enter a valid Teacher Id!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        
        }else if (e.getSource()==salaryoftutor)
        {
            /*
             * try and catch: it does try and if error it use catch and show the required output.
             * int TeacherId = Integer.parseInt(Teacherid_Field.getText()):it convert the text that is entered in
                Teacherid_Field into an integer and assign it to TeacherId and it used to check if the TeacherId is same or not to the one that was inputted.
             * double Salary= Double.parseDouble(Salary_Field.getText()): it convert the text that is entered in
                Salary_Field into an double and assign it to Salary.
             * for(Teacher salaryoftutor:TeacherList):it access the Teacher salary of tutor object like TeacherId,Salary,
                                                  PeformanceIndex, etc in the TeacherList.
             * if (salaryoftutor instanceof Tutor):it checks if salaryoftutor belong to class Tutor.
             * JOptionPane.showMessageDialog(): its a method to show to information or error in a dialog box to the user.
             */ 
            try
            {
                int TeacherId= Integer.parseInt(Teacherid_Field.getText());//check
                double Salary= Double.parseDouble(Salary_Field.getText());
                int PerformanceIndex = Integer.parseInt(PerformanceIndex_Field.getText());
            
                Boolean isequal=false;
                for(Teacher salaryoftutor:TeacherList)
                {
                    if (salaryoftutor instanceof Tutor)
                    {
                        Tutor tutor =(Tutor) salaryoftutor;
                        isequal= true;
                        System.out.println(tutor.setSalary(Salary,PerformanceIndex));//double
                        JOptionPane.showMessageDialog(null, "The Salary of Tutor is set successfully!", "Salary Of Tutor Result", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            
                if( isequal == false)
                {
                    JOptionPane.showMessageDialog(null, "Tutor has not been added!", "Salary Of Tutor Result", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch (NumberFormatException ex)
            {
            JOptionPane.showMessageDialog(null, "Please enter a valid Teacher Id!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        
        }
        else if (e.getSource()==removethetutor)
        {
            /*
             * try and catch: it does try and if error it use catch and show the required output.
             * int TeacherId = Integer.parseInt(Teacherid_Field.getText()):it convert the text that is entered in
                Teacherid_Field into an integer and assign it to TeacherId and it used to check if the TeacherId is same or not to the one that was inputted.
             * for(Teacher removethetutor:TeacherList):it access the Teacher remove tutor object like TeacherId  in the TeacherList.
             * if (removethetutor instanceof Tutor):it checks if remove tutor belong to class Tutor.
             * JOptionPane.showMessageDialog(): its a method to show to information or error in a dialog box to the user.
             * tutor.remove_tutor():it remove the tutor.
             * Tutor tutor =(Tutor) removethetutor: it remove the tutor in the TeacherList.
             */
            try
            {
                int TeacherId= Integer.parseInt(Teacherid_Field.getText());//check
                Boolean isequal=false;
                for(Teacher removethetutor:TeacherList)
                {
                    if (removethetutor instanceof Tutor)
                    {
                        Tutor tutor =(Tutor) removethetutor;
                        isequal= false;
                        tutor.remove_tutor();
                        JOptionPane.showMessageDialog(null, "Tutor has been removed successfully!", "Remove Tutor Result", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                }
            }
            catch (NumberFormatException ex)
            {
            JOptionPane.showMessageDialog(null, "Please enter a valid Teacher Id!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }else if (e.getSource()==display)
        {
            /*
             * for(Teacher teacher: TeacherList):it access the Teacher tecaher object in the TeacherList.
             * if (teacher instanceof Lecturer):it checks if teacher belong to class Lecturer
             * JOptionPane.showMessageDialog(): its a method to show to information or error in a dialog box to the user
             * Lecturer lecturer_Obj = (Lecturer) teacher: it cast teacher to Lecturer and assign to the lecturer_obj
             * Tutor tutor_Obj = (Tutor) teacher:it cast teacher to Tutor and assign to the tutor_obj
             * lecturer_Obj=temporary object we created for downcasting
             * Tutor_Obj=temporary object we created for downcasting
             * lecturer_Obj.display():it display the lecturer_obj
             * tutor_Obj.display():it display the tutor_obj
             */
            for(Teacher teacher: TeacherList)
            {
                if(teacher instanceof Lecturer)
                {
                    Lecturer lecturer_Obj = (Lecturer) teacher;//lecturer_Obj=temporary object we created for downcasting
                    lecturer_Obj.display();
                    System.out.println("");
                    JOptionPane.showMessageDialog(null, "Lecturer has been displayed successfully!", "Display Result", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    Tutor tutor_Obj = (Tutor) teacher;//tutor_Obj=temporary object we created for downcasting
                    tutor_Obj.display();
                    System.out.println("");
                    JOptionPane.showMessageDialog(null, "Tutor has been displayed successfully!", "Display Result", JOptionPane.INFORMATION_MESSAGE);
                } 
            }
        }
            
        else if (e.getSource()==clear)
        {
            /*
              Teacherid_Field.setText(""): it claer the text that was inputted at Teacherid_Field
              JOptionPane.showMessageDialog(): its a method to show to information or error in a dialog box to the user
            */
            
            Teacherid_Field.setText("");
            Teachername_Field.setText("");
            Address_Field.setText("");
            Workingtype_Field.setText("");
            Employmentstatus_Field.setText("");
            Workinghours_Field.setText("");
            Department_Field.setText("");
            YearofExperience_Field.setText("");
            Gradedscore_Field.setText("");
            Salary_Field.setText("");
            Specialization_Field.setText("");
            AcademicQualifications_Field.setText("");
            PerformanceIndex_Field.setText("");  
            JOptionPane.showMessageDialog(null, "It has been cleared.", "Clear Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    
    public static void main(String[] args) //it a main method where the excution of the program starts
    {
        // it create an instance of TeacherGUI
        TeacherGUI teacherGUI = new TeacherGUI();
    }
}



