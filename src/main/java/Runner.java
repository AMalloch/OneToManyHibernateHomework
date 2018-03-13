import db.DBHelper;
import models.File;
import models.Folder;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Folder folder1 = new Folder("Thee Folder");
        File file1 = new File("secret", "jpeg", 20, folder1);
        DBHelper.save(file1);

        File file2 = new File("happy", "png", 30, folder1);
        DBHelper.save(file2);

        List<File> fileList = DBHelper.getAll(File.class);

        file1.setName("mega");
        DBHelper.update(file1);

    }
}
