package mikelaud.core.types;

public interface IntegerType {

	int ZERO = 0;
	Integer ZERO_OBJECT = Integer.valueOf(ZERO);
	
	static Integer nvl(Integer aValue) {
		return (null == aValue ? 0 : aValue);
	}
	
}
