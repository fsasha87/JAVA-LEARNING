package parser.exJAXB3;

//import javax.xml.bind.JAXBContext;
//import javax.xml.bind.JAXBException;
//import javax.xml.bind.Unmarshaller;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;
import java.util.List;

public class XMLToObject {
    public static void main(String[] args) throws JAXBException {


        RozetkaFilters rozetkaFilters = null;

            File file = new File("src/main/java/parser/exJAXB3/rozetkaFilters.xml");
            JAXBContext context = JAXBContext.newInstance(RozetkaFilters.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            rozetkaFilters = (RozetkaFilters) unmarshaller.unmarshal(file);
            List<RozetkaFilter> rozetkaFilterList = rozetkaFilters.getRozetkaFilters();
        System.out.println(rozetkaFilterList);



    }
}
