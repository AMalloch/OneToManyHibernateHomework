package models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="owners")
public class Owner {

    private int Id;
    private String name;
    private String username;
    private Set<Folder> folder;

    public Owner(){
    }

    public Owner(String name, String username) {
        this.name = name;
        this.username = username;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getId(){
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @Column(name="username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER)
    public Set<Folder> getFolder() {
        return folder;
    }

    public void setFolder(Set<Folder> folder) {
        this.folder = folder;
    }
}
