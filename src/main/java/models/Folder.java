package models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="folders")
public class Folder {

    private int id;
    private String title;
    private Set<File> file;
    private Owner owner;

    public Folder() {
    }

    public Folder(Owner owner, String title) {
        this.title = title;
        this.owner = owner;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @OneToMany(mappedBy = "folder", fetch = FetchType.LAZY, orphanRemoval = true)
    public Set<File> getFile() {
        return file;
    }

    public void setFile(Set<File> file) {
        this.file = file;
    }

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
