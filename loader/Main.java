package loader;

import java.io.File;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        File dir = new File("C:\\Test\\input\\");
        Loader t  = new Loader(dir);
        Loader.start();
    }
}
