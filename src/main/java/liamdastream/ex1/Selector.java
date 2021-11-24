package liamdastream.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Selector {
    private static List<Owner> owners = new ArrayList<>();

    private static void initData() {
        final Owner owner1 = new Owner("Олег Малашков");
        Collections.addAll(owner1.getPets(),
                new Cat("Белыш", Color.WHITE, 3),
                new Cat("Султан", Color.GREY, 4),
                new Dog("Эльза", Color.WHITE, 0));


        final Owner owner2 = new Owner("Дмитрий Васильков");
        Collections.addAll(owner2.getPets(),
                new Cat("Барсик", Color.WHITE, 7),
                new Cat("Черныш", Color.BLACK, 5),
                new Dog("Адмирал", Color.BLACK, 3));
        Collections.addAll(owners, owner1, owner2);
    }

    public static void main(String[] args) {
        initData();

        final List<String> findNames = owners.stream()
                .flatMap(owner -> owner.getPets().stream())
                .filter(pet -> Cat.class.equals(pet.getClass())).filter(cat -> Color.WHITE == cat.getColor())
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())
                .map(Animal::getName)
                .collect(Collectors.toList());

        findNames.forEach(System.out::println);

    }
}