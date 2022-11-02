package Less_29_IO_FileClassMethod;
/*
Простая проверка методов:
- *.getName()
- *.getPath()
- *.getParent()
- *.isFile()
*/
import java.io.File;

public class Less_29_FileClass_Step2 {
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

        System.out.println("Имя файла: " + file.getName());
        System.out.println("Имя файла: " + same_file_with_absolut_path.getName());
        System.out.println("Имя файла: " + no_exist_file.getName());
        System.out.println("Имя файла: " + folder.getName());
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Путь: " + file.getPath());
        System.out.println("Путь: " + same_file_with_absolut_path.getPath());
        System.out.println("Путь: " + no_exist_file.getPath());
        System.out.println("Путь: " + folder.getPath());
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Родительский каталог: " + file.getParent());
        System.out.println("Родительский каталог: " + same_file_with_absolut_path.getParent());
        System.out.println("Родительский каталог: " + no_exist_file.getParent());
        System.out.println("Родительский каталог: " + folder.getParent());
        System.out.println("------------------------------------------------------------------------");
        System.out.println(file.isFile() ? "Файл." : "Не файл.");
        System.out.println(same_file_with_absolut_path.isFile() ? "Файл." : "Не файл.");
        System.out.println(no_exist_file.isFile() ? "Файл." : "Не файл.");
        System.out.println(folder.isFile() ? "Файл." : "Не файл.");
        System.out.println("------------------------------------------------------------------------");
        System.out.println(file.canExecute() ? "Имеем доступ на запуск." : "Нет доступа на запуск.");
        System.out.println(same_file_with_absolut_path.canExecute() ? "Имеем доступ на запуск." :
                                                                      "Нет доступа на запуск.");
        System.out.println(no_exist_file.canExecute() ? "Имеем доступ на запуск." :
                                                        "Нет доступа на запуск.");
        System.out.println(folder.canExecute() ? "Имеем доступ на запуск." : "Нет доступа на запуск.");
        System.out.println("------------------------------------------------------------------------");
    }
}
