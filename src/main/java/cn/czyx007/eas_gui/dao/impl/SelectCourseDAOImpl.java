package cn.czyx007.eas_gui.dao.impl;

import cn.czyx007.eas_gui.bean.Course;
import cn.czyx007.eas_gui.bean.SelectCourse;
import cn.czyx007.eas_gui.dao.BaseDAO;
import cn.czyx007.eas_gui.dao.SelectCourseDAO;

import java.sql.Connection;
import java.util.List;

/**
 * @author : 张宇轩
 * @createTime : 2022/6/25 - 21:27
 */
public class SelectCourseDAOImpl extends BaseDAO<SelectCourse> implements SelectCourseDAO {
    @Override
    public boolean addSelectCourse(Connection connection, SelectCourse selectCourse) {
        //language=MySQL
        String sql = "insert into education_administration_system.selectcourse values (?,?,?)";
        return update(connection,sql,selectCourse.getCourseId(),selectCourse.getStudentId(),selectCourse.getGrade()) > 0;
    }

    @Override
    public boolean deleteSelectCourse(Connection connection, String courseId,String studentId) {
        //language=MySQL
        String sql = "delete from education_administration_system.selectcourse where courseId = ? and studentId = ?";
        return update(connection,sql,courseId,studentId) > 0;
    }

    @Override
    public boolean deleteSelectCourseByCourse(Connection connection, String courseId) {
        //language=MySQL
        String sql = "delete from education_administration_system.selectcourse where courseId = ?";
        return update(connection,sql,courseId) > 0;
    }

    @Override
    public boolean deleteSelectCourseByStudent(Connection connection, String studentId) {
        //language=MySQL
        String sql = "delete from education_administration_system.selectcourse where studentId = ?";
        return update(connection,sql,studentId) > 0;
    }

    @Override
    public boolean updateSelectCourseGrade(Connection connection, String courseId, String studentId,Integer grade) {
        //language=MySQL
        String sql = "update education_administration_system.selectcourse set grade = ? where courseId = ? and studentId = ?";
        return update(connection,sql,grade,courseId,studentId) > 0;
    }

    @Override
    public SelectCourse searchOnesSelectCourse(Connection connection, String courseId, String studentId) {
        //language=MySQL
        String sql = "select * from education_administration_system.selectcourse where courseId = ? and studentId = ?";
        return search(connection,sql,courseId,studentId).get(0);
    }

    @Override
    public List<SelectCourse> searchSelectCourseByCourseId(Connection connection, String courseId) {
        //language=MySQL
        String sql = "select * from education_administration_system.selectcourse where courseId = ?";
        return search(connection,sql,courseId);
    }

    @Override
    public List<SelectCourse> searchSelectCourseByStudentId(Connection connection, String studentId) {
        //language=MySQL
        String sql = "select * from education_administration_system.selectcourse where studentId = ?";
        return search(connection,sql,studentId);
    }

    @Override
    public List<SelectCourse> searchAllSelectCourse(Connection connection) {
        //language=MySQL
        String sql = "select * from education_administration_system.selectcourse";
        return search(connection,sql);
    }
}
