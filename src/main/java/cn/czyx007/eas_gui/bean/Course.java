package cn.czyx007.eas_gui.bean;

/**
 * @author : 张宇轩
 * @createTime : 2022/6/25 - 20:19
 */
public class Course {
    private String id;//课程号
    private String name;//课程名
    private Integer credit;//学分
    private Integer cnt;//选科人数

    public Course() {
    }

    public Course(String id, String name, Integer credit, Integer cnt) {
        this.id = id;
        this.name = name;
        this.credit = credit;
        this.cnt = cnt;
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

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public Integer getCnt() {
        return cnt;
    }

    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", credit=" + credit +
                ", cnt=" + cnt +
                '}';
    }
}
