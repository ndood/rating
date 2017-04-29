package kg.ksucta.domain;

import javax.persistence.*;

@Entity
@Table(name="GROUP_")
public class Group {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "groupname")
    private String groupname;

    @Column(name = "course")
    private String course;

    public Group(){}

    public Group(Long id, String groupname, String course){
        this.id = id;
        this.groupname = groupname;
        this.course = course;
    }

    public Long getId() {
        return id;
    }

    public String getGroupname() {
        return groupname;
    }

    public String getCourse() {
        return course;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
