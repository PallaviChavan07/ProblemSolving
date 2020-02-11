import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class maxOccureCharacter {
    public Character maxOccurredChar(String str){
        char character = '\0';
        if(str != null && !str.isEmpty()){
            HashMap<Character, Integer> charValue = new HashMap<>();
            char[] charArray = str.toCharArray();
            for(int i =0; i< charArray.length; i++){
                if(!charValue.containsKey(charArray[i])){
                    charValue.put(charArray[i], 1);
                }else{
                    charValue.put(charArray[i], charValue.get(charArray[i])+1);
                }
            }
            int maxCount = 0;
            Set <Map.Entry<Character, Integer>> entrySet = charValue.entrySet();
            for (Map.Entry<Character, Integer> entry:entrySet ) {
                if(entry.getValue()> maxCount){
                    maxCount = entry.getValue();
                    character = entry.getKey();
                }

            }
            return character;
        }

        return character;
    }
    public static void main(String[] args){
        maxOccureCharacter obj = new maxOccureCharacter();
        System.out.println(obj.maxOccurredChar("California"));;

    }
}
