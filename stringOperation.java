import java.util.scanner;
class stringOperations{
public static  void main(string[]args){

scanner sc=new scanner(system.in);
 system.out.print("enter first string:");
 string str1=sc.nextLine();
 
 system.out.print("enter second string:");
 string str2=sc.nextLine();
  
   system.out.println("\ncharacter at index 0:"+
   str1.charAt(0));
   
    system.out.println("substring  from index 1:"+
	str1.substring(1));
	
	 system.out.println("concatenation:"+
	 str1.concat(str2));
	 
	  system.out.println("are both strings equal?:"+
	  str1.equals(str2));
	  
	   system.out.println("is first strings empty?:"+
	   str1.isEmpty());
	   
	   sc.close();
	   }
	   }
	   
	