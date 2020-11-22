import java.util.*;

class SwitchCase{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String");
    String s=sc.nextLine();
    String a=" ";
    for(int i=0; i<s.length(); i++){
      if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
        char t=Character.toUpperCase(s.charAt(i));
        a=a+char
      }
      else if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
        char t=Character.toLowerCase(s.charAt(i));
        a=a+char
      }
      else{
        char o = s.charAt(i);
        a=a+o;
      }
      System.out.println(a);
    }
  }
}
