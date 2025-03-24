import java.io.*;

public class CopierImage {

    public static void copierBin(File source, File dest) {
        try {
            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(dest);

            while (fis.available() > 0) {
                int o = fis.read();
                fos.write(o);
            }
            fos.close();
            fis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
