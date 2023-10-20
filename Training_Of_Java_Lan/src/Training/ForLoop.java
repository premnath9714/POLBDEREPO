package Training;

public class ForLoop {
	
	// For loop syntax   for(starting condition; conditional statement; increment or decrement)
	// india he nav 5 times print
	//for(int i=1; i<=5; i++){
	
	   // System.out.println("india");
	
	//}
    
	public static void main(String[] args) {
		 String s="india";
		 String rev="";
		
	
		for(int i=4; i>=0; i--){
			     // rev=""+a;
			     //rev="a"
			      //rev="a"+i;
			      //rev="ai";
			     // rev="ai"+d
			     //rev="aid";
			     // rev="aid"+n;
			     //rev="aidn"
			     // rev="aidn"+i
			     //rev="aidni";
			
		         rev=rev+s.charAt(i);
			   
			    }
		System.out.println(rev);

	}

}
