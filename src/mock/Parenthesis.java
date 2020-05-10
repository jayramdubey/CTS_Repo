package mock;

import java.io.*;
import java.util.*;

/*
 *Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true
Example 2:

Input: "()[]{}"
Output: true
Example 3:

Input: "(]"
Output: false
Example 4:

Input: "([)]"
Output: false
Example 5:

Input: "{[]}"
Output: true

Input: "{[](){([])}}"
Output: true
 */

public class Parenthesis {

	public static void main(String[] args) {
		String input = "{()[]}"; // Valid one... has to return true
		System.out.println(isValid(input));
	}

	public static boolean isValid(String str) {

		Stack<Character> st = new Stack<>();
		int len = str.length();
		if (str == null)
			return false;

		for (int i = 0; i < len; i++) {
			char curr = str.charAt(i);
			if (curr == '[' || curr == '{' || curr =='(') {
				st.push(curr);
			} else if (curr == (')') || curr == ('}') || curr == (']')) {
				char last = st.peek();
				if (curr == (')') && last == ('(') || curr == ('}') && last == ('{')
						|| curr == (']') && last == ('[')) {
					st.pop();
				} else {
					return false;
				}
			}
		}
		return st.empty() ? true : false;
	}
}
