import java.util.*;

class Ex6{

	public int [] ex6_1(){
		
		int [] ret = new int[5];
		for (int i = 0; i < 5; i++) {
			ret[i] = 5 - i;
		}				
		return ret;
	}

	public double [] ex6_2(){
		double [] ret = new double[5];
		for (int i = 1; i <= 5; i++) {
			ret[i-1] = (double) (Math.round(1.1 * i * 10) / 10.0);
		}		
		return ret;
	}

	public int [] ex6_3(int a, int b){
		int [] ret = new int[a];
		for (int i = 0; i < a; i++) {
			ret[i] = b;
		}	
		return ret;
	}

	public int [] ex6_4(int [] a){
		int [] ret = new int[4];
		int valSum = 0;
		int valMax = 0;
		for (int i = 0; i < a.length; i++) {
			valSum += a[i];
			if (valMax < a[i]) {
				valMax = a[i];
			}
		}
	
		int valMin = valMax;	
		for (int k = 0; k < a.length; k++) {
			if (a[k] < valMin) {
				valMin = a[k];
		}			
		int valAverage = (int) (Math.round((double) valSum / a.length));			
		ret[0] = valSum; ret[1] = valAverage; ret[2] = valMax; ret[3] = valMin;
		}
		return ret;
	}
	public int ex6_5(int [] a, int key){
		int val = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key && key != -1) {
				val++;
			} if (key == -1) {
				if (a[i] > val) {
				val = a[i];
				}
			}
		}
		if (val == 0 && key != -1) {
			return -1;
		} else if (val == a.length && key != -1) {
			return 0;
		} else {
			return val;
		}
	}

	public int ex6_6(int [] a, int key){
		int ret = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				ret = i;
			}
		}	
		return ret;
	}

	public int[] ex6_7(int [] a, int idx){
		int[] array = new int[a.length];
		int lastNum = a[a.length-1];
		for (int i = 0; i < idx; i++) {
			array[i] = a[i];
		}
		int secLoop = a.length - idx - 1;
		int val = 0;
		for (int k = 1; k <= secLoop; k++) {
			array[k+idx-1] = a[idx+k];
		} 			
		array[a.length-1] = lastNum;

		for (int l = 0; l < array.length; l++) {	
			a[l] = array[l];
		}
			return a;
	}

	public void ex6_8(int [] a, int idx, int n){
		int val = n - idx;
		if (val == 0) {
		}
		if (val < 0) {
			a[0] = a[a.length-1];
		} if (val > 0) {
			for (int i = 0; i < val; i++) {
			a[val+i-1] = a[a.length-val+i];
			}
		}
			return;
				
	}

	public void ex6_9(int [] a, int idx, int x){
		int[] array = new int[a.length];
		
		for (int i = 0; i < idx; i++) {
			array[i] = a[i];
		}
		array[idx] = x;
		int secLoop = a.length - idx - 1;
		int val = 0;
		for (int k = 1; k <= secLoop; k++) {
			array[k+idx] = a[idx+k-1];
		} 			

		for (int l = 0; l < array.length; l++) {	
			a[l] = array[l];
		}		
		return;
	}

	public void ex6_10(int [] a, int [] b){
			
		if (a.length <= b.length) {
			int [] c = new int[a.length];
			for (int i = 0; i < a.length; i++) {
				c[i] = a[i];
				a[i] = b[i];
				b[i] = c[i];
			}
		} if (b.length < a.length) {
			int[] d = new int[b.length];
			for (int k = 0; k < b.length; k++) {
				d[k] = b[k];	
				b[k] = a[k];
				a[k] = d[k];
			}
		}		
			
		return;
	}

	public int [] ex6_11(int [] a){
		
		int [] ret = new int[a.length];
		for (int i= 0; i < a.length; i++) {
			ret[i] = a[i];
		}
		return ret;
	}

	public int [] ex6_12(int [] a, int x){
		int val = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				val++;
			}
		}		
		int [] ret = new int[val];
		int idx = 0;
		for (int k = 0; k < a.length; k++) {
			if (a[k] == x) {
				ret[idx] = k;
				idx++;
			}
		}
		return ret;
	}

	public int [] ex6_13(int [] a, int idx){
		if (idx <= a.length-1 && idx > 0 && a.length > 0) {	
		int val = 0;	
		int [] ret = new int[a.length-1];
		for (int i = 0; i < a.length; i++) {
			if (i == idx) {
				continue;
			} 
			if (i != idx) {
				ret[val] = a[i];
				val++;
			}
		}
		return ret;	}
		else {
			return a;	
		}
	}
	
	public int [] ex6_14(int [] a, int idx, int n){

		if ((idx >= 0 && idx <= a.length - 1) &&  (n < a.length - 1 && n >=0)) {
		int val = a.length - (idx + n) + 1;		
		int [] ret = new int[val];
			
		int idx_val = 0;	
		for (int i = 0; i < a.length; i++) {
			if (i < idx || i > n) {
				ret[idx_val] = a[i];
				idx_val++;
			}
		}	
		return ret; }
		if (idx > a.length - 1 || n < 0) {
			return a;
		}
		int [] ret = new int[0];
		return ret;
		
	}
	
	public int [] ex6_15(int [] a, int idx, int x){
		if (a.length == 0) {
			int [] ret = new int[1];
			ret[0] = x;
			return ret;
		} 
		if (a.length > 0 && (idx < 0 || idx > a.length -1)) {
			if (idx < 0 && a.length > 0) {
				int [] ret = new int[a.length + 1];
				int val = 0;
				for (int i = 0; i < a.length +1; i++) {
					if (i == 0) {
						ret[i] = x;
						continue;
					}
					ret[i] = a[val];
					val++;
			}	
				return ret;
			} 
			int [] ret = new int[a.length+1];
				int val = 0;
				for (int k = 0; k < a.length + 1; k++) {
					if (k == a.length) {
						ret[k] = x;
						continue;
					} 
					ret[k] = a[val];
					val++; 
				}
					return ret;
		} 

		int [] ret = new int[a.length + 1];
		int val = 0;
		for (int i = 0; i < a.length +1; i++) {
		if (i == idx) {
			ret[i] = x;
			continue;
				}
		ret[i] = a[val];
		val++;
		}
			
		return ret;

	
}

}
