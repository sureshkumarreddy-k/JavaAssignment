// Question 8: Java Stack

import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			String input=scan.next();
            Stack<String> paren = new Stack<String>();
    for (String p : input.split("")) {
        if (!p.isEmpty()) {
            if (paren.isEmpty()) {
                paren.push(p);
            } else {
                String top = paren.peek();
                if (p.equals("}") && top.equals("{")
                    || (p.equals("]") && top.equals("[") 
                    || (p.equals(")") && top.equals("(")))) {
                    paren.pop();
                } else {
                    paren.push(p);
                }
            }
        }
    }
    String toPrint = (paren.isEmpty()) ? "true" : "false";
    System.out.println(toPrint);
		}
		
	}
}



