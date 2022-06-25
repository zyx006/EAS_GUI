package cn.czyx007.eas_gui.dao;

import cn.czyx007.eas_gui.bean.Faculty;
import cn.czyx007.eas_gui.bean.Student;

import java.sql.Connection;
import java.util.List;

/**
 * @author : 张宇轩
 * @createTime : 2022/6/25 - 13:56
 */
public interface StudentDAO {
    //添加一名学生
    boolean addStudent(Connection connection, Student student);
    //根据学号删除一名学生
    boolean deleteStudent(Connection connection,String id);
    //根据学号更新一名学生的信息
    boolean updateStudent(Connection connection,String id,String department,Integer grade,String stuClass);
    //根据学号查找一名学生
    Student getStudentById(Connection connection, String id);
    //根据姓名查找匹配的学生
    List<Student> getStudentByName(Connection connection, String name);
    //查询所有学生
    List<Student> getAllStudent(Connection connection);
    //检查学号与密码是否匹配
    Long checkPassword(Connection connection,String id,String password);
    //根据学号修改密码
    boolean changePassword(Connection connection,String id,String newPassword);
}
