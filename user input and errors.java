/* USER INPUT : Taking in some data is called Input.Input or inserting data in Java may be:
1. Initialisation of variables: It is the assignment initial value to variable eg. int s=5;
2. Parameterised Input : The process of passing values to arguments in a method during execution is called Parameterised input.*/
class sumprac
{
	static void add(int a,int b,int c)
	{
	    int d;
	    d=a+b+c;
	    System.out.println("Sum ="+d);
	}
}
/* 3. Scanner input: Parameterised inputs are generally used for simple programs that do not require any prompt messages for taking inputs.If you want to specify the user,what is to be taken as input,which only programmer would know,Scanner input will be feasible.
Input Through Scanner Class: The Scanner class is a library class  in java.util package( simple folders that contain pre-compiled classes for the user),that allows user to read values of various types.Scanner class can be used by importing it before implementing the class.
import java.util.Scanner; or import java.util.*;
To use functions associated with the Scanner class we need to create an object which scans the screen for any input from the system input device.object can be created as:
Scanner sc=new Scanner(system.in);
Here object is sc which scans the screen for some input given from system's input stream ,which is represented as System.in.*/
import java.util.Scanner;  // Scanner library class in imported
class subtract
{
    static void findsub()
    {
        Scanner sc=new Scanner(System.in);  // object of Scanner class is created
        int a,b,c,d;
        System.out.println("enter three Integers : ");
        a=sc.nextInt();  // input is taken
        b=sc.nextInt();
        c=sc.nextInt();
        d=a+b+c;
        System.out.println("Sum of the Integers is ="+d);
    }
}
/* ERRORS:It is always possible that an error may creep out,when we are typing the program .An error is also called as bug and the process of removing it is calles debugging.
TYPES OF ERROR: It is classified into three categories:
1. Syntax error: It is the error in the syntax of a sequence of Characters or tokens that is intended to be written in a particular program.*/
class Syntaxerror
{
    static void test()
    {
        float f=12.4;// syntax error because it should have been //12.4f
        System.out.println(f);
    }
}
/* 2. Logical error: It is a bug in the program which causes it to operate incorrectly,but not terminate abnormally.
3. Run Time Error: error that occurs during execution of program.Also called Exception error.
There are 2 possible run time error:
ArithmeticException-eg. to handle the divide by 0 error.
InputMismatchException-eg. to handle the situation when the user enters a value of data type other than integer.*/
