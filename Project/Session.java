package Project;

public class Session {
    final int num_of_trainers = 1;
    final int num_of_members = 15;
    String description;
    String type;
    String date;

    public Session(String description, String type, String date){
        this.description = description;
        this.type = type;
        this.date = date;
    }
}
