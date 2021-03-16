package exercise;

public class text2 {

	public static void main(String[] args) 
	{
		// TODO 自动生成的方法存根
		int arr[] = { 8,5,6,9,1,4,7,3,2,11 };
		int i=0;
		int flag = 1;

		for (i = 0; i < arr.length-1; i++)
		{
			
			for (int j = 0; j < arr.length-1 - i; j++)
			{
				if (arr[j] > arr[j + 1])
				{
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
					flag = 0;
				}
			}
			if (flag == 1)
			{
				break;
			}
		
		for (i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
			//printf("%4d", arr[i]);
		}
	}
  }
}
