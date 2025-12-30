import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextFormater {

    public String hideCPF(String t) {
        String t1 = t.trim().substring(0, 3);
        String t2 = t.trim().substring(9);
        return t1 + ".***.***-" + t2;
    }

    public void createFile(String filename, String content) {
        try {
            File f = new File(filename);
            FileWriter fw = new FileWriter(f, true);

            System.out.println("Tamanho do Arquivo: " + f.length());

            if (!f.exists()) {
                f.createNewFile();
            }

            if (f.length() > 0) {
                fw.write("\r\n");
            }
                
            fw.write(content);
            fw.close();
            System.out.println("O resultado foi salvo no arquivo " + filename);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
