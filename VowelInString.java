
public class VowelInString{
  public static void main(String args[]){
int v=0,c=0;
String s="hiihio";
for(int i=0;i<s.length();i++){
  char sCharAti=s.charAt(i);
  if(sCharAti=='a'||sCharAti=='e'||sCharAti=='i'||sCharAti=='o'||sCharAti=='u'||sCharAti=='A'||sCharAti=='E'||sCharAti=='I'||sCharAti=='O'||sCharAti=='U'){
    v++;

  }
  else{
    c++;
  }
}
System.out.println("Number of Vowels in String"+" : "+Integer.toString(v));
System.out.println("Number of Consonents in String"+" : "+Integer.toString(c));

  }
}
