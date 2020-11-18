package action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import model.Student;
import model.StudentDB;

public class DisplayStudentAction extends ActionSupport {

    private ArrayList<Student> listStudents;
    
    @Override
    public String execute() throws Exception {
        listStudents = new StudentDB().getAllStudents();
        if (listStudents != null) {
            return "success";
        }
        return "fail";
    }

    public ArrayList<Student> getListStudents() {
        return listStudents;
    }

    public void setListStudents(ArrayList<Student> listStudents) {
        this.listStudents = listStudents;
    }
}
