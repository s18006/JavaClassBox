public class EnglishGreeter implements Greeter {
	@Override
	public String login(Account guest) {
		return String.format(
		"Hello, %s.", guest.getName());
	}

	@Override
	public String logout(Account guest) {
		return "Good bye.";
	}
	
	@Override
	public String like(Account guest) {
		return "Thank you.";
	}
}
