package parser.exJackson3;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class JsonNodeMain {
    public static void main(String[] args) throws IOException {
        String json = "{\"brand\":\"Jeep\", \"doors\": 3}";
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(json);
        System.out.println(jsonNode.get("brand").asText());//Jeep преобразовывать значение поля в другой тип данных

       //считать все поля-значения
        Iterator<Map.Entry<String, JsonNode>> fields = jsonNode.fields();
        while(fields.hasNext()) {
            Map.Entry<String, JsonNode> field = fields.next();
            String   fieldName  = field.getKey();
            JsonNode fieldValue = field.getValue();
            System.out.println(fieldName + " = " + fieldValue.asText());//brand = Jeep  doors = 3
        }

        //считать только значения полей
        Iterator<String> fieldNames = jsonNode.fieldNames();
        while(fieldNames.hasNext()) {
            String fieldName = fieldNames.next();
            JsonNode field = jsonNode.get(fieldName);
            System.out.println(field.asText());//Jeep 3
        }




    }
}
