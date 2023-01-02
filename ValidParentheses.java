import java.util.Stack;

public class ValidParentheses{
public  boolean isValid(String s) {
    Stack<Character> st=new Stack<>();
    char[] c=s.toCharArray();
    if(s.length()<2){
        return false;
    }
    for(int i=0;i<c.length;i++){
        if(c[i]=='('){
            st.push(')');
        }else if(c[i]=='{'){
            st.push('}');
        }else if(c[i]=='['){
            st.push(']');
        }else if(st.isEmpty()){
            return false;
        }else if(st.pop()!=c[i]){
            return false;
        }
    }
    return st.isEmpty();
}
}
