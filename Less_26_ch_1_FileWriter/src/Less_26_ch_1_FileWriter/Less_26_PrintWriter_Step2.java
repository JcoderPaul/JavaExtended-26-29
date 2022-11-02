package Less_26_ch_1_FileWriter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Less_26_PrintWriter_Step2 {
    public static void main(String[] args) {

        String path_for_file = "src\\Less_26_ch_1_FileWriter\\FilesForWrite\\file_to_print_write_2.txt";

            try {
                List<String> list_for_write = new ArrayList<>();
                for(int i = 0; i < 1100; i++){
                    list_for_write.add(Integer.toString(i));
                }
                Files.write(Paths.get(path_for_file),list_for_write);

            } catch (IOException ex){
                ex.printStackTrace();
            }

    }
}

