package Project;

public abstract class Person {
    //Member[] members;
    String Name;
    int SSN;
    String Sex;
    String Address;
    int[] phone = new int[3];

    public Person(String Name, int SSN, String Sex, String Address, int PhoneNumber){
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
    }


    // public void ViewMembers_Session(Session[] sessions){}
    // public void ViewMember_Membership(Member[] members){}
    // public void ViewMembers_info(Member[] members){}


}
