package mikelaud.core.types;

public class StringTypeDemo {

	public static void main(String[] args) {
		System.out.println(String.format("StringType.empty(): '%s'", StringType.empty()));
		System.out.println(String.format("StringType.nvl(null): '%s'", StringType.nvl(null)));
		System.out.println(String.format("StringType.nvl(\"\"): '%s'", StringType.nvl("")));
		System.out.println(String.format("StringType.nvl(\"qwerty\"): '%s'", StringType.nvl("qwerty")));
	}

}
