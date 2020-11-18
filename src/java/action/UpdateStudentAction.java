package action;

import com.opensymphony.xwork2.ActionSupport;
import model.Student;
import model.StudentDB;

public class UpdateStudentAction extends ActionSupport{
    private int Id;
    private String Name;
    private boolean Gender;
    private String DOB; 
    private Student stdUpdate;

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
    public String execute() throws Exception {
        stdUpdate = new Student(Id, Name, Gender, DOB);
        if(new StudentDB().updateStudent(stdUpdate)){
            return "success";
        }
        return "fail";
    }
    
    public String goUpdate() throws Exception{
        return "success";
    }
    
    @Override
    public void validate() {
        if (this.Name.length() == 0) {
            addFieldError("Name", "Name not null");
        }
        if (!this.DOB.matches("\\d{4}-\\d{2}-\\d{2}")) {
            addFieldError("DOB", "DOB is YYYY-MM-DD!");
        }
    }
}
