import java.util.*;
import java.io.File;
import java.util.Scanner;
public class Driver
{

	public static void main(String[] args) throws Exception

	{
		Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/caveJSON"));
		String theJSON = "";
		while(input.hasNextLine())
		{
			theJSON = theJSON + input.nextLine();
		}
		CaveParser cp = new CaveParser(theJSON);
		cp.parse();
	}


	static void mergeSort(int[] ar)
	{
	Driver.mergeSortHelper(ar, 0, ar.length-1);
	}
	
	static void mergeSortHelper(int[] ar, int begin, int end)
	{
		// Driver.display(ar, begin, end);

		if(begin != end)
		{
			int leftBegin = begin;
			int leftEnd = ((end-begin)/2 + begin);
			int rightBegin = ((end-begin)/2 + begin) + 1;
			int rightEnd = end;
			Driver.mergeSortHelper(ar, leftBegin, leftEnd);
			Driver.mergeSortHelper(ar, rightBegin, rightEnd);
			
			int[] temp = new int[rightEnd - leftBegin + 1];
			
			int leftPos = leftBegin;
			int rightPos = rightBegin;
			
			for(int i = 0; i < temp.length; i++) //copying ordered elements into temp
			{
				if(leftPos == leftEnd + 1) // if we run out of elements to merge from left array
				{
					temp[i] = ar[rightPos];
					rightPos++;
				}
				else if(rightPos == rightEnd + 1) // if we run out of elements to merge from right array
				{
					temp[i] = ar[leftPos];
					leftPos++;
				}
				else if(ar[leftPos] < ar[rightPos])
				{
					temp[i] = ar[leftPos];
					leftPos++;
				}
				else
				{
					temp[i] = ar[rightPos];
					rightPos++;
				}
			}
			
			for(int i = 0; i < temp.length; i++) // copying temp into ar
			{
				ar[leftBegin] = temp[i];
				leftBegin++;
			}
			
			
			
			//when we return here, we have two partially sorted lists
			//now we need to merge them together into a single list
			//where all the values are sorted.  Create a new array of
			//the correct length, then perform the merge algorithm to fill
			//that array with the correct data.  Then copy the contents
			//of that array back over the original array from begin to end
		}
	}

	static void display(int[] ar, int begin, int end)
	{
		for(int i = begin; i <= end; i++)
		{
			System.out.print(ar[i] + " ");
		}
		System.out.println("");
	}
	
	static int[] generateRandomArray(int numberElements)
	{
		Random rand = new Random();
		int[] array = new int[numberElements];
		for(int i = 0; i < array.length; i++)
		{
			array[i] = rand.nextInt(101);
		}
		return array;
	}
	
	static int[] bubbleSort(int[] array)
	{
		int temp = 0;
		for(int i = 1; i < array.length; i++)
		{
			for(int j = 1; j < array.length; j++)
			{
				if(array[j] < array[j-1])
				{
					temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
		return array;
	}

	static void displayArray(int[] array)
	{
		String displayString = "[" + array[0];
		for(int i = 1; i < array.length; i++)
		{
			displayString = displayString + ", " + array[i];
		}
		displayString = displayString + "]";
		System.out.println(displayString);
	}
	
	static int charToInt(char c)
	{
		String digitString = "0123456789";
		return digitString.indexOf(c);
	}
	
	static int stringToInt(String s)
	{
		int newInt = 0;
		int multiplier = 1;
		for(int i = s.length() - 1; i >= 0; i--)
		{
			newInt = newInt + (Driver.charToInt(s.charAt(i)) * multiplier);
			multiplier *= 10;
		}
		return newInt;
	}
	
	
}

