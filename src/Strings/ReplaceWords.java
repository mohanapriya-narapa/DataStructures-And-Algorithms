package Strings;

import java.util.HashSet;

public class ReplaceWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> hs=new HashSet<String>();
hs.add("cat");
hs.add("bat");
hs.add("rat");
String str="the cattle was rattled by the battery";
String[] strarray=str.split(" ");
StringBuilder sb=new StringBuilder();
boolean flag=false;
for(int i=0;i<strarray.length;i++)
{
	for(String prefix: hs)
	{
		if(strarray[i].indexOf(prefix)==0)
				{
			flag=true;
			sb.append(prefix +" ");
			System.out.println(prefix);
			break;
				}
	}
	if(!flag)
		{
		sb.append(strarray[i]+" ");
		
		}flag=false;
		}
System.out.println(sb);
}

	
	}
