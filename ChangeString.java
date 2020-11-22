import java.util.*;

class ChangeString{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String a;
    System.out.println("Enter a sentence : ");
    a=sc.nextLine();
    String spl="";
    for(int i=0; i<a.length(); i++){
      char b=a.charAt(i);
      if(b!='a'||b!='e'||b!='i'||b!='o'||b!='u'||b!='A'||b!='E'||b!='I'||b!='O'||b!='U'){
        int c=(int)b+1;
        b=(char)c;
        if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'||b=='A'||b=='E'||b=='I'||b=='O'||b=='U'){
          c=c-2;
          b=(char)c;
          spl=spl+b;
        }
        else{
          spl=spl+b;
        }
      }
      else{
        spl=spl+b;
      }
    }
    System.out.println(spl);
  }
}
