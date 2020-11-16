package arrays;

public class Cloning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int intArray[]= {1,2,3,5};
int cloneArray[]= intArray.clone();

for(int i= 0;i<intArray.length;i++)
{
	System.out.println(intArray[i]+" "+cloneArray[i]);
}
System.out.println(intArray == cloneArray);
	


// Lets try this for 2 dimensional arrays
//here only shallow copy takes place which means
//only single new array is created remaining sub arrays are shared
//ex:

int arr1[][]= {{1,2,3},{2,3,4}};
int arr2[][] = arr1.clone();

System.out.println(arr1==arr2);//false

System.out.println(arr1[0]==arr2[0]);




	}

}

