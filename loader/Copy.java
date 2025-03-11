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


        try {
            Configurator.getDir();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Path destDir = Paths.get(Configurator.out);


                try {
                    Files.copy(file.toPath(), destDir.resolve(file.getName()), StandardCopyOption.REPLACE_EXISTING);


                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                System.out.printf("Обработан запроc копирования #%s в потоке %s\n",file,Thread.currentThread().getName());


            }
 }






