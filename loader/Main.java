package loader;

import java.io.File;
import java.io.IOException;
import java.lang.module.Configuration;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        Configurator.getDir();

        System.out.println(Configurator.in);

        File dir = new File(Configurator.in);
        Loader t  = new Loader(dir);
        t.start();
    }
}
