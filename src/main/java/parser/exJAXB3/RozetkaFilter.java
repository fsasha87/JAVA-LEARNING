package parser.exJAXB3;

//import javax.xml.bind.annotation.XmlAccessType;
//import javax.xml.bind.annotation.XmlAccessorType;
//import javax.xml.bind.annotation.XmlRootElement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "rozetkaFilter")
@XmlAccessorType(XmlAccessType.FIELD)
public class RozetkaFilter {
    String thing;
    String brand;
    int amount;

    public String getThing() {
        return thing;
    }

    public void setThing(String thing) {
        this.thing = thing;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "RozetkaFilter{" +
                "thing='" + thing + '\'' +
                ", brand='" + brand + '\'' +
                ", amount=" + amount +
                '}';
    }
}
