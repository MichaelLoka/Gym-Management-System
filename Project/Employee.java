package Project;

public class Employee {
    //Member[] members;
    //Session[] sessions;
    String Name;
    int Salary;
    int SSN;
    String Sex;
    String Address;
    String Hire_Date;
    int[] phone = new int[3];

    public Employee(String Name, int Salary, int SSN, String Sex, String Address, int PhoneNumber, String Hire_Date){
        this.Name      = Name;
        this.Salary    = Salary;
        this.SSN       = SSN;
        this.Sex       = Sex;
        this.Address   = Address;
        this.Hire_Date = Hire_Date;
        for (int i = 0; i < 3; i++)
        {
            if(phone[i] == 0)
            {
                phone[i] = PhoneNumber;
            }
        }
    }

    // public void AddMember_System(Member[] members,int MemberID){}
    // public void EditMember_System(Member[] members,int MemberID){}
    // public void RemoveMember_System(Member[] members,int MemberID){}
    // public void AddMember_Session(Session[] sessions,int MemberID){}
    // public void RemoveMember_Session(Session[] sessions,int MemberID){}
    // public void ViewMembers_Session(Session[] sessions){}
    // public void ViewMember_Membership(Member[] members){}
    // public void ViewMembers_info(Member[] members){}

}