package loader;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Loader {
    private static File dir = null;

    public Loader() throws IOException {
        Configurator.getDir();
        this.dir = new File(Configurator.in);;

    }

    public  void start() throws InterruptedException {
        int i = 1;
        while (i == 1) {
            File[] arrFiles = dir.listFiles();


            if (arrFiles.length != 0) {
                ExecutorService executorService = Executors.newCachedThreadPool();
                ExecutorService executorDeleteService = Executors.newCachedThreadPool();
                for (int j = 0; j < arrFiles.length; j++) {


                    executorService.execute(new Copy(arrFiles[j]));
                    
                    Thread.sleep(500);

                    executorDeleteService.execute(new Delete(arrFiles[j]));

                }
                executorService.shutdown();
                executorDeleteService.shutdown();
            }
//            else {
//                System.out.println("пусто");
//            }

        }
    }
}
