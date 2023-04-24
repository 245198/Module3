package DEMO;

public class ArrayDemo {
	static int oddIndex;
	static int evenIndex;
	static int len;
	
	public static int [] mergeArr(int arr1[],int arr2[])
	{
		int index=0;
		int l1 = arr1.length;
		int l2 = arr2.length;
		int[] mergeArray= new int[l1+l2];
		for(int i=0;i<l1;i++)
		{
			mergeArray[index]=arr1[i];
			index++;
		}
		for(int i=0;i<l2;i++)
		{
			mergeArray[index]=arr2[i];
			index++;
		}
		return mergeArray;
	}
	
	public static void oddEven(int arr[])
	{

		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				evenIndex++;
			}
			else
			{
				oddIndex++;
			}
		}
		int [] oddArr=new int[oddIndex];
		int [] evenArr=new int[evenIndex];
		int o=0;
		int e=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				evenArr[e]=arr[i];
				e++;
			}
			else
			{
				oddArr[o]=arr[i];
				o++;
			}
		}
		System.out.println("Odd array");
		for(int i=0;i<oddIndex;i++)
		{
			System.out.print(oddArr[i]+" ");
		}
		System.out.println("\neven array");
		for(int i=0;i<evenIndex;i++)
		{
			System.out.print(evenArr[i]+" ");
		}
		System.out.println("\nMerged array");
		
	int [] result=mergeArr(evenArr, oddArr);
	for(int i=0;i<result.length;i++)
	{
		System.out.print(result[i]+" ");
	}
		
		
	}

	public static void main(String[] args) {
		
		int [] arr= {2,13,4,11,10,6};
		//oddEven(arr);
		int len1=arr.length;
		int h= len1/2;
		System.out.println("\n");
		int temp;
		
		for(int i=0;i<len1;i++)
		{
			for(int j=i+1;j<len1-i;j++)
			{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		}
		System.out.println("sorted array");
		for(int i=0;i<len1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		if(len1%2!=0)
		{
			System.out.println("Median:"+(arr[h]));
		}
		else
		{
			int m=arr[h-1]+arr[h];
			System.out.println("Median:"+m/2);
		}

	}

}
