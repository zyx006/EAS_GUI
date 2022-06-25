package cn.czyx007.eas_gui.dao.impl;

import cn.czyx007.eas_gui.bean.TeachCourse;
import cn.czyx007.eas_gui.dao.BaseDAO;
import cn.czyx007.eas_gui.dao.TeachCourseDAO;

import java.sql.Connection;
import java.util.List;

/**
 * @author : 张宇轩
 * @createTime : 2022/6/25 - 21:43
 */
public class TeachCourseDAOImpl extends BaseDAO<TeachCourse> implements TeachCourseDAO {
    @Override
    public boolean addTeachCourse(Connection connection, TeachCourse teachCourse) {
        //language=MySQL
        String sql = "insert into education_administration_system.teachcourse values (?,?,?)";
        return update(connection,sql,teachCourse.getCourseId(),teachCourse.getFacultyId(),teachCourse.getLocation()) > 0;
    }

    @Override
    public boolean deleteTeachCourse(Connection connection, String courseId, String facultyId) {
        //language=MySQL
        String sql = "delete from education_administration_system.teachcourse where courseId = ? and facultyId = ?";
        return update(connection,sql,courseId,facultyId) > 0;
    }

    @Override
    public boolean deleteTeachCourseByCourse(Connection connection, String courseId) {
        //language=MySQL
        String sql = "delete from education_administration_system.teachcourse where courseId = ?";
        return update(connection,sql,courseId) > 0;
    }

    @Override
    public boolean deleteTeachCourseByFaculty(Connection connection, String facultyId) {
        //language=MySQL
        String sql = "delete from education_administration_system.teachcourse where facultyId = ?";
        return update(connection,sql,facultyId) > 0;
    }

    @Override
    public boolean updateTeachCourseLocation(Connection connection, String courseId, String facultyId, String location) {
        //language=MySQL
        String sql = "update education_administration_system.teachcourse set location = ? where courseId = ? and facultyId = ?";
        return update(connection,sql,location,courseId,facultyId) > 0;
    }

    @Override
    public TeachCourse searchOnesTeachCourse(Connection connection, String courseId, String facultyId) {
        //language=MySQL
        String sql = "select * from education_administration_system.teachcourse where courseId = ? and facultyId = ?";
        return search(connection,sql,courseId,facultyId).get(0);
    }

    @Override
    public List<TeachCourse> searchTeachCourseByCourseId(Connection connection, String courseId) {
        //language=MySQL
        String sql = "select * from education_administration_system.teachcourse where courseId = ?";
        return search(connection,sql,courseId);
    }

    @Override
    public List<TeachCourse> searchTeachCourseByFacultyId(Connection connection, String facultyId) {
        //language=MySQL
        String sql = "select * from education_administration_system.teachcourse where facultyId = ?";
        return search(connection,sql,facultyId);
    }

    @Override
    public List<TeachCourse> searchAllTeachCourse(Connection connection) {
        //language=MySQL
        String sql = "select * from education_administration_system.teachcourse";
        return search(connection,sql);
    }
}
