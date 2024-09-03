package com.CollectionExample;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;
import java.util.function.IntPredicate;

public class StackExample {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        HashMap<Character,Character> mp = new HashMap<>();
        mp.put(')','(');
        mp.put('}','{');
        mp.put(']','[');
        String str = sc.next();
        IntPredicate checkOpening = (i) -> (str.charAt(i) == '(' || str.charAt(i)=='{' || str.charAt(i)=='[');
        for(int i=0;i<str.length();i++){
            if(checkOpening.test(i)){
                st.push(str.charAt(i));
            }
            else{
                if(st.empty()){
                    System.out.println("Invalid Parenthesis");
                    return;
                }
                if(st.peek() == mp.get(str.charAt(i))){
                    st.pop();
                }
                else{
                    System.out.println("Invalid Parenthesis");
                    return;
                }
            }
        }
        System.out.println("Valid Parenthesis");
    }
}
