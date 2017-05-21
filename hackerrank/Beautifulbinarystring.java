import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Beautifulbinarystring {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    String B = in.next();
    ArrayList<Integer> arr = new ArrayList<Integer>();
    for(int i=0;i+3<=B.length();i++){
      if((B.substring(i,i+3)).equals("010")){
        arr.add(i);
        arr.add(i+2);
      }
    }
    int count=0,c;
    int i;
    for(i=1;i+2<arr.size();i=i+c){
      if(arr.get(i)==arr.get(i+1)){
        count++;
        c=4;
      }
      else{
        count++;
        c=2;
      }
    }
    if(i==arr.size()-1){
        count++;
    }
    System.out.println(count);
  }

}
