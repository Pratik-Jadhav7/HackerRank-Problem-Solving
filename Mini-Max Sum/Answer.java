import java.io.*;
import java.util.*;

public class result{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    long[] arr = new long[5];
    
    for(int i=0; i<5; i++){
      arr[i] = sc.nextLong();
    }
    Arrays.sort(arr);
    long x=0; long y=0;
    for(int i=0; i<4; i++){
      x += arr[i];
    }
    for(int i=1; i<5; i++){
      y += arr[i];
    }
    System.out.println(x+" "+y);
  }
}