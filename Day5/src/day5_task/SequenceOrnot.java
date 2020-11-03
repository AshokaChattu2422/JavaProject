package day5_task;

public class SequenceOrnot {
		 static int arraySortedOrNot(int arr[], int n)
		    {
		        if (n == 1 || n == 0)
		            return 1;
		        if (arr[n - 1] < arr[n - 2])
		            return 0;
		        return arraySortedOrNot(arr, n - 1);
		    }
		    public static void main(String[] args)
		    {
		        int arr[] = { 2,1,4,1,2,3,6};
		        int n = arr.length;
		        if (arraySortedOrNot(arr, n) != 0)
		            System.out.println("True");
		        else
		            System.out.println("False");
		    }
		


	}


