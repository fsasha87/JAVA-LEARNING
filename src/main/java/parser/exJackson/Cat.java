package parser.exJackson;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.ArrayList;
import java.util.List;

@JsonAutoDetect
class Cat {

    public String name;

    public int age;

    @JsonIgnore
    public int weight;

//    @JsonDeserialize(as= ArrayList.class)
//    public List<Cat> cats = new ArrayList<Cat>();


    Cat()
    {
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}