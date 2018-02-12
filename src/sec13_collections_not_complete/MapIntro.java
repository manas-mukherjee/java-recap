package sec13_collections_not_complete;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {
    public static void main(String[] args) {
        Map<String, String>  langs = new HashMap<>();
        langs.put("java", "classic oop lang");
        langs.put("java", "this is vast");
        langs.put("node", "javascript based lang");
        langs.put("pythond", "great scripting lang");

        System.out.println(langs);
    }
}
