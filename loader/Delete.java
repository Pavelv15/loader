package loader;

import java.io.File;

public class Delete implements Runnable  {
    private final File dir;

    public Delete( File dir) {
        this.dir = dir;

    }

    public void run() {

            dir.delete();


    }



}
