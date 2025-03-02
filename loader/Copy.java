package loader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Copy implements Runnable {
    private  final File file;
    private final Object lock = new Object();

    public Copy(File file) {
        this.file = file;
    }


    @Override
    public void run() {


        Path destDir = Paths.get("C:\\Test\\output");


                try {
                    Files.copy(file.toPath(), destDir.resolve(file.getName()), StandardCopyOption.REPLACE_EXISTING);


                } catch (IOException e) {
                    throw new RuntimeException(e);
                }


            }
 }






