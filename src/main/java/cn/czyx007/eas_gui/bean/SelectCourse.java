package cn.czyx007.eas_gui.bean;

/**
 * @author : 张宇轩
 * @createTime : 2022/6/25 - 20:20
 */
public class SelectCourse {
    private String courseId;//课程号
    private String studentId;//学生学号
    private Double grade;//成绩

    public SelectCourse() {
    }

    public SelectCourse(String courseId, String studentId, Double grade) {
        this.courseId = courseId;
        this.studentId = studentId;
        this.grade = grade;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "SelectCourse{" +
                "courseId='" + courseId + '\'' +
                ", studentId='" + studentId + '\'' +
                ", grade=" + grade +
                '}';
    }
}
