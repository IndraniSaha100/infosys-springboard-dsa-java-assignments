class Main {
    
    public static int iterations=0;
	
	public static int searchIteration(int elements[],int low,int high,int elementToBeSearched,int iteration)  {
		if (low <= high) {
			int mid = (low + high) / 2;

			if (elements[mid] == elementToBeSearched)
				return iteration;

			if (elements[mid] < elementToBeSearched)
				return searchIteration(elements, mid + 1, high, elementToBeSearched,iteration+1);

			return searchIteration(elements, low, mid - 1, elementToBeSearched,iteration+1);
		}
		return -1;
	}
	public static int searchElement(int elements[],int low,int high,int elementToBeSearched)  {
		if (low <= high) {
			int mid = (low + high) / 2;

			if (elements[mid] == elementToBeSearched)
				return mid;

			if (elements[mid] < elementToBeSearched)
				return searchElement(elements, mid + 1, high, elementToBeSearched);

			return searchElement(elements, low, mid - 1, elementToBeSearched);
		}
		return -1;
	}
	public static void main(String[] args) {
	    int[] elements = { 1, 23, 43, 46, 78, 90 };
		int elementToBeSearched = 43;
		
		int indexPosition=searchElement(elements, 0, elements.length-1, elementToBeSearched);
		
		if (indexPosition == -1)
			System.out.println("Element not found!");
		else
			System.out.println("Element found at index position " + indexPosition+"!");
			
		int iterations=searchIteration(elements, 0, elements.length-1, elementToBeSearched,1);
		System.out.println("Number of iterations: "+iterations);
	}

	
}