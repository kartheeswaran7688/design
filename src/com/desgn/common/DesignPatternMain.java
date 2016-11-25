package com.desgn.common;
import com.desgn.common.singleton.*;

public class DesignPatternMain {
	
	public static void main(String[] args) {
		callSingleTon();
	}
	
	
	private static void callSingleTon() {
		LazySingleTon  singleton = LazySingleTon.getInstance();
		singleton.setItems(100);
		singleton.getItems();
		
	}

}
