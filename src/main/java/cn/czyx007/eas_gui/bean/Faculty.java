package cn.czyx007.eas_gui.bean;

import java.time.LocalDate;
import java.util.Date;

/**
 * @author : 张宇轩
 * @createTime : 2022/6/24 - 22:05
 */
public class Faculty {
    private String id;//职工号
    private String name;//姓名
    private String password;//密码
    private String sex;//性别
    private Date birth;//出生年月日
    private String department;// 部门 / 所在系
    private String title;//职称

    public Faculty() {
    }

    public Faculty(String id, String name, String password, String sex, Date birth, String department, String title) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.birth = birth;
        this.department = department;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", birth=" + birth +
                ", department='" + department + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
