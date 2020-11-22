import java.util.*;

class Initials{
  public static void main(String[] args) {
    String st,sn,st1="",st2="";
    int i, p;
    char a;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter full name");
    st=sc.nextLine();
    st=' '+st;
    p=st.lastIndexOf(' ');
    sn=st.substring(p);
    for(i=0; i<p; i++){
      a=st.charAt(i);
      if(a==' '){
        st1=st1+st.charAt(i+1)+'.';
      }
    }
    st2=st1+sn;
    System.out.println(st2);
  }
}
