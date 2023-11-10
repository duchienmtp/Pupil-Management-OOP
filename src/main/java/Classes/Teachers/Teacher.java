package Classes.Teachers;

import Classes.Classroom.Classroom;
import Classes.Person.Address;
import Classes.Person.Date;
import Classes.Person.Person;


public class Teacher extends Person {
    private String teacherID;
    private Classroom classroom;
    private String major;
    private boolean isDeleted = false;

    public Teacher() {
    }

    public Teacher(String teacherID, String fullname, Date birthDate, Address address) {
        super(fullname, birthDate, address);
        this.teacherID = teacherID;
    }

    public Teacher(String teacherID, Classroom classroom, String major, String fullname, Date birthDate, Address address) {
        super(fullname, birthDate, address);
        this.teacherID = teacherID;
        this.classroom = classroom;
        this.major = major;
    }
    
    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    public boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return teacherID + "\t" + super.toString();
    }
}
