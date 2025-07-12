
public class Teacher
{
    //Attributes, Instance variable
    private int TeacherId;//int can hold whole number like 26,77,55, etc
    private String TeacherName;// String can hold more than one character like Dog,Cat,Bird,etc
    private String Address;
    private String WorkingType;
    private String EmploymentStatus;
    private int WorkingHours;
    //construtor-value intialization of class
    public Teacher(int TeacherId, String TeacherName, String Address, String WorkingType, String EmploymentStatus) 
    {
        this.TeacherId = TeacherId;
        this.TeacherName = TeacherName;
        this.Address = Address;
        this.WorkingType= WorkingType;
        this.EmploymentStatus = EmploymentStatus;
    }
    //Accessor method-value access or recover
    //Here we return the value of the attributes
    public int getteacherid()
    {
        return this.TeacherId;
    }

    public String getteachername()
    {
        return this.TeacherName;
    }
    
    public String getaddress()
    {
        return this.Address;
    }
    
    public String getworkingtype()
    {
        return this.WorkingType;
    }
    /*a
     * a
     */public String getemploymentstatus()
    {
        return this.EmploymentStatus;
    }
    
     public int getworking_hours()
    {
        return this.WorkingHours;
    }
    //set the working hours 
    //Using Setter Method to set the workinghours
    //it help to set a new workinghour
    public void setworking_hour(int new_WorkingHours)
    {
        this.WorkingHours=new_WorkingHours;
    }
   
    
    //Display Method for the Teacher
    public void displayTeacher()
    {
        System.out.println("The TeacherId of the teacher is : " +this.TeacherId);
        System.out.println("The TeacherName of the teacher is : " +this.TeacherName);
        System.out.println("The Address of the teacher is : " +this.Address);
        System.out.println("The WorkingType of the teacher is : " +this.WorkingType);
        System.out.println("The Employment status of the teacher is : " +this.EmploymentStatus);

        //if the working hour is not assiged,display a suitable message
        //Using if,else
        //(>) means Greater than
        if (WorkingHours > 0)
        {
            System.out.println("The Working hour is assiged: " +WorkingHours);
        }
        else
        {
            System.out.println("The Working Hour is not assiged");
        } 
    }
}