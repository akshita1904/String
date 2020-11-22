import java.util.*;

class PatternOne{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String value");
    String s=sc.nextInt();
    for (int i=0; i<s.length(); i++) {
      System.out.println(s.charAt(i));
    }
  }
}
