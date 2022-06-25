package cn.czyx007.eas_gui.dao;

import cn.czyx007.eas_gui.bean.Course;

import java.sql.Connection;
import java.util.List;

/**
 * @author : 张宇轩
 * @createTime : 2022/6/25 - 20:47
 */
public interface CourseDAO {
    //添加一门课程
    boolean addCourse(Connection connection, Course course);
    //删除一门课程
    boolean deleteCourse(Connection connection,String id);
    //修改课程学分
    boolean updateCourseCredit(Connection connection,String id,Integer credit);
    //修改选课人数
    boolean updateCourseChooseCnt(Connection connection,String id,int change);
    //根据课程号查询课程
    Course searchCourseById(Connection connection,String id);
    //根据课程名查询课程
    List<Course> searchCourseByName(Connection connection,String name);
    //查询所有课程
    List<Course> searchAllCourse(Connection connection);
}
