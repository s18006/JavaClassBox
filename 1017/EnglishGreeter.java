public class EnglishGreeter implements Greeter {
	@Override
	public void login(Account guest) {
		System.out.println(String.format(
		"Hello, %s.", guest.getName()));
	}

	@Override
	public void logout(Account guest) {
		System.out.println("Good bye.");
	}
	
	@Override
	public void like(Account guest) {
		System.out.println("Thank you.");
	}
}
