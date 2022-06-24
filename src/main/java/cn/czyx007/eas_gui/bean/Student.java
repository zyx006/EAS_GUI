package cn.czyx007.eas_gui.bean;

/**
 * @author : 张宇轩
 * @createTime : 2022/6/24 - 22:07
 */
public class Student {
    private String id;//学号
    private String name;//姓名
    private String password;//密码
    private String department;//所在系
    private Integer grade;//年级
    private String stuClass;//班级

    public Student() {
    }

    public Student(String id, String name, String password, String department, Integer grade, String stuClass) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.department = department;
        this.grade = grade;
        this.stuClass = stuClass;
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

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", department='" + department + '\'' +
                ", grade=" + grade +
                ", stuClass='" + stuClass + '\'' +
                '}';
    }
}
