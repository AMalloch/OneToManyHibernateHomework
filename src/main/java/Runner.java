import models.File;
import models.Folder;
import db.DBHelper;

public class Runner {

    public static void main(String[] args) {

        Folder folder1 = new Folder("Thee Folder");
        File file1 = new File("secret", "jpeg", 20, folder1);
        DBHelper.save(file1);

//        String name, String extension, int size, Folder folder

    }
}
