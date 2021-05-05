package day3_hw2;

public class Instructor extends User {

    private int instructorID;
    private String branch;

    public Instructor(){

    }


    public Instructor(int ID, String name, String surname, int age, String email, String phoneNumber, int instructorID, String branch) {
        super(ID, name, surname, age, email, phoneNumber);
        this.instructorID = instructorID;
        this.branch = branch;
    }

    public int getInstructorID() {
        return instructorID;
    }

    public void setInstructorID(int instructorID) {
        this.instructorID = instructorID;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
