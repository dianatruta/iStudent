package ro.ubb.istudent.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class AssignmentEntity implements Serializable {

    private Long id;
    private Long studentId;
    private Long courseId;
    private List<Long> attachments;

    private FeedbackEntity feedback;
    private Date date;
    private Date deadline;
    private String description;
    private Boolean isCompleted;

    public AssignmentEntity(){}

    public AssignmentEntity(Long id, Long studentId, Long courseId, List<Long> attachments, FeedbackEntity feedback, Date date, Date deadline, String description) {
        this.id = id;
        this.studentId = studentId;
        this.courseId = courseId;
        this.attachments = attachments;
        this.feedback = feedback;
        this.date = date;
        this.deadline = deadline;
        this.description = description;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public FeedbackEntity getFeedback() {
        return feedback;
    }

    public void setFeedback(FeedbackEntity feedback) {
        this.feedback = feedback;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setAttachments(List<Long> attachments) {
        this.attachments = attachments;
    }

    public List<Long> getAttachments() {
        return attachments;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean isCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(Boolean completed) {
        isCompleted = completed;
    }
}
