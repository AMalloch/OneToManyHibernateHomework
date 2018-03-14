import db.DBHelper;
import models.File;
import models.Folder;
import models.Owner;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Owner owner1 = new Owner("Jim", "Turboman");
        DBHelper.save(owner1);

        Folder folder1 = new Folder(owner1, "Thee Folder");
        DBHelper.save(folder1);

        Folder folder2 = new Folder(owner1, "Another Folder");
        DBHelper.save(folder2);

        File file1 = new File("secret", "jpeg", 20, folder1);
        DBHelper.save(file1);

        File file2 = new File("happy", "png", 30, folder1);
        DBHelper.save(file2);

        File file3 = new File("sad", "png", 15, folder1);
        DBHelper.save(file3);

        DBHelper.delete(file3);

        file1.setName("mega");
        DBHelper.update(file1);

        List<File> fileList = DBHelper.getAll(File.class);

        List<File> filesByFolder = DBHelper.getFilesByFolder(folder1);

        List<Folder> folderByOwner = DBHelper.getFolderByOwner(owner1);

    }
}
