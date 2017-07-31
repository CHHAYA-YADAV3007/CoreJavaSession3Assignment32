/**
 * superThis.Java   
 * version  1.1
 * compiled on 31st July 2017
 */
package session3assignment32;


/**
 * 
 * This class will depict the parent class to display the functioning of super and this keyword.
 * @author chhaya yadav
 *
 */
public class superThis{
	
	protected String param ;
	
// Default Constructor is declared below. 	
	
	    public superThis() {
		
	       System.out.println("PARENT DEFAULT CONSTRUCTOR")  ;
		
	    }
	
// Parameterized Constructor is declared below.
	
	    public superThis(String param){
	    	
	    	this.param = param ;

           System.out.println("PARENT PARAMETERIZED CONSTRUCTOR  :" + param)  ;
			
	    }
	    
}



