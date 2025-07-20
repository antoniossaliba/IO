package IO;

import java.io.*;
import java.util.Scanner;

public class FileReadFileWrite {
    public static void main(String[] args) throws IOException {

        File file = new File("file.txt");

        FileWriter fw = new FileWriter("newFile.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        Scanner scanner = new Scanner(file);

        while(scanner.hasNext()) {

            fw.write(scanner.next() + "\n");

        }

        fw.close();
        bw.close();
        pw.close();
        scanner.close();

    }
}
