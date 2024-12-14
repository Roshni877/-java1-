import java.util.Scanner;
public class MatrixAddition{
	public static void main(String[] args) {
		int n1=Integer.parseInt(args[0]);
		int[][]matrix1=new int[n1][n1];
		int[][]matrix2=new int[n1][n1];
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter elements of the first matrix");
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n1;j++) {
				matrix1[i][j]=sc1.nextInt();}}
		System.out.println("Enter elements of the second matrix");
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n1;j++) {
				matrix2[i][j]=sc1.nextInt();}}
		int[][]matrix3=new int[n1][n1];
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n1;j++) {
				matrix3[i][j]=matrix1[i][j]+matrix2[i][j];}}
		System.out.println("The sum of the two matrices is ");
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n1;j++) {
				System.out.print(matrix3[i][j]+ "\t");}
			System.out.println();}}}
