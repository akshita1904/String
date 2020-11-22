import java.util.*;

class WordFinder{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String st,st1="",st2="";
    int  i, p, f=0;
    char chr;
    System.out.println("Enter the sentence");
    st=sc.nextLine();
    System.out.println("Enter the word to be searched for : ");
    st1=sc.nextLine();
    st=st+' ';
    p=st.length();
    for (i=0; i<p; i++){
      chr=st.charAt(i);
      if(chr==' '){
        if(st2.compareTo(st1)==0){
          f=f+1;
          st2="";
        }
      }
      else{
        st2=st2+chr;
      }
    }
    System.out.println("frequency = "+f);
  }
}
