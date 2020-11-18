/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import com.opensymphony.xwork2.ActionSupport;
import model.StudentDB;

public class DeleteStudentAction extends ActionSupport{
    private int Id;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    @Override
    public String execute() throws Exception {
        boolean res = new StudentDB().deleteStudent(Id);
        System.out.println(res);
        if(res){
            return "success";
        }
        return "fail";
    }
    
    
    
}
