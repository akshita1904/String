import java.util.*;

class TypesNo{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String");
    String s=sc.nextLine();
    int l=0;
    int u=0;
    int d=0;
    int s=0;
    for(int i=0; i<s.length(); i++){
      if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
        l=l+1;
      }
      else if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
        u=u+1;
      }
      else if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
        d=d+1;
      }
      else{
        s=s+1;
      }
      System.out.println("lower cases: "+l);
      System.out.println("upper cases: "+u);
      System.out.println("digits: "+d);
      System.out.println("special chars: "+s);
    }
  }
}
