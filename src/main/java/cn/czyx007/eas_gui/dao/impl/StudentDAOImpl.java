package cn.czyx007.eas_gui.dao.impl;

import cn.czyx007.eas_gui.bean.Student;
import cn.czyx007.eas_gui.dao.BaseDAO;
import cn.czyx007.eas_gui.dao.StudentDAO;

import java.sql.Connection;
import java.util.List;

/**
 * @author : 张宇轩
 * @createTime : 2022/6/25 - 13:58
 */
public class StudentDAOImpl extends BaseDAO<Student> implements StudentDAO {
    @Override
    public boolean addStudent(Connection connection, Student student) {
        //language=MySQL
        String sql = "insert into education_administration_system.student values (?,?,sha1(?),?,?,?,?,?)";
        return update(connection,sql,student.getId(),student.getName(),student.getPassword(),student.getSex(),student.getBirth(),student.getDepartment(),student.getGrade(),student.getStuClass()) > 0;
    }

    @Override
    public boolean deleteStudent(Connection connection, String id) {
        //language=MySQL
        String sql = "delete from education_administration_system.student where id = ?";
        return update(connection,sql,id) > 0;
    }

    @Override
    public boolean updateStudent(Connection connection, String id, String department, Integer grade, String stuClass) {
        //language=MySQL
        String sql;
        if (department != null){
            sql = "update education_administration_system.student set department = ? where id = ?";
            return update(connection,sql,department,id) > 0;
        }else if (grade != null){
            sql = "update education_administration_system.student set grade = ? where id = ?";
            return update(connection,sql,grade,id) > 0;
        }else if (stuClass != null){
            sql = "update education_administration_system.student set stuClass = ? where id = ?";
            return update(connection,sql,stuClass,id) > 0;
        }
        return false;
    }

    @Override
    public Student getStudentById(Connection connection, String id) {
        //language=MySQL
        String sql = "select * from education_administration_system.student where id = ?";
        return search(connection,sql,id).get(0);
    }

    @Override
    public List<Student> getStudentByName(Connection connection, String name) {
        //language=MySQL
        String sql = "select * from education_administration_system.student where name = ?";
        return search(connection,sql,name);
    }

    @Override
    public List<Student> getAllStudent(Connection connection) {
        //language=MySQL
        String sql = "select * from education_administration_system.student";
        return search(connection,sql);
    }

    @Override
    public Long checkPassword(Connection connection, String id, String password) {
        //language=MySQL
        String sql = "select password = sha1(?) from education_administration_system.student where id = ?";
        return getValue(connection,sql,password,id);
    }

    @Override
    public boolean changePassword(Connection connection, String id, String newPassword) {
        //language=MySQL
        String sql = "update education_administration_system.student set password = sha1(?) where id = ?";
        return update(connection,newPassword,id) > 0;
    }
}
