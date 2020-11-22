import java.util.*;

class WordReverse{
  public static void main(String[] args) {
    String st, st1="", st2="";
    int i,p;
    char chr, chr1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a sentence");
    st=sc.nextLine();
    st=st+' ';
    p=st.length();
    for(i=0; i<p; i++){
      chr=st.charAt(i);
      if(chr==' '){
        st2=st2+' '+st1;
        st1="";
      }
      else{
        st1=chr+st1;
      }
    }
    System.out.println(st2);
  }
}
