package reader;


import com.google.gson.Gson;
import data.DataModel;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadDataFromJson {
public DataModel ReadJsonFile() throws FileNotFoundException {
    FileReader fileReader = new FileReader("data/TestData.json");
    DataModel dataModel=new Gson().fromJson(fileReader, DataModel.class);
    return dataModel;
}
}
