import java.util.*;

class ReplaceE{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String");
    String s=sc.nextLine();
    String a=" ";
    for(int i=0; i<s.length(); i++){
      if(s.charAt(i)=='e'){
        a=a+'*';
      }
      else{
        char o = s.charAt(i);
        a=a+o;
      }
      System.out.println(a);
    }
  }
}
