package cn.czyx007.eas_gui.dao;

import cn.czyx007.eas_gui.bean.Faculty;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

/**
 * @author : 张宇轩
 * @createTime : 2022/6/24 - 22:28
 */
public interface FacultyDAO {
    //添加一名教职工
    boolean addFaculty(Connection connection,Faculty faculty);
    //根据职工号删除一名教职工
    boolean deleteFaculty(Connection connection,String id);
    //根据职工号更新一名教职工的信息
    boolean updateFaculty(Connection connection,String id,String password,String department,String title);
    //根据职工号查找一名教职工
    Faculty getFacultyById(Connection connection,String id);
    //根据姓名查找匹配的教职工
    List<Faculty> getFacultyByName(Connection connection,String name);
    //检查职工号与密码是否匹配
    Long checkPassword(Connection connection,String id,String password);
}
