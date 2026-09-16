import java.util.scanner;
class stringOperations{
public static  void main(String[]args){

Scanner sc=new Scanner(System.in);
 System.out.print("enter first String:");
 String str1=sc.nextLine();
 
 System.out.print("enter second String:");
 String str2=sc.nextLine();
  
   System.out.println("\ncharacter at index 0:"+
   str1.charAt(0));
   
    System.out.println("substring  from index 1:"+
	str1.substring(1));
	
	 System.out.println("concatenation:"+
	 str1.concat(str2));
	 
	  System.out.println("are both strings equal?:"+
	  str1.equals(str2));
	  
	   System.out.println("is first strings empty?:"+
	   str1.isEmpty());
	   
	   sc.close();
	   }
	   }
	   
	