package old;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Q1396_DesignUndergroundSystem {

    Map<Integer, Map.Entry<String, Integer>> progressMap;
    Map<Map.Entry<String, String>, Map.Entry<Integer, Integer>> totalCount;

    public Q1396_DesignUndergroundSystem() {
        progressMap = new HashMap<>();
        totalCount = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        progressMap.put(id, new AbstractMap.SimpleEntry<>(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        Map.Entry<String, Integer> cameFrom = progressMap.get(id);
        AbstractMap.SimpleEntry<String, String> stations = new AbstractMap.SimpleEntry<>(cameFrom.getKey(), stationName);
        Map.Entry<Integer, Integer> currentTotal = totalCount.getOrDefault(stations, new AbstractMap.SimpleEntry<>(0, 0));
        totalCount.put(stations, new AbstractMap.SimpleEntry<>(currentTotal.getKey() + 1, currentTotal.getValue() + (t - cameFrom.getValue())));
    }

    public double getAverageTime(String startStation, String endStation) {
        Map.Entry<Integer, Integer> currentTotal = totalCount.getOrDefault(new AbstractMap.SimpleEntry<>(startStation, endStation), new AbstractMap.SimpleEntry<>(0, 0));
        return currentTotal.getValue() * 1.0 / currentTotal.getKey();
    }

}
