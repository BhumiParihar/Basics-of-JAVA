/* **CONSTRUCTOR TYPES** 
Constructor functions can be broadly classified under two groups, namely 
1. Non-Parameterised Constructor
2. Parameterised Constructor*/

/* **NON-PARAMETERISED CONSTRUCTOR** 
As the name suggests that it doesn't have any parameter list i.e. accepts no parameters. Thus in the below example of the cuboid class the Cuboid() is a non-parameterised constructor.Constructors with no parameters are also defaukt constructor*/
class Cuboid
{
	double width;
	double height;
	double depth;
	Cuboid() // constructor
	{
	    width=10;
	    height=29;
	    depth=3;
	}
	 void calculate()
	{
	    double vol;
	    vol=width*height*depth;
	    System.out.println("Volume of cuboid is = "+vol);
	    }
}

/* **PARAMETERISED CONSTRUCTOR**
The name itself suggests that these constructors accept a parameter lists. The advantage of this constructor type over non-Parameterised constructor is that you can initialise the data members of a class with different values.*/
class Cuboid
{
	double width;
	double height;
	double depth;
	Cuboid() // non-Parameterised constructor
	{
	    width=10.0;
	    height=29.67;
	    depth=3.89;
	}
	Cuboid(double w, double h,double d) // Parameterised constructor
	{
	    width=w;
	    height=h;
	    depth=d;
	}
	 void displayVolume()
	{
	    double vol;
	    vol=width*height*depth;
	    System.out.println("Volume of cuboid is = "+vol);
	    }
	 static void createobjects()
	 {
	     cuboid mycuboid1=new Cuboid(1.5,2.5,4.5);
	     cuboid mycuboid2=new Cuboid(2.7,8.5,5.5);
	     cuboid mycuboid3=new Cuboid();
	     cuboid mycuboid4=new Cuboid();
	     mycuboid1.displayVolume();
	     mycuboid2.displayVolume();
	     mycuboid3.displayVolume();
	     mycuboid4.displayVolume();
	 }
}
/* Copy Constructor is a constructor that creates a new object using an existing object of the same class and initialises each instance variables of the newly created object with corresponding instance variables of the existing object passed as argument*/
/* **CONSTRUCTOR OVERLOADING**
Constructor Overloading is a concept of having more than one constructor with different parameters list, in such a way si that each constructor performs a different task.*/
class Cuboid
{
	double width;
	double height;
	double depth;
	Cuboid() // non-Parameterised constructor
	{
	    width=0;
	    height=0;
	    depth=0;
	}
	Cuboid(double n) // non-Parameterised constructor
	{
	    width=height=depth=n;
	}
	Cuboid(double w, double h,double d) // Parameterised constructor
	{
	    width=w;
	    height=h;
	    depth=d;
	}
	 void displayVolume()
	{
	    double vol;
	    vol=width*height*depth;
	    System.out.println("Volume of cuboid is = "+vol);
	    }
	 static void createobjects()
	 {
	     cuboid mycuboid1=new Cuboid();
	     cuboid mycuboid2=new Cuboid(2.7);
	     cuboid mycuboid3=new Cuboid(2.7,8.5,5.5);
	     mycuboid1.displayVolume();
	     mycuboid2.displayVolume();
	     mycuboid3.displayVolume();
	 }
}
