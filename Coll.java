package vidya;

import java.util.Arrays;

public class Coll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] br = {57,6,72,8,10,12};
Arrays.sort(br, 0, 6);

for(int i=0;i<br.length;i++)
{
	System.out.print(br[i]);
}
System.out.println();
String [] names= {"vidya","murugan","ajay","punai"};
MyComparator mc = new MyComparator();
//Arrays.sort(br,mc);
Arrays.sort(names, mc);
//Arrays.sort(names);
for(int i=0;i<names.length;i++)
{
	System.out.println(names[i]);
}
	}

}
