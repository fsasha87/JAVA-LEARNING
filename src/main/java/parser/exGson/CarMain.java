package parser.exGson;
//<!-- https://mvnrepository.com/artifact/com.google.code.gson/gson -->
//<dependency>
//<groupId>com.google.code.gson</groupId>
//<artifactId>gson</artifactId>
//<version>2.8.9</version>
//</dependency>


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CarMain {
    public static void main(String[] args) {
        //JSON Into Java Objects
        String json = "{\"brand\":\"Jeep\", \"doors\": 3}";


        Gson gson = new Gson();
//        Gson gson = new GsonBuilder().setPrettyPrinting().create();//2сп

        Car car = gson.fromJson(json, Car.class);
        System.out.println(car);//Car{brand='Jeep', doors=3, kuzov='null'}

        //JSON From Java Objects
//        Car car2 = new Car();
//        car2.brand = "Rover";
//        car2.doors = 5;
        Car car2 = new Car("BMW", 4, "Sedan");

        Gson gson2 = new Gson();
//        Gson gson2 = new GsonBuilder().setPrettyPrinting().create();//2сп

        String json2 = gson2.toJson(car2);
        System.out.println(json2);//{"brand":"BMW","doors":4}
    }
}
