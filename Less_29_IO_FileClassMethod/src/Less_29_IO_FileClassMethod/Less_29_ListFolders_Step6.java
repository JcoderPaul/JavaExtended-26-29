package Less_29_IO_FileClassMethod;

import java.io.File;

public class Less_29_ListFolders_Step6 {
    public static void main(String[] args) {
        String catalogName = "src\\Less_29_IO_FileClassMethod";
        File catalog = new File(catalogName);

        if (catalog.isDirectory()) {
            System.out.println("Папка: " + catalogName);
            String[] list = catalog.list();
            if (list != null) {
                for (String fileName : list) {
                    File file = new File(catalogName + "\\" + fileName);
                    if (file.isDirectory()) {
                        System.out.printf("\t%s - каталог%n", fileName);
                    } else {
                        System.out.printf("\t%s - файл%n", fileName);
                    }
                }
            }
        } else {
            System.out.println(catalogName + " не является каталогом");
        }
    }
}
