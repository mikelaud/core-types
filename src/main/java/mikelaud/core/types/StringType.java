package mikelaud.core.types;

public interface StringType {

	static String empty() {
		return "";
	}
	
	static String nvl(String aValue) {
		return (null == aValue ? empty() : aValue);
	}
	
}
