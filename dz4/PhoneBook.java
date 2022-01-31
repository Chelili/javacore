import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
   private HashMap<String, ArrayList<String>> TelephoneDirectory;

    public PhoneBook() {
        TelephoneDirectory = new HashMap<>();
    }

    public void add(String surname, String telephone) {
        if (TelephoneDirectory.get(surname) == null) {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(telephone);
            TelephoneDirectory.put(surname, arrayList);
        } else {
            TelephoneDirectory.get(surname).add(telephone);
        }
    }

    public ArrayList<String> get(String surname) {
        return TelephoneDirectory.get(surname);
    }
}

