package kg.ksucta.domain.subject;

import javax.persistence.*;

@Entity
@Table(name = "SUBJECT")
public class Subject {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "subjectName")
    private String subjectName;

    public Subject() {
    }

    public Subject(Long id, String subjectName){
        this.id = id;
        this.subjectName = subjectName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
