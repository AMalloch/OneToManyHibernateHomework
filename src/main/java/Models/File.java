package Models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "files")
public class File {

    private String name;
    private String extension;
    private int size;
    private Folder folder;

    public File() {
    }
}

//name, extension (e.g. txt, rb, java, ppt), size and folder.
