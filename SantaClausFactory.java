package interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SantaClausFactory {
    public static void main(String... args) {

        Creatures giants = new Creatures("Bicycles", 8);
        Creatures fairies = new Creatures("Cars", 7);
        Creatures elves = new Creatures("Dolls", 6);

        Map<String, Integer> countTotalPresents1 = createGiftsForChildren(Arrays.asList(elves, elves, fairies, giants));
        System.out.println("Presents for 8 years old:");
        for (Map.Entry<String, Integer> present : countTotalPresents1.entrySet()) {
            System.out.println(present.getKey() + " : " + present.getValue());
        }
        Map<String, Integer> countTotalPresents2 = createGiftsForChildren(Arrays.asList(elves,elves, fairies,fairies, giants));
        System.out.println("Presents for 10 years old:");
        for (Map.Entry<String, Integer> present : countTotalPresents2.entrySet()) {
            System.out.println(present.getKey() + " : " + present.getValue());
        }
        Map<String, Integer> countTotalPresents3 = createGiftsForChildren(Arrays.asList(elves, fairies, giants, giants));

        System.out.println("Presents for 12 years old:");
        for (Map.Entry<String, Integer> present : countTotalPresents3.entrySet()) {
            System.out.println(present.getKey() + " : " + present.getValue());
        }
    }

    public static Map<String, Integer> createGiftsForChildren(List<Creatures> creatures) {
        Map<String, Integer> listOfPresents = new HashMap<>();
        for (Creatures creature : creatures) {
            if (listOfPresents.containsKey(creature.getCreatures())) {
                Integer updatedAmount = (listOfPresents.get(creature.getCreatures()) + creature.getAmount());
                listOfPresents.put(creature.getCreatures(), updatedAmount);
            } else {
                listOfPresents.put(creature.getCreatures(), creature.getAmount());
            }
        }
        return listOfPresents;
    }

}