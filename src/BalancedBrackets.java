public class BalancedBrackets {

    public static final char openingSimpleBracket = '(';
    public static final char openingSquareBracket = '[';
    public static final char openingCurlyBracket = '{';
    public static final char closingSimpleBracket = ')';
    public static final char closingSquareBracket = ']';
    public static final char closingCurlyeBracket = '}';

    public static boolean balancedBrackets(String brackets){
        if(brackets.length() % 2 != 0){
            return false;
        }
        Stack stack = new Stack();
        for(int i = 0; i< brackets.length(); i++){
            char bracket = brackets.charAt(i);
            if((bracket == openingSimpleBracket) || (bracket == openingSquareBracket) || (bracket == openingCurlyBracket)){
                stack.push(bracket);
            }else{
                 switch (bracket){
                     case closingSimpleBracket:
                         if(stack.isEmpty() || (openingSimpleBracket != stack.pop())){
                             return false;
                         }
                         break;
                     case closingSquareBracket:
                         if(stack.isEmpty() || (openingSquareBracket != stack.pop())) {
                             return false;
                         }
                         break;
                     case closingCurlyeBracket:
                         if(stack.isEmpty() || openingCurlyBracket != stack.pop()){
                                 return false;
                         }
                         break;
                     default:
                         return false;
                 }
            }
        }
        return stack.isEmpty() ? true : false;

    }

    public static void main(String[] args) {
        System.out.println(balancedBrackets("{[()()}"));
    }
}
