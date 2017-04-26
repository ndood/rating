package kg.ksucta.domain.user;

import kg.ksucta.domain.subject.Subject;

import javax.persistence.*;

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

    @Column(name = "semesterId")
    private Long semesterId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subjectId")
    private Subject subject;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;

    public UserSubject() { }

    public UserSubject(Long id, Float markSubject, Float markProf, Long semesterId, User user, Subject subject){
        this.id = id;
        this.markProf = markProf;
        this.markSubject = markSubject;
        this.semesterId = semesterId;
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

    public Long getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(Long semesterId) {
        this.semesterId = semesterId;
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
