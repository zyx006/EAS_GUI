package cn.czyx007.eas_gui.dao.impl;

import cn.czyx007.eas_gui.bean.Course;
import cn.czyx007.eas_gui.dao.BaseDAO;
import cn.czyx007.eas_gui.dao.CourseDAO;

import java.sql.Connection;
import java.util.List;

/**
 * @author : 张宇轩
 * @createTime : 2022/6/25 - 21:14
 */
public class CourseDAOImpl extends BaseDAO<Course> implements CourseDAO {
    @Override
    public boolean addCourse(Connection connection, Course course) {
        //language=MySQL
        String sql = "insert into education_administration_system.course values (?,?,?,?)";
        return update(connection,sql,course.getId(),course.getName(),course.getCredit(),course.getCnt()) > 0;
    }

    @Override
    public boolean deleteCourse(Connection connection, String id) {
        //language=MySQL
        String sql = "delete from education_administration_system.course where id = ?";
        return update(connection,sql,id) > 0;
    }

    @Override
    public boolean updateCourseCredit(Connection connection, String id, Integer credit) {
        //language=MySQL
        String sql = "update education_administration_system.course set credit = ? where id = ?";
        return update(connection,sql,credit,id) > 0;
    }

    @Override
    public boolean updateCourseChooseCnt(Connection connection, String id, int change) {
        //language=MySQL
        String sql = "update education_administration_system.course set cnt = cnt + ? where id = ?";
        return update(connection,sql,change,id) > 0;
    }

    @Override
    public Course searchCourseById(Connection connection, String id) {
        //language=MySQL
        String sql = "select * from education_administration_system.course where id = ?";
        return search(connection,sql,id).get(0);
    }

    @Override
    public List<Course> searchCourseByName(Connection connection, String name) {
        //language=MySQL
        String sql = "select * from education_administration_system.course where name = ?";
        return search(connection,sql,name);
    }

    @Override
    public List<Course> searchAllCourse(Connection connection) {
        //language=MySQL
        String sql = "select * from education_administration_system.course";
        return search(connection,sql);
    }
}
