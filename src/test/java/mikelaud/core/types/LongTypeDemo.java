package mikelaud.core.types;

public class LongTypeDemo {

	public static void main(String[] args) {
		System.out.println(String.format("LongType.nvl(null): %d", LongType.nvl(null)));
		System.out.println(String.format("LongType.nvl(0): %d", LongType.nvl(LongType.ZERO_OBJECT)));
		System.out.println(String.format("LongType.nvl(123): %d", LongType.nvl(123L)));
	}

}
