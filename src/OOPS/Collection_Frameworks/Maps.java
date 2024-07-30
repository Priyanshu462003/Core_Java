package OOPS.Collection_Frameworks;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class Maps {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("us", "united states");//key should be diffrent value can be SAME if key same value different then value updated as of last same key
        map.put("in", "india");
        map.put("in", "india2"); //in m idia2 assign kr dega

        map.put("en", "india");
        map.remove("us");
        System.out.println(map.containsKey("un")); //checks key is there or not

        ArrayList<String> keys=new ArrayList<>(map.keySet());
        System.out.println(keys);
        System.out.println(map);

    }
}
