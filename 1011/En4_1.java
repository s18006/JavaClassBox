public class En4_1 {
	public static void main(String args[]) {
		Item carA = new Item("xxx0088", "Astra", "Opel", 12000000);
		Item carB = new Item("tnn-0088", "RX-8", "Mazda", 22000000);
		
		Item sportshoesA = new Item("spsho-0012", "Air Jordan", "Nike", 12000);
		Item sportshoesB = new Item("spsho-0012", "Air Jordan", "Nike", 12000);
		

		//Item car and sportshoes 比較	
		checkEquals(carA, carB);
		checkEquals(sportshoesA, sportshoesB);
		
}
	public static void checkEquals(Item item1, Item item2) {

	if (item1.equals(item2)) {
		System.out.println(item1.getName() + "と" + item2.getName() + "とは等しいです。");
}	else {
		System.out.println(item1.getName() + "と" + item2.getName() + "とは等しくありません。");
	}
}
}
	
