package alertservice;
import java.util.*;

public class Hobbies {

    private final HashMap<String, String[]> hobbies = new HashMap<String, String[]>();

    public void add(String hobbyist, String... hobbies) {
        this.hobbies.put(hobbyist, hobbies);
    }

    public List<String> findAllHobbyists(String hobby) {
        ArrayList<String> hobbyistsFoundList = new ArrayList<>();
        for (Map.Entry<String, String[]> stringEntry : hobbies.entrySet()) {
            String[] s = (stringEntry.getValue());
            for (int i = 0; i < s.length; i++) {
                if (s[i].equals(hobby)){
                    hobbyistsFoundList.add(stringEntry.getKey());
                }
            }
        }

        return hobbyistsFoundList;
    }

    public static void main(String[] args) {
        Hobbies hobbies = new Hobbies();
        hobbies.add("Steve", "Fashion", "Piano", "Reading");
        hobbies.add("Patty", "Drama", "Magic", "Pets");
        hobbies.add("Chad", "Puzzles", "Pets", "Yoga");

        System.out.println(Arrays.toString(hobbies.findAllHobbyists("Yoga").toArray()));
    }
}