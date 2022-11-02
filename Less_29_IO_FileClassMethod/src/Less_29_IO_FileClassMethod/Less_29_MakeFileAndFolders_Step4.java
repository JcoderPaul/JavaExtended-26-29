package Less_29_IO_FileClassMethod;
/*
Простая проверка методов:
- *.createNewFile()
- *.mkdir()
- *.mkdirs()
*/
import java.io.File;
import java.io.IOException;

public class Less_29_MakeFileAndFolders_Step4 {
    public static void main(String[] args) {

        String make_file = "src\\Less_29_IO_FileClassMethod\\MyFolder\\MySecondFile.txt";
        File file = new File(make_file);

        String make_folder = "src\\Less_29_IO_FileClassMethod\\MyFolderThree";
        File folder = new File(make_folder);

        String make_folders = "src\\Less_29_IO_FileClassMethod\\MyFolderFour\\MyFolderFive";
        File folders = new File(make_folders);

        try {
            System.out.println(file.createNewFile() ? "Файл/каталог создан." : "Файл/каталог не создан.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(folder.mkdir() ? "Файл/каталог создан." : "Файл/каталог не создан.");
        System.out.println(folders.mkdirs() ? "Файл/каталог создан." : "Файл/каталог не создан.");
        System.out.println("------------------------------------------------------------------------");


    }
}
