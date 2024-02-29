import jdk.jshell.EvalException;

import java.util.HashMap;
import java.util.Map;

public class NumberOfLetters {
    public static void main(String[] args) {


        String str = "collections";
        int a=5;
        int A=5;
        Map<Character,Integer> map = new HashMap<>();
        for(Character character : str.toCharArray()){
            if(!map.containsKey(character)){
                map.put(character,1);
            }
            else {
                map.put(character,map.get(character)+1);
            }
        }

        map.forEach((k,v)-> System.out.println(k+" "+v));
        System.out.println(map);


    }
}
