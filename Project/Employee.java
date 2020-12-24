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

    // private void AddMember_System(Member[] members,int MemberID){}
    // private void EditMember_System(Member[] members,int MemberID){}
    // private void RemoveMember_System(Member[] members,int MemberID){}
    // private void AddMember_Session(Session[] sessions,int MemberID){}
    // private void RemoveMember_Session(Session[] sessions,int MemberID){}
    // private void ViewMembers_Session(Session[] sessions){}
    // private void ViewMember_Membership(Member[] members){}
    // private void ViewMembers_info(Member[] members){}

}