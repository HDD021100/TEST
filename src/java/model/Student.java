package model;

public class Student {
    private int Id;
    private String Name;
    private boolean Gender;
    private String DOB;

    public Student() {
    }

    public Student(String Name, boolean Gender, String DOB) {
        this.Name = Name;
        this.Gender = Gender;
        this.DOB = DOB;
    }
    public Student(int Id, String Name, boolean Gender, String DOB) {
        this.Id = Id;
        this.Name = Name;
        this.Gender = Gender;
        this.DOB = DOB;
    }
    
    
    public int getId() {
        return Id;
    }
    
    
    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }
    
    public void setName(String Name) {
        this.Name = Name;
    }

    public boolean isGender() {
        return Gender;
    }
    public String getGender(){
        return Gender? "Male":"Female";
    }

    public void setGender(boolean Gender) {
        this.Gender = Gender;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        return "Student{" + "Id=" + Id + ", Name=" + Name + ", Gender=" + Gender + ", DOB=" + DOB + '}';
    }
    
    
    
    
}
