package Less_29_IO_FileClassMethod;
/*
Простая проверка методов:
- *.canWrite()
- *.canRead()
- *.lastModified()
- *.length()
*/
import java.io.File;

public class Less_29_FileClass_Step3 {
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

        System.out.println(file.canWrite() ? "Файл/каталог доступен для редактирования."
                : "Файл/каталог не доступен для редактирования.");
        System.out.println(same_file_with_absolut_path.canWrite() ? "Файл/каталог доступен для редактирования."
                : "Файл/каталог не доступен для редактирования.");
        System.out.println(no_exist_file.canWrite() ? "Файл/каталог доступен для редактирования."
                : "Файл/каталог не доступен для редактирования.");
        System.out.println(folder.canWrite() ? "Файл/каталог доступен для редактирования."
                : "Файл/каталог не доступен для редактирования.");
        System.out.println("------------------------------------------------------------------------");
        System.out.println(file.canRead() ? "Файл/каталог доступен для чтения."
                : "Файл/каталог не доступен для чтения.");
        System.out.println(same_file_with_absolut_path.canRead() ? "Файл/каталог доступен для чтения."
                : "Файл/каталог не доступен для чтения.");
        System.out.println(no_exist_file.canRead() ? "Файл/каталог доступен для чтения."
                : "Файл/каталог не доступен для чтения.");
        System.out.println(folder.canRead() ? "Файл/каталог доступен для чтения."
                : "Файл/каталог не доступен для чтения.");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Дата последнего редактирования: " + file.lastModified());
        System.out.println("Дата последнего редактирования: " + same_file_with_absolut_path.lastModified());
        System.out.println("Дата последнего редактирования: " + no_exist_file.lastModified());
        System.out.println("Дата последнего редактирования: " + folder.lastModified());
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Размер: " + file.length() + " байт.");
        System.out.println("Размер: " + same_file_with_absolut_path.length() + " байт.");
        System.out.println("Размер: " + no_exist_file.length() + " байт.");
        System.out.println("Размер: " + folder.length() + " байт.");
        System.out.println("------------------------------------------------------------------------");

    }
}
