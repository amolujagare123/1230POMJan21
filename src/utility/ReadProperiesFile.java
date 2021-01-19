package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperiesFile {

    public static void main(String[] args) throws IOException {
        // print the values of the keys , url , user, pass

        //1.Read the file
        FileInputStream fp = new FileInputStream("config\\config.properties");

        //2. Create the object of properties class
        Properties prop = new Properties();

        //3. Load the file with properties object
        prop.load(fp);

        //4. Get the property/key value
        System.out.println(prop.getProperty("url"));
        System.out.println(prop.getProperty("username"));
        System.out.println(prop.getProperty("password"));


    }




}
