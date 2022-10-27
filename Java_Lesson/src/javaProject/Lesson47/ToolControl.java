package javaProject.Lesson47;

import java.util.*;
import java.util.Map.Entry;

public class ToolControl {

	public ToolControl() {
		drillInfoMap.put(1, new DrillInfo(.251, 4000, 1.6));
		drillInfoMap.put(2, new DrillInfo(.248, 4200, 1.7));
		drillInfoMap.put(76, new DrillInfo(.006, 70000, 4.55));
	}

	public boolean setToolLocation(String position, int drillSize) {
		if (toolLocationMap.containsKey(position)) {
			return false;
		} else {
			toolLocationMap.put(position, drillInfoMap.get(drillSize));
			return true;
		}
	}

	public void deleteToolLocation(String position) {
		toolLocationMap.remove(position);
	}
	
	public int getToolRpm(String position) {
		if (toolLocationMap.containsKey(position)) {
			return toolLocationMap.get(position).rpm;
		} else {
			return -1;
		}
	}

	public String getPosition(int toolSize) {
		if (toolLocationMap.containsValue(drillInfoMap.get(toolSize))) {
			return getKeyByValue(toolLocationMap, drillInfoMap.get(toolSize));
		} else {
			return "X";
		}
	}

	public double getFeedRate(int drillSize) {
		if (drillInfoMap.containsKey(drillSize))
			return drillInfoMap.get(drillSize).feedRate;
		else
			return -1;
	}

	// IMPORTED CODE ===========================================
	private static <T, E> T getKeyByValue(Map<T, E> map, E value) {
		for (Entry<T, E> entry : map.entrySet()) {
			if (Objects.equals(value, entry.getValue())) {
				return entry.getKey();
			}
		}
		return null;
	}
	// IMPORTED CODE ===========================================

	public Map<Integer, DrillInfo> drillInfoMap = new TreeMap<>();
	public Map<String, DrillInfo> toolLocationMap = new TreeMap<>();

}
