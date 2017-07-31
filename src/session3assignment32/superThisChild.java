/**
 * superThisChild.Java   
 * version  1.1
 * compiled on 31st July 2017
 */
package session3assignment32;


/**
 * 
 * This class will depict the child class to display the functionality of super and this.
 * @author chhaya yadav
 *
 */

// THIS CLASS WILL INHERIT THE PARENT CLASS

public class superThisChild extends superThis{
	
// INSTANCE VARIABLE DECLARATION	
	
	   private int child_nr ;
	   
	   
// DEFAULT CONSTRUCTOR OF CHILD CLASS
	   
	   public superThisChild(){
		   
		   System.out.println(" CHILD DEFAULT CONSTRUCTOR");
	   }
	   
// PARAMETERIZED CONSTRUCTOR OF CHILD CLASS	   
	   
	   public superThisChild(int child_nr){
		   
		   super("First Child");              // CALLING THE PARAMETERIZED CONSTRUCTOR OF PARENT CLASS
		   
		   this.child_nr = child_nr  ;        // DECLARATION OF THIS KEYWORD
		   
		   System.out.println(" CHILD PARAMETERISED CONSTRUCTOR :  " + child_nr );
	   }
	   

// MAIN METHOD FOR INVOKING THE CONSTRUCTOR VIA CREATION OF CHILD CLASS OBJECT	
	   
	   public static void main(String[] args) {
		   
// CREATION OF OBJECT OF CHILD CLASS		   
		   
		   superThisChild s1 = new superThisChild(1);
		   
// DISPLAYING THE PRIVATE VARIABLE OF CHILD CLASS		   
		   
		   System.out.println("CHILD CLASS Number of Child  :  "+s1.child_nr) ; 
		   
// DISPLAYING THE PROTECTED VARIABLE OF PARENT CLASS		   
		   
		   System.out.println("PARENT CLASS NUMBER OF CHILD :  "+s1.param) ;
		 
		
	   }
}
