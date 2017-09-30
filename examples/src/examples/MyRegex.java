package examples;

class MyRegex {

	public static String pattern = "\\b(([0-1]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\.){3}([0-1]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\b";
}

/*
ANSWER BREAKDOWN:

\\b     	double '\' to escape the backslash. '\b' is singaling the beginning of a word group. Repeating this signals the end 
			of that word.
			
[0-1]?  	The characters 0-1 and due to the '?' they may appear 0 or 1 times.

[0-9]{1,2}  the characters 0-9 may appear 1 or 2 times.

|			or. Works exactly as it does in an if statement.

2[0-4][0-9] this is expecting 2 then any ONE character 0-4 then any ONE character 0-9. This covers the range 200-249.

\\.			double escaping '.' this is looking for a single '.' at the end.

{3}			repeat the regex in the () 3 times exactly.
   
*/