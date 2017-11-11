package mikelaud.core.types;

public interface LongType {

	long ZERO = 0;
	Long ZERO_OBJECT = Long.valueOf(ZERO);
	
	static Long nvl(Long aValue) {
		return (null == aValue ? 0 : aValue);
	}
	
}
