package mikelaud.core.types;

public class ByteTypeDemo {

	public static void main(String[] args) {
		System.out.println(String.format("ByteType.nvl(null): %d", ByteType.nvl(null)));
		System.out.println(String.format("ByteType.nvl(0): %d", ByteType.nvl(ByteType.ZERO_OBJECT)));
		System.out.println(String.format("ByteType.nvl(123): %d", ByteType.nvl((byte)123)));
	}

}
