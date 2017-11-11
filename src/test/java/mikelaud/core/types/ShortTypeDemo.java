package mikelaud.core.types;

public class ShortTypeDemo {

	public static void main(String[] args) {
		System.out.println(String.format("ShortType.nvl(null): %d", ShortType.nvl(null)));
		System.out.println(String.format("ShortType.nvl(0): %d", ShortType.nvl(ShortType.ZERO_OBJECT)));
		System.out.println(String.format("ShortType.nvl(123): %d", ShortType.nvl((short)123)));
	}

}
