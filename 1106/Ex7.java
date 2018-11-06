import java.util.*;
class Ex7{

	public int ex7_1(int a, int b){
				
		return Math.min(a,b);
	}

	public int ex7_1(int a, int b, int c){
		if (Math.min(a,b) > c) {
			return c;
		}	
		return Math.min(a,b);
	}

	public int ex7_1(int [] a){
		Arrays.sort(a);
		int val = a[0];	
		return val;
	}

	public int ex7_2(int x){
		return Math.abs(x);		
	}

	public long ex7_2(long x){
		return Math.abs(x);	
	}

	public float ex7_2(float x){
		return Math.abs(x);	
	}

	public double ex7_2(double x){
		return Math.abs(x);	
	}

	public String ex7_3(byte x){
		int val = (int) x;	
		String ret = String.format("%8s", Integer.toBinaryString(val)).replace(' ', '0');
		if (val < 0) {
			return ret.substring(ret.length()-8,ret.length());
		}
		return ret;
	}

	public String ex7_3(short x){
		int val = x;	
		String ret = String.format("%16s", Integer.toBinaryString(val)).replace(' ', '0');
		if (val < 0) {
			return ret.substring(ret.length()-16,ret.length());
		}
		return ret;
	}

	public String ex7_3(int x){
		String ret = String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0');
		return ret;
	}

	public String ex7_3(long x){
		String ret = String.format("%64s", Long.toBinaryString(x)).replace(' ', '0');
		return ret;
	}
}
