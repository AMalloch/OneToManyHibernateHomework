import db.DBHelper;
import models.File;
import models.Folder;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Folder folder1 = new Folder("Thee Folder");
        DBHelper.save(folder1);
        File file1 = new File("secret", "jpeg", 20, folder1);
        DBHelper.save(file1);

        File file2 = new File("happy", "png", 30, folder1);
        DBHelper.save(file2);

        File file3 = new File("sad", "png", 15, folder1);
        DBHelper.save(file3);

        DBHelper.delete(file3);

        List<File> fileList = DBHelper.getAll(File.class);

        file1.setName("mega");
        DBHelper.update(file1);

    }
}
