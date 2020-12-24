package Project;

public class Employee extends Person{
    //Member[] members;
    //Session[] sessions;
    int Salary;
    String Hire_Date;
    
    public Employee(String Name, int Salary, int SSN, String Sex, String Address, int PhoneNumber, String Hire_Date){
        super(Name, SSN, Sex, Address, PhoneNumber);
        this.Salary    = Salary;
        this.Hire_Date = Hire_Date;
    }

    // public void AddMember_System(Member[] members,int MemberID){}
    // public void EditMember_System(Member[] members,int MemberID){}
    // public void RemoveMember_System(Member[] members,int MemberID){}
    // public void AddMember_Session(Session[] sessions,int MemberID){}
    // public void RemoveMember_Session(Session[] sessions,int MemberID){}

}