/* **LOOPS** 
Iterative constructs also called loops are structures used in a java program to execute a statement or a group of statements repeatedly as long as 
the given statement is satisfied or true. Java provides three kinds of loops:
1. For loops
2. While loops
3. Do-While loops

**Elements that control a loop:
every loop has elements that control its execution. These elements can be grouped as:
1. Initialisation expression: Before entering a loop, the variable taht controls the execution of it is initialisation.The initialisation of a 
variable may be inside a loop or ourtside it.
2. Test Expression: The test expression is a condition which decides whether the loop body will be executed or not.
3. Update Expression: The update expression change the control variable. the update expression is usually made to be executed;before the next iteration
4. Body of the loop: The statements that are executed repeatedly (as long as the test expression is true) form the body of the loop.

*Depending upon the way of a test-expression is evaluated in a loop it can be classified under the following:
1. Entry controlled loop : test expression is evaluated before entering the loop.
2. Exit controlled loop : test expression is evaluated before exiting the loop.

**1. THE FOR LOOP**
The for loop is an entry controlled loop and provides the most concise way to understand among other two loops.
SYNTAX: for(initialisation expression; test expression; update expression)
         {
             body of the loop;
         }
         
Eg: program to print first 10 natural numbers.*/

public class Main
{
	public static void main(String[] args) {
		int i;
		for (i=1;i<=10;i++)
		{
		    System.out.println(i);
		}
	}
}

/* **2. THE WHILE LOOP**
The second variety of loop available in java is the while loop. The ehile loop is also an entry controlled loop. 
SYNTAX: while(condition or test expression)
         {
             body of the loop;
         }
         
Eg: program to print first 10 natural numbers.*/

public class Main
{
	public static void main(String[] args) {
		int i=1;
		while(i<=10)
		{
		    System.out.println(i);
		    i++;
		}
	}
}

/* **3. THE DO-WHILE LOOP**
Unlike the for and while loops, the do-while is an exit controlled loop. This means that a do-while loop always executes at least once even 
if the test-expression is evaluated false.
SYNTAX: do
         {
             body of the loop;
         }
         while(condition);
Eg: program to print first 10 natural numbers.*/
public class Main
{
	public static void main(String[] args) {
		int i=1;
	    do
		{
		    System.out.println(i);
		    i++;
		}	while(i<=10);
	}
}
