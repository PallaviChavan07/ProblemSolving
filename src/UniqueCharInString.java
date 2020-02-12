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
    public static void main(String[] args){
        UniqueCharInString obj = new UniqueCharInString();
        String stringWithUniqueChars = obj.getUniqueCharactersInString("Hello there.. preparing for an interview..");
        System.out.println(stringWithUniqueChars);
    }
}
