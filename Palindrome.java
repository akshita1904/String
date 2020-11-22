import java.util.*;

class Palindrome{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a word");
    String a=sc.nextLine();
    String b="";
    int x, y;
    for(x=a.length()-1; x>=0; x--){
      b+=a.charAt(x);
    }
    if(a.equalsIgnoreCase(b)){
      System.out.println("Palindrome");
    }
    else{
      System.out.println("Not Palindrome");
    }
  }
}
