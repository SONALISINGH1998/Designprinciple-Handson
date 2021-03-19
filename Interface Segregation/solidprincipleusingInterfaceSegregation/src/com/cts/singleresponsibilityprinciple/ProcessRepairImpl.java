package com.cts.singleresponsibilityprinciple;

public class ProcessRepairImpl implements ProcessPhoneRepair,ProcessAccessoryRepair{
	
	@Override
	public void processPhoneRepair(String modelName) {
		System.out.println(String.format("%s order accepted!",modelName));
		
	}
	@Override
	public void processAccessoryRepair(String accessoryType) {
		System.out.println(String.format("%s repair accepted!",accessoryType));
	}
}
