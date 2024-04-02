package com.zumba.service;

import java.util.List;

import com.zumba.bean.Participants;
import com.zumba.dao.ParticipantsDao;

public class ParticipantsService {
	ParticipantsDao pd = new ParticipantsDao() ;
	public String storeParticipants(Participants participants) {
		if(pd.storeParticipantsDetails(participants)>0) {
			return "Participants details stored Successfully";
		}else {
			return "Participants details not stored ";

		}
		
	}
	public String deleteParticipant(int pid) {
		if(pd.deleteParticipant(pid)>0) {
			return "Participants details Successfully Deleted";
		}else {
			return "Participant  Not Present";

		}	
	}
	public String updateParticipant(Participants p) {
		if(pd. updateParticipant(p)>0) {
			return "Participants phone number Successfully Updated";
		}else {
			return "Participants phone number Not Updated or Pid not Present";

		}	
	}
	
}
