import Models.File;
import Models.Folder;
import db.DBHelper;

public class Runner {

    public static void main(String[] args) {

        File file1 = new File();
        Folder folder1 = new Folder("Thee Folder");
        DBHelper.save(file1);

    }
}
