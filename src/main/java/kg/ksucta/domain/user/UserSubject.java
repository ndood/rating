package kg.ksucta.domain.user;

import kg.ksucta.domain.subject.Subject;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "USERSUBJECT")
public class UserSubject {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "markSubject")
    private Float markSubject;

    @Column(name = "markProf")
    private Float markProf;

    @Column(name = "semesterID")
    private Long semesterID;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "user")
    private List<User> userID;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "subject")
    private List<Subject> subjectID;

    public UserSubject() { }

    public UserSubject(Long id, Float markSubject, Float markProf, Long semesterID, List<User> userID, List<Subject> subjectID){
        this.id = id;
        this.markProf = markProf;
        this.markSubject = markSubject;
        this.semesterID = semesterID;
        this.subjectID = subjectID;
        this.userID = userID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getMarkSubject() {
        return markSubject;
    }

    public void setMarkSubject(Float markSubject) {
        this.markSubject = markSubject;
    }

    public Float getMarkProf() {
        return markProf;
    }

    public void setMarkProf(Float markProf) {
        this.markProf = markProf;
    }

    public Long getSemesterID() {
        return semesterID;
    }

    public void setSemesterID(Long semesterID) {
        this.semesterID = semesterID;
    }

    public List<User> getUserID() {
        return userID;
    }

    public void setUserID(List<User> userID) {
        this.userID = userID;
    }

    public List<Subject> getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(List<Subject> subjectID) {
        this.subjectID = subjectID;
    }
}
