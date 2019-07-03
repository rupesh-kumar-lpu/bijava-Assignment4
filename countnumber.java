public class countnumber{
  public static void main(String args[]){
    String s="aiAi12i3H44Bbb4560";
    int count=0;
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)>47 && s.charAt(i)<58){
        count++;
      }
    }
    System.out.println(Integer.toString(count));
  }
}
