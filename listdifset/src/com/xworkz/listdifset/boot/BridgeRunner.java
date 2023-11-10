package com.xworkz.listdifset.boot;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.xworkz.listdifset.dto.BridgeDTO;

public class BridgeRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in bridge runner...");
		BridgeDTO bridge1 = new BridgeDTO("Arch", 5000, false, "Steel");
		BridgeDTO bridge2 = new BridgeDTO("Suspension", 8000, true, "Iron");
		BridgeDTO bridge3 = new BridgeDTO("Cantilever", 6000, false, "Concrete");
		BridgeDTO bridge4 = new BridgeDTO("Arch", 5000, false, "Steel");
		BridgeDTO bridge5 = new BridgeDTO("Beam", 7000, false, "Wood");
		BridgeDTO bridge6 = new BridgeDTO("Cable-stayed", 9000, true, "Steel");
		BridgeDTO bridge7 = new BridgeDTO("Tied-arch", 7500, false, "Aluminum");
		BridgeDTO bridge8 = new BridgeDTO("Arch", 5000, false, "Steel");
		BridgeDTO bridge9 = new BridgeDTO("Suspension", 8000, true, "Iron");

		Collection<BridgeDTO> bridge = new HashSet<BridgeDTO>();
		bridge.add(bridge1);
		bridge.add(bridge2);
		bridge.add(bridge3);
		bridge.add(bridge4);
		bridge.add(bridge5);
		bridge.add(bridge6);
		bridge.add(bridge7);
		bridge.add(bridge8);
		bridge.add(bridge9);

		System.out.println("Total items: " + bridge.size());
		System.out.println(bridge.stream().map(t -> t.getMaterial()).collect(Collectors.toSet()).size());
	


	}

}
	


