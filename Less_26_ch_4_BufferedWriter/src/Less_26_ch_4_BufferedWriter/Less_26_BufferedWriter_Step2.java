package Less_26_ch_4_BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Less_26_BufferedWriter_Step2 {
    public static void main(String[] args) {
        String path_for_write_file = "src\\Less_26_ch_4_BufferedWriter\\FileForWrite\\write_file.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path_for_write_file)))
        {
            String text = "Живи, безумец!.. Трать, пока богат!\n" +
                          "Ведь ты же сам – не драгоценный клад.\n" +
                          "И не мечтай – не сговорятся воры\n" +
                          "Тебя из гроба вытащить назад!";
            bw.write(text);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
