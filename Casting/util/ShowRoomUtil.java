package com.example.casting.util;

import com.example.casting.MobileShowRoom;
import com.example.casting.ShowRoom;
import com.example.casting.WatchShowRoom;

public class ShowRoomUtil extends ShowRoom{
	public void run(ShowRoom room) {
		
		ShowRoom showRoom=new ShowRoom();
		showRoom.vehicle();
		
		if(room instanceof WatchShowRoom)
		{
			ShowRoom watchRoom=new WatchShowRoom();
			watchRoom.vehicle();
			
			WatchShowRoom watchRoom2=(WatchShowRoom)watchRoom;
			watchRoom2.watch();
			
		}
		if(room instanceof MobileShowRoom) {
			ShowRoom mobileRoom=new MobileShowRoom();
			mobileRoom.vehicle();
			
			MobileShowRoom mobileRoom2=(MobileShowRoom)mobileRoom;
			mobileRoom2.mobile();
		}
	}
	
	

}
