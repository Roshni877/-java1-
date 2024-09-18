import java.util.Scanner;
public class R4{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the start value:");
        int start=scanner.nextInt();
        System.out.print("Enter the end value:");
        int end=scanner.nextInt();
        scanner.close();
        for(int i=start;i<=end;i++){
        System.out.println("Multiplication Table for "+i);
        for(int j=1;j<=10;j++){
        System.out.println(i+"x"+j+"="+(i*j));
   }
        System.out.println();
      }
   }
}
