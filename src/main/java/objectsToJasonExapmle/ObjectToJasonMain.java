package objectsToJasonExapmle;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class ObjectToJasonMain {

    public static void main(String[] args) throws IOException {

        FileWriter file = null;

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", "1");
        jsonObject.put("firstName", "Dainius");
        jsonObject.put("lastName", "Pilypas");

        System.out.println(jsonObject.toJSONString());

        Dog dog = new Dog("Rexas", "Vokieciu aviganis");
        file = new FileWriter("src/main/resources/dog.json");

        JSONObject dogJson = new JSONObject();
        //Json objektas yra kaip mapas, i ji dedam RAKTA ir REIKSME
        dogJson.put("sunsVardas", dog.getName());
        dogJson.put("sunsVeisle", dog.getBreed());
        file.write(dogJson.toString());
        file.close();
    }
}
