package com.hashing.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;

public class DestinationCity_1436 {
	@Test
	public void test1() {
		List<List<String>> paths = Arrays.asList(Arrays.asList("London","New York"),Arrays.asList("New York","Lima"),Arrays.asList("Lima","Sao Paulo"));
		Assert.assertEquals(destCity(paths), "Sao Paulo");
	}
	
	@Test
	public void test2() {
		List<List<String>> paths = Arrays.asList(Arrays.asList("B","C"),Arrays.asList("D","B"),Arrays.asList("C","A"));
		Assert.assertEquals(destCity(paths), "A");
	}
	
	@Test
	public void test3() {
		List<List<String>> paths = Arrays.asList(Arrays.asList("A","Z"));
		Assert.assertEquals(destCity(paths), "Z");
	}
	
//	public String destCity(List<List<String>> paths) {
//        HashMap<String,Integer> smap = new HashMap<>();
//        HashMap<String,Integer> dmap = new HashMap<>();
//		for (int i = 0; i < paths.size(); i++) {
//			smap.put(paths.get(i).get(0), smap.getOrDefault(paths.get(i).get(0), 0)+1);
//		}
//		
//		for (int i = 0; i < paths.size(); i++) {
//			dmap.put(paths.get(i).get(1), dmap.getOrDefault(paths.get(i).get(1), 0)+1);
//		}
//		String key ="";
//		for (Map.Entry<String, Integer> out : dmap.entrySet()) {
//			if(!smap.containsKey(out.getKey())) {
//				key += out.getKey();
//			}
//		}
//		return key;
//    }
	
	public String destCity(List<List<String>> paths) {
		String destination ="";
		List<String> list = new ArrayList<>();
		for (int i = 0; i < paths.size(); i++) {
			list.add(paths.get(i).get(0));
		}
		
		for (int i = 0; i < paths.size(); i++) {
			if(!list.contains(paths.get(i).get(1))) {
				destination += paths.get(i).get(1);
			}
		}
		
		
		return destination;
    }
}
