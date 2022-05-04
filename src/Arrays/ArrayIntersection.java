package Arrays;
import java.util.*;
public class ArrayIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums1=new int[] {1,2,2,1};
int[] nums2=new int[] {2,2};
int i=0;int j=0;
Arrays.sort(nums1);
Arrays.sort(nums2);
List<Integer> li=new ArrayList<Integer>();
while(i<nums1.length && j<nums2.length)
{
	if(nums1[i]==nums2[j])
	{
		li.add(nums1[i]);
		i++;j++;
	}
	else if(nums1[i]<nums2[j])
	{
	i++;
	}
	else {
		j++;
	}
}
System.out.println(li);
	}

}
