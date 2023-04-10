/* **data types** 
There are different types of data that can be used in a java program. Java uses data types to identify data and dictates the method of handling it
A data msy be character, integer,floating point number or a string.
Broadly there are two types of Java data types:
1: Primitive/fundamental/intrinsic data types
2: Reference/composite/extrinsic data types.

1. Primitive data types.
these data types are used to represent basic data values. java provides 8 different primitive data types.
these are: byte,short,int,long,float,double,char,boolean. 
Here is a program to illustrate the types of value that each stores:*/

public class Main
static final double NUM=456.789;
{
	public static void main(String[] args) {
	   byte n1=4;
	   short n2=98;
	   int n3=2234176;
	   long n4=87654321;
	   float n5=54637.8765f;
	   double n6=54663729874.9958726534145;
	   char n7='a';
	   boolean n8=true;
		System.out.println("byte: "+n1);
		System.out.println("short: "+n2);
		System.out.println("int: "+n3);
		System.out.println("long: "+n4);
		System.out.println("float: "+n5);
		System.out.println("double: "+n6);
		System.out.println("char: "+n7);
		System.out.println("boolean: "+n8);
		System.out.println("constant: "+NUM);
	}
}

/*2. Reference data type.
reference or composite data typoes are secondary type of data. it is composed or constructed using primitive data types.
these may be a class, array,interface or string

**Variables and Constants** 
variable is a name given to memory location where data is stored or needs to be stored. the general format of variable decleration is as follows:
<data-type><variable-name>;
as given in above program n1,n2,n3,n4,n5,n6,n7,n8 are all variables of different data types as they are used to store the data allocated to them

Constant is a value that cannot be changed after assigning it. Java does not directly support the constants.
There is an alternative way to define the constants in Java by using the non-access modifiers static and final.
in the above program NUM is a constant*/
