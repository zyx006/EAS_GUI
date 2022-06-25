package cn.czyx007.eas_gui.bean;

/**
 * @author : 张宇轩
 * @createTime : 2022/6/25 - 20:21
 */
public class TeachCourse {
    private String courseId;//课程号
    private String facultyId;//教师工号
    private String location;//授课地点

    public TeachCourse() {
    }

    public TeachCourse(String courseId, String facultyId, String location) {
        this.courseId = courseId;
        this.facultyId = facultyId;
        this.location = location;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "TeachCourse{" +
                "courseId='" + courseId + '\'' +
                ", facultyId='" + facultyId + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
