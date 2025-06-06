package common;

public enum Port {
	PORT_ONE(9010), PORT_TWO(9011);

	private final int value;

	Port(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
