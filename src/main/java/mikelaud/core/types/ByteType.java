package mikelaud.core.types;

public interface ByteType {

	byte ZERO = 0;
	Byte ZERO_OBJECT = Byte.valueOf(ZERO);

	static Byte nvl(Byte aValue) {
		return (null == aValue ? 0 : aValue);
	}
	
}
