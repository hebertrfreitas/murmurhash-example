package murmurhash.example;

import java.io.*;
import java.util.List;

public class FileUtils
{
    public InputStream readFileAsInputStream(String fileName){


        InputStream ioStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream(fileName);

        if (ioStream == null) {
            throw new IllegalArgumentException(fileName + " is not found");
        }
        return ioStream;
    }

    public List<String> readLinesFromFile(String filename){
        try (InputStreamReader isr = new InputStreamReader(this.readFileAsInputStream(filename));
             BufferedReader br = new BufferedReader(isr))
        {
            return br.lines().toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
