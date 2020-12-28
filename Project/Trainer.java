package Project;

public class Trainer extends notAuothority{

    //session[] session;
    //session[] Holds;
    //member[] members;
    //member[] mentor
    int Salary;

    public Trainer(String Name, int SSN, String Sex, String Address, int PhoneNumber, int Salary){
        super(Name, SSN, Sex, Address, PhoneNumber);
        this.Salary = Salary;
    }
    
}