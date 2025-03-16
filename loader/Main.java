package loader;

import java.io.File;
import java.io.IOException;
import java.lang.module.Configuration;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        Loader loader = new Loader();

        loader.start();


    }
}
