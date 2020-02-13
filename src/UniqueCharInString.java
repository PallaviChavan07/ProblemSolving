import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class UniqueCharInString {
    public String getUniqueCharactersInString(String str){
        char[] characterArray = str.toCharArray();
        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();
        for(char ch:characterArray){
            uniqueChars.add(ch);
        }
        StringBuffer buffer = new StringBuffer();
        Iterator itr = uniqueChars.iterator();
        while(itr.hasNext()){
            buffer.append(itr.next());
        }
        return buffer.toString();
    }

    public String getUniqueCharactersInString1(String str){
        ArrayList<Character> characterArrayList = new ArrayList<>();
        for(int i =0; i< str.length(); i++){
            if(!characterArrayList.contains(str.charAt(i))){
                characterArrayList.add(str.charAt(i));
            }
        }
        StringBuffer uniqueCharBuffer = new StringBuffer();
        for(Character character : characterArrayList){
            uniqueCharBuffer.append(character);
        }

        return uniqueCharBuffer.toString();
    }
    public static void main(String[] args){
        UniqueCharInString obj = new UniqueCharInString();
        String stringWithUniqueChars = obj.getUniqueCharactersInString("Hello there.. preparing for an interview..");
        System.out.println(stringWithUniqueChars);
    }
}
