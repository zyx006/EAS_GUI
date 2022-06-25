package cn.czyx007.eas_gui.dao;

import cn.czyx007.eas_gui.bean.SelectCourse;
import cn.czyx007.eas_gui.bean.TeachCourse;

import java.sql.Connection;
import java.util.List;

/**
 * @author : 张宇轩
 * @createTime : 2022/6/25 - 21:39
 */
public interface TeachCourseDAO {
    //添加一条授课信息
    boolean addTeachCourse(Connection connection, TeachCourse teachCourse);
    //删除一条授课信息
    boolean deleteTeachCourse(Connection connection,String courseId,String facultyId);
    //删除某课程授课信息
    boolean deleteTeachCourseByCourse(Connection connection,String courseId);
    //删除某老师授课信息
    boolean deleteTeachCourseByFaculty(Connection connection,String facultyId);
    //修改授课地点
    boolean updateTeachCourseLocation(Connection connection,String courseId,String facultyId,String location);
    //查询某老师某课授课地点
    TeachCourse searchOnesTeachCourse(Connection connection,String courseId,String facultyId);
    //根据课程号查询授课信息
    List<TeachCourse> searchTeachCourseByCourseId(Connection connection, String courseId);
    //根据教师工号查询授课信息
    List<TeachCourse> searchTeachCourseByFacultyId(Connection connection, String facultyId);
    //查询所有授课信息
    List<TeachCourse> searchAllTeachCourse(Connection connection);
}
