class SumTest{
	private int sum = 0;
	private int findSum(int[] arr, int l, int r){
		if(l>r)
			return -1;

		for(int i=0; i<arr.length; i++){
			if (i >= l && i<=r){
				sum += arr[i];
			}
		}
		return sum;
	}

	public static void main(String args[]){
		int arr[] = {1, 2, 3, 4, 5, 6, 7};


		int x = new SumTest().findSum(arr, 1, 4);
		System.out.println("=================" + x);


	}
}