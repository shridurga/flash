
public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x[]= {1,2,3,4};
for (int i=0;i<x.length;i++) {
	
	System.out.println("the elements of x are "+x[i]);
}

System.out.println("the elements in the array are ");
System.out.println("here the values are immutable as we are using enhanced for loop");

for(int y:x) {
	System.out.println(y);
	
}

System.out.println("the elements in the string are");

String str[] = {"abc","pqr","xyz"};

for(String string:str)
{
	System.out.println(string);
}


	
	}
}
