package main.java.com.stackroute.pe5;
import java.util.Iterator;
import java.util.Map;
/* a method that accepts a Map object having two key-value pairs with the keys val1 and val2.
     Modifies and return the given map */
public class ModifyKeyValues {
    public Map<String, String> modifyKeyValuesOfMap(Map<String, String> mapList) {
        Iterator iterator = mapList.entrySet().iterator();
        if (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            String word = " ";

            if (!mapList.get("val1").equals(" ")) {
                word = (String) entry.getValue();
                mapList.put("val1", " ");
            }
            Map.Entry presentEntry = (Map.Entry) iterator.next();
            if (word != null)
                presentEntry.setValue(word);

        }
        return mapList;
    }
}