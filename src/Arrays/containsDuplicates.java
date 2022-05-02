package Arrays;

import java.util.HashSet;

public class containsDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=false;
int[] arr=new int[] {1,2,3,1};
HashSet<Integer> hs=new HashSet<Integer>();
for(int i=0;i<arr.length;i++)
{
	if(!hs.add(arr[i]))
	{
		flag=true;
		
	}
}
System.out.println(flag);
	}

}
