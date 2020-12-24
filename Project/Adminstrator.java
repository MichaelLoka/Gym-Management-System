package Project;

public class Adminstrator extends Person {
    //Trainer[] trainers;
    //Session[] sessions;
    int Salary;
    String Hire_Date;


    public Adminstrator(String Name, int Salary, int SSN, String Sex, String Address, int PhoneNumber, String Hire_Date){
        super(Name, SSN, Sex, Address, PhoneNumber);
        this.Salary    = Salary;
        this.Hire_Date = Hire_Date;
    }

    // public void addTrainer_System(Trainer[] trainers){}
    // public void editTrainer_System(Trainer[] trainers,int TrainerID){}
    // public void RemoveTrainer_System(Trainer[] trainers,int TrainerID){}
    // public void AddSession(Session[] sessions){}
    // public void editSession(Session[] sessions,int SessionID){}
    // public void RemoveSession(Session[] sessions,int SessionID){}
    // public void AssginTrainer_Member(int TrainerID,int MemberID){}

    
}
