package day6;

import java.util.Stack;

public class balancedParenthesis {
    class Solution {
        boolean isBalancedParentheses(String str) {
            // add your logic here
            if(str.equals("")){
                return true ;
            }
            if(str.charAt(0) == ')' || str.charAt(0) == ']' || str.charAt(0) == '}'){
                return false ;
            }
            Stack <Character> stack = new Stack<>();
            for(char ch : str.toCharArray()){
                if(ch == '(' || ch == '{' || ch == '['  ){
                    stack.push(ch);
                }else{
                    if(stack.isEmpty()){
                        return false;
                    }
                    char top = stack.pop();
                    if(ch == ')' && top != '('){
                        return false;
                    }
                    if(ch == '}' && top != '{'){
                        return false;
                    }
                    if(ch == ']' && top != '['){
                        return false;
                    }
                }
            }
            if(!stack.isEmpty()){
                return false;
            }
            return true ;
        }
    }
}
