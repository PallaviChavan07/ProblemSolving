import java.util.ArrayList;
import java.util.List;

public class StringUniqueWords {

    public int getUniqueWords(String str){
        int wordsCount = 0;

        String[] strArra = str.split(" ");
        List<String> wordsList =  new ArrayList<String>();
      for(int i = 0; i<strArra.length; i++){

            if(!wordsList.contains(strArra[i])){
                wordsList.add(strArra[i]);
            }else{
                if(wordsList.size() -1 == wordsList.lastIndexOf(strArra[i])){
                    wordsList.remove(strArra[i]);
                }else{
                    wordsList.add(strArra[i]);
                }
            }
        }
        wordsCount = wordsList.size();
        return  wordsCount;
    }
    public static void main(String[] args){
        StringUniqueWords obj = new StringUniqueWords();
        int uniqueWordsLen = obj.getUniqueWords("ab aa aa bcd ab");
        System.out.println(uniqueWordsLen);
    }
}
