import java.util.*;

class SmartCard
{
    int emp_idn;
    public void MarkAttendance(Employee e)
    {
        emp_idn = e.getempId();
        //instructions to mark present for empid ...
        System.out.println("Employee " + emp_idn + " is marked present");
    }
    public int getempIdn(Employee e){
        return e.empid;
    }
}

class Employee
{
    int empid;
    Employee(){
        System.out.println("Enter Employee id");
        Scanner sc = new Scanner(System.in);
        this.empid = sc.nextInt();
    }
    int getempId()
    {
        return empid;
    }
    public void Login(SmartCard sc){
        //instruction to Login functionality
        //get empid of the smartcard holder
        int eid = sc.getempIdn(this);
        //Login and Mark attendance
        System.out.println("Login successfully for employee "+ eid);
    }
}

 class AssociationDemo
{
    public static void main(String args[])
    {
        System.out.println("*** Association between Employee and Smart card ***");
        Employee e = new Employee();
        System.out.println("New Employee is Created");
        SmartCard scd = new SmartCard();
        scd.MarkAttendance(e);    //passing the reference of emp to smartcard
        e.Login(scd);             //passing the reference of Smartcard to emp
    }
}