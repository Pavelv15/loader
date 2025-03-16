package loader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Configurator {
    static String in,out;
    static void getDir() throws IOException {
        /* В application.properties задаётся пути ввод и вывода
        * Пример 
        * Input=C:\\Test\\input\\    - Переменная, где указывается путь входной папки
        * Output=C:\\Test\\output\\   - Переменная, где указывается путь выводной папки
        */
        File file = new File("./application.properties"); 


        Properties properties = new Properties();
        properties.load(new FileReader(file));


        String input = properties.getProperty("Input");
        String output = properties.getProperty("Output");
        in = input;
        out = output;

    }


}

