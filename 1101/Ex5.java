class Ex5{

	public double ex5_1(int [] a){
		int b = 0;
		for (int i = 0; i < a.length; i++) {		
			b += a[i];
		}	
		double ret = (double) b / a.length;
		return ret;
	}

}
