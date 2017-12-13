package ro.ubb.istudent.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "feedback")
public class FeedbackEntity {

    private Long id;
    private TeacherEntity teacher;
    private Long studentId;
    private String description;

    public FeedbackEntity(Long id, TeacherEntity teacher, Long studentId, String description) {
        this.id = id;
        this.teacher = teacher;
        this.studentId = studentId;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TeacherEntity getTeacher() {
        return teacher;
    }

    public void setTeacher(TeacherEntity teacher) {
        this.teacher = teacher;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
