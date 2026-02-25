import java.util.Scanner;
public class MatrixAddition{
  public static void main(String[] args){
    int p,q,m,n;
    Scanner s=new Scanner(System.in);
		System.out.println("enter the num of row in matrix A:");
		p=s.nextInt();
		
		System.out.println("enter the num of colomn in matrix A:");
		q=s.nextInt();
		
		System.out.println("enter the num of row in matrix B:");
		m=s.nextInt();
		
		System.out.println("enter the num of row in matrix B:");
		n=s.nextInt();
		
		if(p==m&&q==n){
			int a[][]=new int[p][q];
			int b[][]=new int[m][n];
			
			System.out.println("enter the elment of matrix A:");
			for(int i=0;i<p;i++)
				for(int j=0;j<q;j++)
					a[i][j]=s.nextInt();
					
			System.out.println("enter the elment of matrix B:");
			for(int i=0;i<m;i++)
				for(int j=0;j<n;j++)
					b[i][j]=s.nextInt();
			
			System.out.println("matrix A:");
			for(int i=0;i<p;i++)
				for(int j=0;j<q;j++)
					System.out.println(a[i][j]+"");
					
			System.out.println("matrix B:");
			for(int i=0;i<m;i++)
				for(int j=0;j<n;j++)
					System.out.println(b[i][j]+"");
					
			System.out.println();

		System.out.println("Sum matix:");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				System.out.println(a[i][j]+b[i][j]+"");
	}
	else{
		System.out.println("these martix cannt added");
	}
}
}
