package Less_26_HW_Examples;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

import static java.nio.file.StandardOpenOption.*;

/*
Задан файл с JAVA-кодом. Прочитать текст программы из файла и
записать в другой файл в обратном порядку символы каждой строки.
*/
public class Less_26_HW_Examples_5 {
    public static void main(String[] args) {
        Path pathToReadFile = Path
                .of("src","Less_26_HW_Examples", "FileForRead", "PublicToPrivate.java");
        Path pathToWriteFile = Path
                .of("src","Less_26_HW_Examples", "FileForWrite", "ReversStringFileResult.txt");
        try {
            // Создаем директорию перед тем, как закинуть туда файл, проверяем на ее наличие
            if(!Files.exists(pathToWriteFile.getParent())){
                Files.createDirectory(pathToWriteFile.getParent());
            }
        } catch (IOException ex_1) {
            ex_1.printStackTrace();
        }
        try(Stream<String> fileLines = Files.lines(pathToReadFile);
            BufferedWriter bufferedWriter = Files.newBufferedWriter(pathToWriteFile, CREATE)){
            fileLines
                    .map(str -> new StringBuilder(str))
                    .map(stringBuilder -> stringBuilder.reverse())
                    .forEach(line -> {
                        try {
                            bufferedWriter.write(line.toString());
                            bufferedWriter.write("\n");
                        } catch (IOException ex_2) {
                            ex_2.printStackTrace();
                        }
                    });
        } catch (IOException ex_3){
            ex_3.printStackTrace();
        }
    }
}