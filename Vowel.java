import java.util.*;

class Vowel{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String value");
    String s=sc.nextInt();
    int count=0;
    for (int i=0; i<s.length(); i++) {
      if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
        count=count+1;
      }
    }
    if (count==0){
      System.out.println("no of vowels :  "+count);
    }
  }
}
