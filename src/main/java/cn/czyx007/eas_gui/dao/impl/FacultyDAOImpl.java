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
        String sql = "insert into education_administration_system.faculty values (?,?,sha1(?),?,?)";
        return update(connection, sql, faculty.getId(), faculty.getName(), faculty.getPassword(), faculty.getDepartment(), faculty.getTitle()) > 0;
    }

    @Override
    public boolean deleteFaculty(Connection connection, String id) {
        //language=MySQL
        String sql = "";
        return false;
    }

    @Override
    public boolean updateFaculty(Connection connection, String id) {
        //language=MySQL
        String sql = "";
        return false;
    }

    @Override
    public Faculty getFacultyById(Connection connection, String id) {
        //language=MySQL
        String sql = "";
        return null;
    }

    @Override
    public List<Faculty> getFacultyByName(Connection connection, String name) {
        //language=MySQL
        String sql = "";
        return null;
    }
}
