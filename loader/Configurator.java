package loader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Configurator {
    static String in,out;
    static void getDir() throws IOException {

        File file = new File("./test.properties");


        Properties properties = new Properties();
        properties.load(new FileReader(file));


        String input = properties.getProperty("Input");
        String output = properties.getProperty("Output");
        in = input;
        out = output;

    }


}

