import java.util.*;
public class parenthisis {
    public static void main(String[] args){
        String str="{[]}";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<st.size();i++){
            if(str.charAt(i)=='{' || str.charAt(i)=='['||str.charAt(i)=='('){
                st.push(str.charAt(i));
            }
            else if (!st.isEmpty() &&(( str.charAt(i)=='{' && st.peek()=='}') ||
            (str.charAt(i)=='[' && st.peek()==']' ) || (str.charAt(i)=='(' && st.peek()==')'))){
                st.pop();
            }else{
                st.push(str.charAt(i));
            }
        }
        if(st.isEmpty()){
            System.out.println("balanced");
        }else{
            System.out.println("not balanced");
        }
        }
}

