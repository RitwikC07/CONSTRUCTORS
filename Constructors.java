package constructors;
public class Constructors 
	{ 
	    Constructors() 
	    { 
	        System.out.println("Default Constructor"); 
	    } 
	   
	    Constructors(int x) 
	    {  
	        this(); 
	        System.out.println(x); 
	    } 
	   
	    	Constructors(int x, int y) 
	    {  
	        this(5); 
	        System.out.println(x * y); 
	    } 
	}
	
