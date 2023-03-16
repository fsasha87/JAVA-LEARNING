package parser.exSAX;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.ArrayList;

public class SAXExample {
    private static ArrayList<Employee> employees = new ArrayList<>();//список со всеми сотрудниками

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();//создали фабрику
        SAXParser saxParser = factory.newSAXParser();//создали образец парсера

        XMLHandler handler = new XMLHandler();//создали объкт созданного обработчика
        saxParser.parse("src/main/java/parser/exSAX/xml_file1.xml", handler);//запарсим XML файл

        for (Employee employee : employees)
//        System.out.println(String.format("Имя сотрудника: %s, его должность: %s, его текст: %s", employee.getName(), employee.getJob(), employee.getContent()));
            System.out.println(employee);
    }

    static class XMLHandler extends DefaultHandler {//класс-обработчик событий
        private String lastElementName;//чтобы фиксировать, внутри какого элемента мы находимся
        private String content, name, job;//переменные для хранения данных про сотрудника

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) {//логика реакции на начало элемента
            if (qName.equals("employee")) {
                //cобираем информацию с атрибутов тега employee
                name = attributes.getValue("name");
                job = attributes.getValue("job");
                lastElementName = qName;//фиксируем внутри какого элемента мы находимся
            }
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {//считывает текст внутри элементов
            String information = new String(ch, start, length);
            information = information.trim();//удаляем переносы строки
//фильтруем информацию
            if (!information.isEmpty()) {
                if (lastElementName.equals("employee"))
                    content = information;
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
//            if ( (name != null && !name.isEmpty()) && (job != null && !job.isEmpty()) ) {
//                employees.add(new Employee(name, job, content));
//                name = null;
//                job = null;
//            }
            if (qName.equals("employee"))
                employees.add(new Employee(name, job, content));
        }
    }
}