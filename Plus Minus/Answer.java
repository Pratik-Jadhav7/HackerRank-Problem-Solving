import java.util.Scanner;

public class result{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    int positiveCount=0; int negativeCount=0; int zeroCount = 0;
    
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
      if(arr[i] < 0){
        negativeCount++;
      }
      else if(arr[i] > 0){
        positiveCount++;
      }
      else if(arr[i] == 0){
        zeroCount++;
      }
    }
    float a=0f, b=0f, c=0f;
    a = (float)positiveCount/n;
    b = (float)negativeCount/n;
    c = (float)zeroCount/n;
    
    System.out.printf("%.6f \n", a);
    System.out.printf("%.6f \n", b);
    System.out.printf("%.6f ", c);
  }
}