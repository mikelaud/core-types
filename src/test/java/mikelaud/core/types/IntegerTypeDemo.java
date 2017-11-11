package mikelaud.core.types;

public class IntegerTypeDemo {

	public static void main(String[] args) {
		System.out.println(String.format("IntegerType.nvl(null): %d", IntegerType.nvl(null)));
		System.out.println(String.format("IntegerType.nvl(0): %d", IntegerType.nvl(IntegerType.ZERO_OBJECT)));
		System.out.println(String.format("IntegerType.nvl(123): %d", IntegerType.nvl(123)));
	}

}
