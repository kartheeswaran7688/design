package com.desgn.common.singleton;

public class LazySingleTon {
	private final String TAG = LazySingleTon.class.getSimpleName();
	private static LazySingleTon mSingleInstance;	
	private int value;
	private LazySingleTon() {
	}
	
	/**
	 * This logic will work only for single thread access 
	 * If u are trying to access multiple threads, its throws error
	 * @return
	 */
	public static LazySingleTon getInstance() {
		if(mSingleInstance == null) {
			mSingleInstance = new LazySingleTon();
		}
		
		return mSingleInstance;
	}
	
	public int getItems() {
		System.out.println(TAG+" getItems  "+value);
		return value;
	}
	
	public void setItems(int val) {
		System.out.println(TAG+" getItems  "+val);
		value = val;
	}
}
