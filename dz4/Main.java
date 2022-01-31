import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String[] words = {"java", "home", "work", "home", "work", "java", "work", "phonebook", "book", "phone", "book", "phonebook",};

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String word : words) {
            if (hashMap.get(word) == null) {
                hashMap.put(word, 1);
            } else {
                hashMap.put(word, hashMap.get(word) + 1);
            }
        }

        System.out.println(hashMap);

        PhoneBook phoneBook = new PhoneBook ();
        phoneBook.add("Дмитрий","123123");
        phoneBook.add("Дмитрий","4551455544");
        phoneBook.add("Владимир","45245547");
        phoneBook.add("Владимир","45245547");
        phoneBook.add("Владимир","45245547");

        System.out.println(phoneBook.get("Дмитрий"));
        System.out.println(phoneBook.get("Владимир"));



    }
}

