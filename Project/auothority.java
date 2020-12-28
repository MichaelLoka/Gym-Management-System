package Project;

public abstract class auothority {
    //Member[] members;
    String Name;
    String Sex;
    String Address;
    String Hire_Date;
    int[]  phone = new int[3];
    int    SSN;
    int Salary;

    public auothority(String Name, int SSN, String Sex, String Address, int PhoneNumber, int Salary, String Hire_Date){
        this.Name      = Name;
        this.SSN       = SSN;
        this.Sex       = Sex;
        this.Address   = Address;
        for (int i = 0; i < 3; i++)
        {
            if(phone[i] == 0)
            {
                phone[i] = PhoneNumber;
            }
        }
        this.Salary    = Salary;
        this.Hire_Date = Hire_Date;
    }


    // public void ViewMembers_Session(Session[] sessions){}
    // public void ViewMember_Membership(Member[] members){}
    // public void ViewMembers_info(Member[] members){}


}
