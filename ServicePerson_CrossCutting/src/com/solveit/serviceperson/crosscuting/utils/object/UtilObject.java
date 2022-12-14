package com.solveit.serviceperson.crosscuting.utils.object;
public class UtilObject {
private static UtilObject INSTANCE = new UtilObject();
	
	private UtilObject() {
		
	}
	
	public static UtilObject getUtilObject() {
		return INSTANCE;
	}
	public <T> boolean isNull(T object) {
		return object== null;
	}
	public <T> T getDefault(T object, T defaultValue) {
		return isNull(object) ? defaultValue : object ;
	}
}
