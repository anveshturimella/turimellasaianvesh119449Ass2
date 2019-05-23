import java.util.Scanner;
public class HeapSorting
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		int n, res,i;
		
		System.out.println("How Many Elements do you want sort");
		n = read.nextInt();
		int a[] = new int[n];
		System.out.println("Enter "+n+" elements ");
		for( i=0; i < n; i++)
		{
			a[i] = read.nextInt();
		}
		 
		System.out.println( "Elements before sort\n");
		for(i=0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		Sort(a);
		System.out.println( "\nElements after sorting\n");
		for(i=0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	public static void Sort(int a[])
	{ 
		int i,j;
		int temp;
		for(i=(a.length/2)-1;i>=0;i--)
		{
			heaping(a,i,a.length);
		}
		for( i=(a.length)-1; i>0;)
		{
			temp=a[0];
			a[0]=a[i];
			a[i]=temp;
			heaping(a,0,i--) ;
		} 
	}

	public static void heaping(int x[],int index,int num)
	{ 
		int l,r,temp,biggest;
		
		l=index*2+1;
		r=2*index+2;
		 
		if(l<num && x[l]>x[index])
			biggest=l;
		else
			biggest=index;
		 
		if(r<num && x[r]>x[biggest])
			biggest=r;
		 
		if(biggest !=index)
		{
			temp=x[biggest];
			x[biggest]=x[index];
			x[index]=temp;
			heaping(x,biggest,num);
		}
	}
}