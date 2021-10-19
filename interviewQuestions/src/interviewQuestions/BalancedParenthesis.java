package interviewQuestions;
import java.util.Scanner;
import java.util.Stack;
//Find if the parenthesis are balanced or not
// for example {[()]} is balanced
public class BalancedParenthesis {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string of brackets ");
		String x=sc.next();
		System.out.println("you have entered: "+x);
		if(bracketBalance(x)) System.out.println("The brackets are balanced");
		else System.out.println("The brackets are not balanced");
		sc.close();
	}
	
	static boolean bracketBalance(String s) {
		Stack<Character> ans= new Stack<>();
        for(int i=0; i<s.length(); i++){
            char current=s.charAt(i);
            if( current=='{'||current=='['||current=='(' ) {
                ans.push(current);
            }
            else{
                if(ans.isEmpty()) return false;
                if(current=='}' && ans.peek()=='{') {ans.pop();}
                else if(current==']' && ans.peek()=='[') {ans.pop();}
                else if(current==')' && ans.peek()=='(') {ans.pop();}
                else return false;
            }
        }
        return ans.isEmpty();
	}

}
