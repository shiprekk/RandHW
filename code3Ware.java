
/*CS4345
 Summer 2022
 Coding 3
 Rekalyn Ware
 */

import java.util.Scanner;

public class code3Ware {
	
	public static int getSLength() {
		System.out.println("Enter the request sequence length (between 5 and 20):");
		Scanner sn = new Scanner(System.in);
		int m = sn.nextInt();
		
		if (m <= 5 || m >= 20) {
			System.out.println("\nEnter value between 5 and 20:");
			m = getSLength();
		}
	
		
		return m;
	}
	
	
	public static int[] getSeq(int m) {
		System.out.println("\nEnter a sequence of " + m + " numbers:");
		
		Scanner sn = new Scanner(System.in);
		
		String sline = sn.nextLine();
		String [] s = sline.split(" ");
		
		int[] ss = new int[s.length];
		for (int i =0; i < ss.length; i++) {
			ss[i]= Integer.parseInt(s[i]);
		}
		
		if (ss.length != m) {
			System.out.println("\nSequence length must equal "+ m);
			ss = getSeq(m);
		}
		
		for (int i =0; i < ss.length; i++) {
			if (ss[i] < 0 || ss[i] > 39) {
				System.out.println("\nNumber is out of range");
				ss = getSeq(m);
			}
		}
		
		return ss;
	}
	
	public static void FIFO(int arr[], int trackStart) {
	
	    int seek_count = 0;
	    int distance, cur_track;
	 
	    for (int i = 0; i < arr.length; i++)
	    {
	        cur_track = arr[i];
	
	        distance = Math.abs(cur_track - trackStart);

	        seek_count += distance;
	 
	        trackStart = cur_track;
	    }
	 
	    System.out.println("\nFIFO \nTravek distance is " + seek_count + " tracks");
	    System.out.println("Order of serviced requests");
	    
	    for (int i = 0; i < arr.length; i++)
	    {
	        System.out.println(arr[i]);
	    }
	    
	    System.out.println("\nLongest delay: " + seek_count + " for track "+ arr[arr.length-1]);
	}
	
	public static void SSTF( int arr[], int trackStart, int length) {
		
		if (length<= 0)
		{
			return;
		}
		
		int seek_count = 0;
		int seek_time = 0;
		int minimum = 0;
		
		int delay = 0;
		int speedup =0;
		
		int[] skeek = new int[length + 1];
		
		int[][] auxiliary = new int[length][2];
		for (int i = 0; i < length; ++i)
		{
	
			auxiliary[i][0] = 0;
		
			auxiliary[i][1] = 0;
		}
	
		int i = 0;
		int j = 0;
		int location = 0;
		for (i = 0; i < length; i++)
		{
			skeek[i] = trackStart;
			
			for (j = 0; j < length; ++j)
			{
				auxiliary[j][0] = arr[j] - trackStart;
				if (auxiliary[j][0] < 0)
				{
					auxiliary[j][0] = -auxiliary[j][0];
				}
			}
			minimum = Integer.MAX_VALUE;
			location = -1;
		
			for (j = 0; j < length; ++j)
			{
				if (auxiliary[j][1] == 0 && auxiliary[j][0] <= minimum)
				{
					
					location = j;
					minimum = auxiliary[j][0];
				}
			}
		
			auxiliary[location][1] = 1;
		
			trackStart = arr[location];
			
			seek_time += auxiliary[location][0];
		}
		if (trackStart != 0)
		{
		
			skeek[length] = trackStart;
		}
		
		System.out.println("\nSSTF \nTravek distance is " + seek_time + " tracks");
		
		System.out.print("Order of serviced requests ");
		
		for (i = 0; i <= length; i++)
		{
			System.out.println(skeek[i]);
		}
	
	}

	 
	
	
	
	
	public static void main(String[] args) {
		
	
		int m = getSLength();
		
		int[] sequence = getSeq(m);
		
		FIFO(sequence, 0);
	
		SSTF(sequence, 0, m);
		
	}
}
