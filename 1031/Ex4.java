import java.util.*;
import java.math.*;


class Ex4{

	public int [] ex4_1(int [] a){
		Arrays.sort(a);
		return a;

	}

	public int [] ex4_2(int [] a){
		List<Integer> nums = new ArrayList<Integer>();
		for (int i : a) {
			nums.add(i);
		}
		Collections.sort(nums, Comparator.reverseOrder());
		
		int[] array = new int[nums.size()];
      		for(int i=0;i<array.length;i++) {
         		array[i] = nums.get(i);
      		}	
		return array;
	}

	public String [] ex4_3(int [] a){
		String[] hantei = new String[a.length];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				hantei[i] = "正";
			} else if (a[i] == 0) {
				hantei[i] = "零";
			} else {
				hantei[i] = "負";
			}
		}		
		return hantei;
	}

	public int ex4_4(int a){
		String str = String.valueOf(a);
		int b = str.length();		
		return b;

	}

	public int ex4_5(int a){
		int b = 0;
		for (int i = 0; i <= a; i++) {
			b += i;
		}	
		return b;

	}

	public int [] ex4_6(int a){
		int val = 0;
		
		for (int k = 1; k <= a; k++) {
    			if (a % k != 0) {
        			continue;
    			} else {
				val++;
			}
		}
		int [] ret = new int[val];
		int val2 = 0;
		for (int i = 1; i <= a; i++) {
			if ((a % i) != 0) {
				continue;
			} else {
				ret[val2] = i;
				val2++;
			}
		}
		return ret;

	}

	public boolean ex4_7(int a){
		int val = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				val++;
		}
		} if (val == 2 ) {
			return true; } else {	
		return false; }

	}

	public int ex4_8(int [] a){
				
		int ret = 0;
		for (int i = 0; i < a.length; i++) {
			ret += a[i];
		}	
		return ret;

	}

	public int ex4_9(int [] a){
		
		int ret = 0;
		for (int i = 0; i < a.length; i++) {
			ret += a[i];
		}
		ret = (int) Math.round((double) ret / a.length);
		return ret;
	 }
}

