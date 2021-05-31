package handleExceptions;

public class InvalidMonthException extends RuntimeException {
	public InvalidMonthException(int index) {
		super(String.format("Not within range [0=Jan .. 11=Dec]: <%s>", index));
	}
}
