package IO;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;

public class ImageReadImageWrite {
    public static void main(String[] args) throws IOException {

        File srcImage = new File("Image.png");
        File trgtImage = new File("newImage.png");

        FileInputStream fis = new FileInputStream(srcImage);
        FileOutputStream fos = new FileOutputStream(trgtImage);

        byte[] buffer = new byte[2048];
        int len;

        while((len = fis.read(buffer)) > 0) {

            fos.write(buffer, 0, len);

        }

        fis.close();
        fos.close();

    }
}
