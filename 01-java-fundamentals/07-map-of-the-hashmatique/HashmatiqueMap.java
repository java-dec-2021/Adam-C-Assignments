import java.util.HashMap;
import java.util.Set;

public class HashmatiqueMap {
    public static void main(String[] args) {
        // Declaration and instantiation of trackList hashmap
        HashMap<String, String> trackList = new HashMap<String, String>();

        trackList.put("Hashmir", "Oh, let the sun beat down upon my hash..");
        trackList.put("Rock the Hashbah", "Rockin the Hashbah. Rock the Hashbah...");
        trackList.put("Hashes (Three different Ones)", "Big hash, pig hash. Ha ha, charade you are...");
        trackList.put("Break on Through (To the Other Hash)", "You know the day destroys the night. Night divides the hash...");

        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));
            System.out.println("----------------------------------------------------");
        }
    }
}
