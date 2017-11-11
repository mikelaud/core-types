package mikelaud.core.types;

public interface ShortType {

	short ZERO = 0;
	Short ZERO_OBJECT = Short.valueOf(ZERO);
	
	static Short nvl(Short aValue) {
		return (null == aValue ? 0 : aValue);
	}
	
}
