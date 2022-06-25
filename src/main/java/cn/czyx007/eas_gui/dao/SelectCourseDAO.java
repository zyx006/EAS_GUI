package cn.czyx007.eas_gui.dao;

import cn.czyx007.eas_gui.bean.Course;
import cn.czyx007.eas_gui.bean.SelectCourse;

import java.sql.Connection;
import java.util.List;

/**
 * @author : 张宇轩
 * @createTime : 2022/6/25 - 21:24
 */
public interface SelectCourseDAO {
    //添加一条选课信息
    boolean addSelectCourse(Connection connection, SelectCourse selectcourse);
    //删除一条选课信息
    boolean deleteSelectCourse(Connection connection,String courseId,String studentId);
    //删除某课程选课信息
    boolean deleteSelectCourseByCourse(Connection connection,String courseId);
    //删除某学生选课信息
    boolean deleteSelectCourseByStudent(Connection connection,String studentId);
    //修改课程成绩
    boolean updateSelectCourseGrade(Connection connection,String courseId,String studentId,Integer grade);
    //查询某人某科成绩
    SelectCourse searchOnesSelectCourse(Connection connection,String courseId,String studentId);
    //根据课程号查询课程
    List<SelectCourse> searchSelectCourseByCourseId(Connection connection,String courseId);
    //根据学名查询课程
    List<SelectCourse> searchSelectCourseByStudentId(Connection connection, String studentId);
    //查询所有课程
    List<SelectCourse> searchAllSelectCourse(Connection connection);
}
