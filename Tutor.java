
public class Tutor extends Teacher
{
    //Attributes instance variable
    private double Salary;//double = can hold double point number like 1.123
    private String Specialization;
    private String AcademicQualification;
    private int PerformanceIndex;
    private boolean IsCertified;//boolean - either true or false
    
    //construtor-value intialization of class
    public Tutor(int TeacherId, String TeacherName, String Address, String WorkingType, 
                 String EmploymentStatus, int WorkingHours, double Salary, String Specialization, 
                 String AcademicQualification, int PerformanceIndex)
    {
        super(TeacherId, TeacherName, Address, WorkingType,EmploymentStatus);
        super.setworking_hour(WorkingHours);// setter method
        this.Salary = Salary;
        this.Specialization = Specialization;
        this.AcademicQualification = AcademicQualification;
        this.PerformanceIndex = PerformanceIndex;
        this.IsCertified = false;
        
    }
    //Accessor Method//
    //Accessor method - Here we return the value of the attributes//
    public double getsalary()
    {
        return this.Salary;
    }
    
    public String getspecialization()
    {
        return this.Specialization;
    }
    
    public String getacademicqualification()
    {
        return this.AcademicQualification;
    }
    
    public int getperformanceindex()
    {
        return this.PerformanceIndex;
    }
    
    public boolean getiscertified()
    {
        return this.IsCertified;
    }
    
    //Method to set salary as each tutor can have different salaries.
    //Using Mutator Method
    //Using if,else if and else
    public double setSalary(double New_Salary, int New_PerformanceIndex)//it was void and there was no return but after keeping double there is return
    {
        double appraisal = 0.00;//double = can hold double point number like 1.123
        this.PerformanceIndex=New_PerformanceIndex;// Store the value of New_PerformanceIndex to PerformanceIndex
        this.Salary=New_Salary; // Store the value of New_Salary to Salary
        if(New_PerformanceIndex >= 5 && getworking_hours() > 10)
        //(>=)=Greater than or equal to, (>)=Greater than//
        {
            if(New_PerformanceIndex >=5 && New_PerformanceIndex <=7)
            {
                appraisal = 0.05;//0.05=5%
            }
            
            else if(New_PerformanceIndex >=8 && New_PerformanceIndex <=9)
            {
                appraisal = 0.1;//0.1=10%
            }
            else if(New_PerformanceIndex ==10)
            {
                appraisal = 0.2;//0.2=20%
            }
            this.IsCertified=true;
            this.Salary=New_Salary + appraisal * New_Salary;//The formula to calculate the salary
            System.out.println("The requried Salary of the person is : " + this.Salary);
        }
        else
        {
           System.out.println("Salary cannot be approved  : "); 
        }
        return Salary;
    }
    //Method to remove tutor
    //Using if and else
    public void remove_tutor()
    {
        if(IsCertified==false)
        {
            this.Salary=0.000;
            this.Specialization="";
            this.AcademicQualification="";
            this.PerformanceIndex=0;
            this.IsCertified= false;
            System.out.println("Tutor is removed successfully");
        }
        else
        {
        System.out.println("Tutor cannot be removed");
        }
        
    }
    //Method to display tutor class
    //Using If and else according to the question
    public void display()
    {
        if(IsCertified==false)
        {
            super.displayTeacher();
        }
        else 
        {
            super.displayTeacher();
            System.out.println("The salary is : " + Salary);
            System.out.println("The specialization is : " + Specialization);
            System.out.println("The academic qualification is : " + AcademicQualification);
            System.out.println("The performance index is : " + PerformanceIndex);
        }
        
    }
}
