package com.springassignment.project;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class DemoMap {

	private Map<String,Integer> valueMap;
	
	public DemoMap(Map<String, Integer> valueMap) {
		super();
		this.valueMap = valueMap;
	}

	public Map<String, Integer> getValueMap() {
		return valueMap;
	}

	public void setValueMap(Map<String, Integer> valueMap) {
		this.valueMap = valueMap;
	}
	
	public void showMap() {
		for(Map.Entry<String, Integer> entry : valueMap.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}

	@Override
	public String toString() {
		return "DemoMap [valueMap=" + valueMap + "]";
	}
	
	
}
