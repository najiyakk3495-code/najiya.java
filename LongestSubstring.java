import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class LongestSubstring{
  public static void main(String[] args){
  Scanner sc=new
  Scanner(System.in);
  System.out.print("enter a string:");
  String str=sc.nextLine();
  Set<Character> set=new HashSet<>();
  int left=0;
  int maxLength=0;
  for(int right=0;right<str.length();right++){
  while
  (set.contains(str.charAt(right))){
  set.remove(str.charAt(left));
  left++;
  }
  set.add(str.charAt(right));
  maxLength=
  Math.max(maxLength,right-left+1);
  }
  System.out.println("length of longest substring:"+maxLength);
  }
  }