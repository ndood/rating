package kg.ksucta.domain;

import kg.ksucta.domain.user.User;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany(mappedBy = "group")
    @Column
    private List<User> users;

    public Group(){}

    public Group(Long id, String groupname, String course){
        this.id = id;
        this.groupname = groupname;
        this.course = course;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
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
