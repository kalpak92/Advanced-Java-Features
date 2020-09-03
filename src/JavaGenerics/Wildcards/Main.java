package JavaGenerics.Wildcards;
import java.util.List;
import java.util.ArrayList;

/**
 * @author kalpak
 */
public class Main {
    public static void main(String[] args) {

        // List of buildings
        List<Building> buildings = new ArrayList();
        buildings.add(new Building());
        buildings.add(new Building());
        printBuildings(buildings);

        // List of offices
        List<Office> offices = new ArrayList();
        offices.add(new Office());
        offices.add(new Office());
        printBuildings(offices);

        // List of houses
        List<House> houses = new ArrayList();
        houses.add(new House());
        houses.add(new House());
        printBuildings(houses);

        addHouseToList(houses);
        addHouseToList(buildings);

    }

    /**
     * Upper Bounded Wildcards
     * These wildcards can be used when you want to relax the restrictions on a variable.
     * For example, say you want to write a method that works on List < integer >, List < double >, and List < number > ,
     * you can do this  using an upper bounded wildcard.
     *
     * To declare an upper-bounded wildcard, use the wildcard character (‘?’), followed by the extends keyword, followed by its upper bound.
     */
    static void printBuildings(List<? extends Building> buildings) {
        for(int i = 0; i < buildings.size(); i++) {
            System.out.println(buildings.get(i).toString() + " " + (i + 1));
        }
        System.out.println();
    }

    /**
     * Lower Bounded Wildcards
     * It is expressed using the wildcard character (‘?’),
     * followed by the super keyword, followed by its lower bound: <? super A>.
     */
    static void addHouseToList(List<? super House> buildings) {
        buildings.add(new House());
        System.out.println();
    }
}
