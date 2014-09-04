package com.cemgokmen.SolidBoats;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleDestroyEvent;

public class SolidBoatsListener implements Listener {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onBoatBreak(VehicleDestroyEvent event) {
		Vehicle boat = event.getVehicle();
		if (boat.getType().equals(EntityType.BOAT)) {
			if (event.getAttacker() == null || boat.getPassenger() != null)
				event.setCancelled(true);
		}
	}
}
