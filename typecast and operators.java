/*TYPE CONVERSION: resultant datatype can be categorised into two segments 
 1. Implicit type conversion - a datatype of lower size is assigned to datatype of higher size.This is done implicitly by the JVM(Java Virtual Machine).This is also named as automatic Type conversion or coersion.*/
public class Main
{
	public static void main(String[] args) {
	int x=10;             //occupies 4 bytes
	double  y=x;          // occupies 8 bytes
	System.out.println(y);// prints 10.0
	}
}

/* 2. Explicit type conversion - a datatype of higher size cannot be assigned to a datatype of lower size.This is not done implicitly by the JVM and requires explicit casting ; A casting operation to be performed by the programmer.*/
public class Main
{
    public static void main(String[] args) {
	double x =10.5;  //8 bytes
	int y=(int) x;  //Type casting
	System.out.println(y);
	}
}
/*OPERATORS - It is a specialised symbol that performs a specific kind of evaluation on one,two or three operands.
 1. Assignment operator - for eg. b=25(b is leftvalue and 25 being rightvalue which is assigned to b using "=" called as assignment operator)
 2. Unary Arithemetic operator - works on single operand.It is classifies as:
  (i) Unary + :operand should be of numeric type eg. a=+8;
  (ii) Unary - :operand should be of numeric type eg. a=-8;
  (iii) Increament/Decreament Operator: it includes ++,-- */
class Main
{
    public static void main(String[] args)
    {
        int a,b,c;
        a=3;
        ++a;
        System.out.println(a);
        a++;
        System.out.println(a);
        b=a--;
        System.out.println(a);
        b=--a;
        System.out.println(a);
    }
}
/* 3. Binary Arithemetic operator: works on two operand .It includes +,-,/,*,%
4. Relational Operator : used to show relationship between dataitems in conditional expression.It includes >,<,>=,<=,==,!= */
class Main
{
    public static void main(String[] args)
    {
        int a,b;
        a=3;
        b=3;
        if(a==b)
        System.out.println("true");
        else
        System.out.println("false");
    }
}
//5. Logical operator : These are used to join two or more relational expression..It includes &&,||,!
class Main
{
    public static void main(String[] args)
    {
        int a,b,c;
        a=3;
        b=3;
        c=3;
        if(a==b && a==c)
        System.out.println("true");
        else 
        System.out.println("false");
    }
}
//6. Conditional operator : works on three operand so it is a ternary operator. SYNTAX: test condition?stmt1:stmt2;
class Main
{
    public static void main(String[] args)
    {
        int a,b,c;
        a=4;
        b=3;
        c=(a>b)?a:b;
        System.out.println("largest among two is="+c);
    }
}
/*7. new Operator :  It is used to allocate memory dynamically for objects and arrays in the heap with reference we define pointed from the stack.It is responsible to create new object.*/
 /*  8. Dot Operator : It is used to access the individual members of an object. SYNTAX: <objectname>.<method name>([parameter-list]). */
    
