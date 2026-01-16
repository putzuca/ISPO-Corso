package tracce;

public class FilterSplit {
	public static int[] filter(int unArray[]) {
		int dispari[] = new int[lungDisp(unArray)];
		int i = 0;
		int j = 0;
		while(i < unArray.length) {
			if (unArray[i]%2 != 0) {
				dispari[j] = unArray[i];
				j++;
			}
			i++;
		}
		return dispari;
	}
	
	private static int lungDisp(int[] unArray) {
	    int count = 0;
	    for (int a : unArray) {
	        if (a % 2 != 0) {
	            count++;
	        }
	    }
	    return count;
	}

	private static void visualizza(int unArray[]) {
		System.out.print("{ ");
		for(int a : unArray) {
			System.out.print(a + " ");
		}
		System.out.println("}");
	}
	
	public static int[] split(int[] unArray) {
		int[] a = new int[unArray.length];
		int j = 0;
		for(int i = 0; i < unArray.length; i++)
			if (unArray[i]%2 == 0) {
				a[j] = unArray[i];
				j++;
			}
		j = unArray.length - 1;
		for(int i = unArray.length - 1; i >= 0 ; i--)
			if (unArray[i]%2 != 0) {
				a[j] = unArray[i];
				j--;
			}
		return a;
	}
	
	public static void main(String args[]) {
		int[] a = {2, 3, 5, 8, 9, 25, 33, 98, 121, 178};
		visualizza(a);
		visualizza(filter(a));
		visualizza(split(a));
	}
}
