package Project;

public class Adminstrator {
    //Trainer[] trainers;
    //Session[] sessions;
    //Member[] members;
    String Name;
    int Salary;
    int SSN;
    String Sex;
    String Address;
    String Hire_Date;
    int[] phone = new int[3];

    public Adminstrator(String Name, int Salary, int SSN, String Sex, String Address, int PhoneNumber, String Hire_Date){
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

    // public void addTrainer_System(Trainer[] trainers){}
    // public void editTrainer_System(Trainer[] trainers,int TrainerID){}
    // public void RemoveTrainer_System(Trainer[] trainers,int TrainerID){}
    // public void AddSession(Session[] sessions){}
    // public void editSession(Session[] sessions,int SessionID){}
    // public void RemoveSession(Session[] sessions,int SessionID){}
    // public void AssginTrainer_Member(int TrainerID,int MemberID){}
    // public void editSession(Session[] sessions,int SessionID){}
    // public void ViewMembers_Session(Session[] sessions){}
    // public void ViewMember_Membership(Member[] members){}
    // public void ViewMembers_info(Member[] members){}








    
}
