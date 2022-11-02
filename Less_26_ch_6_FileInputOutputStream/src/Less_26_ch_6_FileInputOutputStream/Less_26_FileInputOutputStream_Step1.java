package Less_26_ch_6_FileInputOutputStream;

import java.io.*;

public class Less_26_FileInputOutputStream_Step1 {
    public static void main(String[] args) {
        String path = "src\\Less_26_ch_6_FileInputOutputStream\\WorkingFile\\read_write.txt";

        try {
            char[] symbols = {'a', 'b', 'c'};
            OutputStream output = new FileOutputStream(path);
            for (int i = 0; i < symbols.length; i++) {
                // Запись каждого символа в текстовый файл
                output.write(symbols[i]);
            }
            output.close();

            InputStream input = new FileInputStream(path);
            int size = input.available();

            for (int i = 0; i < size; i++) {
                // Чтение текстового файла посимвольно
                System.out.print((char) input.read() + " ");
            }
            input.close();

        } catch (IOException exception) {
            exception.getMessage();
            exception.printStackTrace();
        }
    }
}
