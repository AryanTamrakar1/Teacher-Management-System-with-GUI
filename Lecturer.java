
public class Lecturer extends Teacher
{
    //Attribute,Instance Variable
    private String Department;
    private int YearOfExperience;
    private int GradedScore;
    private boolean HasGraded;//boolean - either true or false
    //construtor-value intialization of class//
    public Lecturer(int TeacherId, String TeacherName, String Address, String WorkingType, 
                    String EmploymentStatus, int WorkingHours, String Department, int YearOfExperience)
    {
      //super=call the constructor of the parent class(Teacher class)//
      super(TeacherId, TeacherName, Address, WorkingType, EmploymentStatus);
      super.setworking_hour(WorkingHours);
      // Writing this separately as we have used setter method in the WorkingHour in the parent class(Teacher class) 
      this.Department = Department;
      this.YearOfExperience = YearOfExperience;
      this.GradedScore = 0;
      this.HasGraded = false;  
    }
    //Accessor method - value access or recover
    //Accessor method - Here we return the value of the attributes
    public String getdepartment()
    {
        return this.Department;
    }
    
    public int getyearofexperience()
    {
        return this.YearOfExperience;
    }
     
    public int getgradedscore()
    {
        return this.GradedScore;
    }
    
    public boolean gethasgraded()
    {
        return this.HasGraded;
    }
    
    //Using mutator method for attribute:gradedScore
    //it help to set a new graded score
    //Mutator method=Setter method
    public void setgradedscore(int GradedScore)
    {
        this.GradedScore = GradedScore;
    }
    //Create a method name gradeAssignment to grade assignment
    //Using if,else if and else
    public char GradeAssignment(int GradedScore, String Department, int YearOfExperience)
    {
        //(==)->Equal,(>=)->Greater than or equal to,(&&)->Logical AND
        char Student_Grade=' ';//char = can only store a single character
        this.GradedScore=GradedScore;//Stores parameter value in gradedscore
        this.YearOfExperience = YearOfExperience;//Stores parameter value in YearOfExperience
        if(YearOfExperience >= 5 && (this.Department).equals(Department))    
        {
            if(GradedScore >= 70)
            {
                Student_Grade='A';   
                System.out.println("The grade of the student is : "+Student_Grade);
            }
            else if (GradedScore >= 60 && GradedScore <=69)
            {
                Student_Grade='B';
                System.out.println("The grade of the student is : "+Student_Grade);
            }
            else if(GradedScore >=50 && GradedScore <=59)
            {
                Student_Grade='C';
                System.out.println("The grade of the student is : "+Student_Grade);
            }
            else if(GradedScore >= 40 && GradedScore <=49)
            {
                Student_Grade='D';
                System.out.println("The grade of the student is : "+Student_Grade);
            }
            else if(GradedScore <=39)
            {
                Student_Grade='E';
                System.out.println("The required value of the student grade is : "+Student_Grade);
            }
            HasGraded = true;
        }
        else{
            System.out.println("It is already graded or it cannot be graded");
        }
        return Student_Grade;
        }
    //Method to display lecture and must have same signature as the display in teacher class//
    public void display()
    {
        super.displayTeacher();//(super.display)=displaying the display method of Parent Class(Teacher Class)//
        System.out.println("The department of the lecturer is  " + this.Department);
        System.out.println("The years of experience of the lecturer is " + this.YearOfExperience);
        //if the score has not been graded yet,display suitable message//
        //Using if and else//
        if(HasGraded)
        {
            System.out.println("The graded score is "+GradedScore);
        }
        else
        {
            System.out.println("The score has not been graded yet:");
        }
    }
        }
        
    

    