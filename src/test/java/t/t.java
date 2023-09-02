package t;

import org.testng.annotations.Test;
import reader.ReadDataFromJson;

import java.io.FileNotFoundException;

public class t {
    ReadDataFromJson readDataFromJson;
    @Test
    public void t1() throws FileNotFoundException {
        readDataFromJson=new ReadDataFromJson();
        System.out.println(readDataFromJson.ReadJsonFile().Login.Validcredentials.user);
        System.out.println(readDataFromJson.ReadJsonFile().Login.Validcredentials.pass);
    }
}
