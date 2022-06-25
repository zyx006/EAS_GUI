package cn.czyx007.eas_gui.dao.impl;

import cn.czyx007.eas_gui.bean.Faculty;
import cn.czyx007.eas_gui.dao.BaseDAO;
import cn.czyx007.eas_gui.dao.FacultyDAO;

import java.sql.Connection;
import java.util.List;

/**
 * @author : 张宇轩
 * @createTime : 2022/6/24 - 22:29
 */
public class FacultyDAOImpl extends BaseDAO<Faculty> implements FacultyDAO {
    @Override
    public boolean addFaculty(Connection connection, Faculty faculty) {
        //language=MySQL
        String sql = "insert into education_administration_system.faculty values (?,?,sha1(?),?,?,?,?)";
        return update(connection, sql, faculty.getId(), faculty.getName(), faculty.getPassword(), faculty.getSex(),faculty.getBirth(), faculty.getDepartment(), faculty.getTitle()) > 0;
    }

    @Override
    public boolean deleteFaculty(Connection connection, String id) {
        //language=MySQL
        String sql = "delete from education_administration_system.faculty where id = ?";
        return update(connection,sql,id) > 0;
    }

    @Override
    public boolean updateFaculty(Connection connection, String id,String department,String title) {
        //language=MySQL
        String sql;
        if (department != null){
            sql = "update education_administration_system.faculty set department = ? where id = ?";
            return update(connection,sql,department,id) > 0;
        }else if (title != null){
            sql = "update education_administration_system.faculty set title = ? where id = ?";
            return update(connection,sql,title,id) > 0;
        }
        return false;
    }

    @Override
    public Faculty getFacultyById(Connection connection, String id) {
        //language=MySQL
        String sql = "select * from education_administration_system.faculty where id = ?";
        return search(connection, sql, id).get(0);
    }

    @Override
    public List<Faculty> getFacultyByName(Connection connection, String name) {
        //language=MySQL
        String sql = "select * from education_administration_system.faculty where name = ?";
        return search(connection,sql,name);
    }

    @Override
    public List<Faculty> getAllFaculty(Connection connection) {
        //language=MySQL
        String sql = "select * from education_administration_system.faculty";
        return search(connection,sql);
    }

    @Override
    public Long checkPassword(Connection connection, String id, String password) {
        //language=MySQL
        String sql = "select password = sha1(?) from education_administration_system.faculty where id = ?";
        return getValue(connection,sql,password,id);
    }

    @Override
    public boolean changePassword(Connection connection, String id, String newPassword) {
        //language=MySQL
        String sql = "update education_administration_system.faculty set password = sha1(?) where id = ?";
        return update(connection,newPassword,id) > 0;
    }
}
