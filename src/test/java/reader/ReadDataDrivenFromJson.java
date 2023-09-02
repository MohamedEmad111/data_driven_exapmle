package reader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.io.FileReader;
import java.io.IOException;

public class ReadDataDrivenFromJson {
    String SuccessfulLogin = "SuccessfulLogin";


    private String[] readJson(String testStatus) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        FileReader fileReader = new FileReader("data/dataDriven.json");
        Object object = jsonParser.parse(fileReader);
        JSONObject jsonObject = (JSONObject) object;
        JSONArray jsonArray = (JSONArray) jsonObject.get(testStatus);
        String arr[] = new String[jsonArray.size()];
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject users = (JSONObject) jsonArray.get(i);
            String email = (String) users.get("email");
            String pass = (String) users.get("pass");
            arr[i] = email + "," + pass;
        }
        return arr;
    }


    public String[] testDataForSucessfulLogin() throws IOException, ParseException {
        return readJson(SuccessfulLogin);
    }
}
