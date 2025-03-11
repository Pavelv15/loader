package loader;

import java.io.File;

public class Delete implements Runnable  {
    private final File dir;

    public Delete( File dir) {
        this.dir = dir;

    }

    public void run() {

            dir.delete();
            System.out.printf("Обработан запроc удаления #%s в потоке %s\n",dir,Thread.currentThread().getName());



    }



}
