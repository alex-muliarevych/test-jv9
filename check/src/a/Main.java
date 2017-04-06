package a;

import com.ref.test.ImportedObject;

import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Logger LOGGER = Logger.getLogger("a.Main");
        ImportedObject object = new ImportedObject("value");
        System.out.println(object.toString());
    }
}
