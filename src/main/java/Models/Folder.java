package Models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="folders")
public class Folder {

    private int id;
    private String title;
    private Set<File> file;

    public Folder(){
    }

    public Folder(String title, Set<File> file) {
        this.title = title;
        this.file = file;
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
}
