package mikelaud.core.types;

import java.awt.Dimension;

public enum Resolution {

	HD_720(1280, 720),
	HD_PLUS_900(1600, 900),
	FHD_1080(1920, 1080),
	QHD_1440(2560, 1440),
	QHD_PLUS_1800(3200, 1800),
	UHD_4K_2160(3840, 2160);
	
	private final Dimension DIMENSION;
	
	private Resolution(int aWidth, int aHeight) {
		DIMENSION = new Dimension(aWidth, aHeight);
	}
	
	public int getWidth() {
		return DIMENSION.width;
	}
	
	public int getHeight() {
		return DIMENSION.height;
	}

	@Override
	public String toString() {
		return String.format("Resolution(%dx%d)", getWidth(), getHeight());
	}

}
