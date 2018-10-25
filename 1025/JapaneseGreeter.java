public class JapaneseGreeter implements Greeter {
	@Override
	public String login(Account guest) {
		return String.format(
		"こんにちは、%sさん。", guest.getName());
	}

	@Override
	public String logout(Account guest) {
		return "さようなら。";
	}

	@Override 
	public String like(Account guest) {
		return "ありがとうございます。";
	}
}
