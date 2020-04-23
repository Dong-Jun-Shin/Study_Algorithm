package bv;

import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * stack과 재귀함수를 이용한 괄호 알고리즘 문제
 * @author tlseh
 *
 */
public class ex_01 {
	public static void main(String[] args) {
		String[] values = { "2", "{[}]", ")", "}", "]", "[()]", 
				"{{[[(())]]}}", "}][}}(}][))]", "[](){()}", "()", "({}([][]))[]()", 
				"{)[](}]}]}))}(())(", "([[)"};
		
		Map<Character, Character> bracket = new HashMap<Character, Character>(); 
		bracket.put('(', ')');
		bracket.put('{', '}');
		bracket.put('[', ']');
		bracket.put(')', '(');
		bracket.put('}', '{');
		bracket.put(']', '[');
		
		for (int i = 1; i < values.length; i++) {
			Stack<Character> stack = new Stack<Character>();
			for (int j = 0; j < values[i].length(); j++) {
				char elem = values[i].charAt(j);
				char compare = bracket.get(elem);
				boolean open = true;
				
				if(elem == ')' || elem == '}'  || elem == ']' )
					open = false;

				try {
					if(open) 
						stack.push(elem);
					else { 
						if(stack.peek() == compare)
							stack.pop();
						else
							throw new EmptyStackException();
					}
				} catch (EmptyStackException e) {
					values[i] = "NO";
					break;
				}
			}
			
			if(!values[i].equals("NO"))
				values[i] = "YES";
		}
		
		for (String str : values) {
			System.out.println(str);
		}
	}

	
//	public static void main(String[] args) {
////		String[] values = { "2", "}][}}(}][))]", "[](){()}", "()", "({}([][]))[]()", "{)[](}]}]}))}(())(", "([[)"};
//		String[] values = { "2", "{[}]", ")", "}", "]", "[()]", "{{[[(())]]}}"};
//		
//		for (int i = 0; i < values.length; i++) {
//			values[i] = valence(values, 0, 0);
//		}
//		
//		
//		String[] strArr = new String[values.length-1];
//		for (int i = 0; i < strArr.length; i++) {
//			strArr[i] = values[i];
//		}
//		
//		
//		for (String string : values) {
//			System.out.println(string);
//		}
//		
//		for (String string : strArr) {
//			System.out.println(string);
//		}
//	}
//	
//	public static String valence(String[] values, int i, int j) {
//		boolean bool = true;
//		String boolStr = "";
//		
//		
//		// [()]
//		for (; j < values[i].length(); j++) {
//			bool = compare(values, i, j);
//		}
//		
//		if(bool)
//			boolStr = "YES";
//		else
//			boolStr = "NO";
//		
//		return boolStr;
//	}
//	
//	public static boolean compare(String[] values, int i, int j) {
//		char compare = '\0';
//		
//		switch (values[i].charAt(j)) {
//		case '(':
//			compare = ')';
//			break;
//		case '{':
//			compare = '}';
//			break;
//		case '[':
//			compare = ']';
//			break;
//		default:
//			break;
//		}
//		
//		if(j+1 < values[i].length()) {
//			if (values[i].charAt(j+1) != compare) {
//				compare(values, i, j+1);
//				
//				return false;
//			}
//		}
//		
//		return true;
//	}
}
