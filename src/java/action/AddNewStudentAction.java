package action;

import com.opensymphony.xwork2.ActionSupport;
import model.Student;
import model.StudentDB;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

//@Action("add-new")
//@ResultPath("/add-new")
//@Namespace("/add-new")
//@Result(location = "home.jsp", name = "success")
public class AddNewStudentAction extends ActionSupport {

    private String Name;
    private boolean Gender;
    private String DOB;

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
        Student std = new Student(Name, Gender, DOB);
        System.out.println(std);
        boolean res = new StudentDB().addNewStudent(std);
        System.out.println(res);
        if (res) {
            return "success";
        }
        return "fail";
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
