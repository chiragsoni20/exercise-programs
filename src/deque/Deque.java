package deque;

//Java Program to find maximum number of
//Unique integers in Sub-Array
//of given size

import java.util.*;
class Deque {

	public static int maxUniqueNum(int arr[], int N, int M)
	{
		int maxUnique = 0;
		for (int i = 0; i <= N - M; i++) {
			int currentUnique = 0;

			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

			for (int k = i; k < i + M; k++) {

				if (!map.containsKey(arr[k])) {
					map.put(arr[i], 1);
					currentUnique++;
				}
			}
			if (currentUnique > maxUnique)
				maxUnique = currentUnique;
		}

		return maxUnique;
	}
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		
		int[] arr = new int[N];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		

		System.out.println(maxUniqueNum(arr, N, M));
	}
}

