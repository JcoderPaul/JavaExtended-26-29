package Less_26_ch_7_DataInputOutputStream;

import java.io.*;

public class Less_26_DataInputOutputStream_Step1 {
    public static void main(String[] args) throws FileNotFoundException {
        String my_file_path = "src\\Less_26_ch_7_DataInputOutputStream\\FileDir\\read_write.bin";

        try (DataOutputStream dos_write = new DataOutputStream(new FileOutputStream(my_file_path));
             DataInputStream dis_read = new DataInputStream(new FileInputStream(my_file_path))){

            // Записали данные в файл в разных форматах
            dos_write.writeBoolean(true);
            dos_write.writeByte(5);
            dos_write.writeShort(120);
            dos_write.writeInt(567);
            dos_write.writeLong(1_000_000_000L);
            dos_write.writeFloat(3.14F);
            dos_write.writeDouble(32.5445);
            /*
            Считали данные из файла в том порядке в котором записали и
            используя соответствующий формату данных метод *.read....
            и вывели на экран.
            */
            System.out.println(dis_read.readBoolean());
            System.out.println(dis_read.readByte());
            System.out.println(dis_read.readShort());
            System.out.println(dis_read.readInt());
            System.out.println(dis_read.readLong());
            System.out.println(dis_read.readFloat());
            System.out.println(dis_read.readDouble());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
