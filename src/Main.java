import java.util.*;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Set<City> citySet = new TreeSet<City>();
        HashMap<String, City> cityHashMap = new HashMap<>();
        cityHashMap.put("a", new City(312, "Bishkek"));
        cityHashMap.put("b", new City(3222, "Osh"));
        cityHashMap.put("c", new City(499, "Moscow"));
        cityHashMap.put("d", new City(33, "Paris"));
        cityHashMap.put("e", new City(971, "Dubai"));
        for (Map.Entry iterator : cityHashMap.entrySet()) {
            System.out.println(iterator.getKey() + "" + iterator.getValue());
        }
        System.out.println("================================================== ");
        for (Map.Entry<String, City> entry : cityHashMap.entrySet()) {
            City city = entry.getValue();
            if (city.getCode() % 2 != 0) {
                citySet.add(city);
            }
        }
        for (City city1 : citySet) {
            System.out.println(city1);
        }
    }
}