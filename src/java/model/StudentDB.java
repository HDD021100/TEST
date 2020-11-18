package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDB {

    public ArrayList<Student> getAllStudents() {
        ArrayList<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM Student";
        try {
            Connection conn = new ConnectDB().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student std = new Student();
                std.setId(rs.getInt(1));
                std.setName(rs.getString(2));
                std.setGender(rs.getBoolean(3));
                std.setDOB(rs.getString(4));
                list.add(std);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean addNewStudent(Student std) {
        try {
            Connection conn = new ConnectDB().getConnection();
            String sql = "INSERT INTO Student (Name,Gender,DOB)  VALUES(?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, std.getName());
            ps.setBoolean(2, std.isGender());
            ps.setString(3, std.getDOB());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Add Failed!");
        }
        return false;
    }

    public boolean deleteStudent(int id) {
        String sql = "Delete from Student where Id=N'" + id + "'";
        try {
            System.out.println(sql);
            Connection conn = new ConnectDB().getConnection();
            Statement stmt = conn.createStatement();
            return stmt.executeUpdate(sql) > 0;
        } catch (Exception e) {
            System.out.println("Delete Fail!");
        }
        return false;
    }

    public boolean updateStudent(Student std) {
        String sql = "Update Student set Name = ?, Gender = ?, DOB = ? where Id = ?";
        try {
            Connection con = new ConnectDB().getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, std.getName());
            pstmt.setBoolean(2, std.isGender());
            pstmt.setString(3, std.getDOB());
            pstmt.setInt(4, std.getId());
            System.out.println(std);
            return pstmt.executeUpdate() > 0;
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return false;
    }
    
//    public static void main(String[] args) {
//        new StudentDB().addNewStudent(new StudentAction("Huynh Dang Dat", true, "2000-01-01"));
//    }
    
}
