package kg.ksucta.domain.mark;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import kg.ksucta.domain.subject.Subject;
import kg.ksucta.domain.user.User;

import javax.persistence.*;

@Entity
@Table(name = "MARK")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Mark {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "markSubject")
    private Float markSubject;

    @Column(name = "markProf")
    private Float markProf;

    @Column(name = "semester")
    private Long semester;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subjectId")
    private Subject subject;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;

    public Mark() { }

    public Mark(Long id, Float markSubject, Float markProf, Long semester, User user, Subject subject){
        this.id = id;
        this.markProf = markProf;
        this.markSubject = markSubject;
        this.semester = semester;
        this.subject = subject;
        this.user = user;
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

    public Long getSemester() {
        return semester;
    }

    public void setSemester(Long semester) {
        this.semester = semester;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
