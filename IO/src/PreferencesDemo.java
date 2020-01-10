import java.util.prefs.Preferences;

/**
 * @Author: YanL
 * @Time: 21:33 2019/12/3
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class PreferencesDemo {
    public static void main(String[] args) throws Exception {
        Preferences preferences = Preferences.userNodeForPackage(Preferences.class);
        preferences.put("Location", "Oz");
        preferences.put("Footwear", "Ruby Slippers");
        preferences.putInt("Companinons" ,4);
        preferences.putBoolean("Are there witches", true);
        int usageCount = preferences.getInt("UsageCount", 0);
        usageCount++;
        preferences.putInt("UsageCount", usageCount);
        for(String key : preferences.keys()){
            System.out.println(key + ": " + preferences.get(key, null));
        }
        System.out.println("How many companinos does Dorothy have? " + preferences.getInt("Companinons", 0));
    }
}
