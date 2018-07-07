class ArrayTest {
	
	public static void testArray(int arr[]){
		System.out.println("first element = " + arr[0]);
	}

	public static void main(String args[]){
		int arr[] = new int[5];
		arr[0] = 123;
		arr[1] = 123;
		arr[2] = 123;
		arr[3] = 123;
		arr[4] = 123;

		int arr1[]	= {1, 2, 3, 4};	

		//simple for loop
		for(int j =0; j< arr.length; j++){
			System.out.println("+++++++"+ arr[j]);
		}

		//foreach loop
		for(int x: arr1){
			System.out.println("+++++++==="+ x);
		}

		testArray(arr1);
	}
}