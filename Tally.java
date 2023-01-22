import java.util.ArrayList;
import java.util.HashMap;

public class Tally {

    private final HashMap<String, Integer> tally;

    public Tally() {
        tally = new HashMap<>();
        makeTally();
    }

    private void makeTally() {
        tally.put("0", 0);
        tally.put("1", 0);
        tally.put("2", 0);
        tally.put("3", 0);
        tally.put("4", 0);
        tally.put("5", 0);
        tally.put("6", 0);
        tally.put("7", 0);
        tally.put("8", 0);
        tally.put("9", 0);
    }

    public void incrementTally(String number) {
        tally.merge(number, 1, Integer::sum);
    }

    public String getMostCommon() {
        String mostCommon = "";
        int mostOften = 0;

        for (String key : tally.keySet()) {
            if(tally.get(key) > mostOften) {
                mostCommon = key;
                mostOften = tally.get(key);
            }
        }

        return mostCommon;
    }

    public HashMap<Integer, ArrayList<String>> getTopThree() {
        HashMap<Integer, ArrayList<String>> topThree = new HashMap<>();

        //TODO: Get the top 3 most selected numbers for each index

        return topThree;
    }
}