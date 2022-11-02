package Less_29_IO_FileClassMethod;
/*
Простая проверка методов:
- *.getAbsolutePath()
- *.isAbsolute()
- *.isDirectory()
- *.exists()
- *.isHidden()
*/
import java.io.File;

public class Less_29_FileClass_Step1 {
    public static void main(String[] args) {

        String relative_path_to_file = "src\\Less_29_IO_FileClassMethod\\MyFolder\\MyFile.txt";
        File file = new File(relative_path_to_file);

        String absolut_path_to_file = "E:\\JavaExtended\\Less_29_IO_FileClassMethod" +
                                      "\\src\\Less_29_IO_FileClassMethod\\MyFolder\\MyFile.txt";
        File same_file_with_absolut_path = new File(absolut_path_to_file);

        String path_to_no_exist_file = "E:\\JavaExtended\\Less_29_IO_FileClassMethod" +
                "\\src\\Less_29_IO_FileClassMethod\\MyFolder\\MyNoExistFile.txt";
        File no_exist_file = new File(path_to_no_exist_file);

        String path_to_folder = "src\\Less_29_IO_FileClassMethod\\MyFolderTwo";
        File folder = new File(path_to_folder);

        System.out.println("Абсолютный путь: " + file.getAbsolutePath());
        System.out.println("Абсолютный путь: " + same_file_with_absolut_path.getAbsolutePath());
        System.out.println("Абсолютный путь: " + folder.getAbsolutePath());
        System.out.println("Абсолютный путь: " + no_exist_file.getAbsolutePath());
        System.out.println("------------------------------------------------------------------------");
        System.out.println(file.isAbsolute() ? "Абсолютный путь." : "Не абсолютный путь.");
        System.out.println(same_file_with_absolut_path.isAbsolute() ? "Абсолютный путь." : "Не абсолютный путь.");
        System.out.println(folder.isAbsolute() ? "Абсолютный путь." : "Не абсолютный путь.");
        System.out.println(no_exist_file.isAbsolute() ? "Абсолютный путь." : "Не абсолютный путь.");
        System.out.println("------------------------------------------------------------------------");
        System.out.println((file.isDirectory() ? "Каталог." : "Не каталог."));
        System.out.println((same_file_with_absolut_path.isDirectory() ? "Каталог." : "Не каталог."));
        System.out.println((folder.isDirectory() ? "Каталог." : "Не каталог."));
        System.out.println((no_exist_file.isDirectory() ? "Каталог." : "Не каталог."));
        System.out.println("------------------------------------------------------------------------");
        System.out.println((file.isHidden() ? "Файл/каталог скрыт." : "Файл/каталог не скрыт."));
        System.out.println((same_file_with_absolut_path.isHidden() ? "Файл/каталог скрыт." :
                                                                     "Файл/каталог не скрыт."));
        System.out.println((folder.isHidden() ? "Файл/каталог скрыт." : "Файл/каталог не скрыт."));
        System.out.println((no_exist_file.isHidden() ? "Файл/каталог скрыт." : "Файл/каталог не скрыт."));
        System.out.println("------------------------------------------------------------------------");
        System.out.println(file.exists() ? "Файл/каталог существует." : "Файл/каталог не существует.");
        System.out.println(same_file_with_absolut_path.exists() ?
                                           "Файл/каталог существует." : "Файл/каталог не существует.");
        System.out.println(folder.exists() ? "Файл/каталог существует." : "Файл/каталог не существует.");
        System.out.println(no_exist_file.exists() ? "Файл/каталог существует." : "Файл/каталог не существует.");
        System.out.println("------------------------------------------------------------------------");
    }
}
