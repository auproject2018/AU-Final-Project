package com.boardroomproject.services;

import java.util.Date;
import java.util.List;

import com.boardroomproject.model.RequestRoom;
import com.boardroomproject.model.User;

public class RequestRoomService implements IRequestRoomService{

	public void createRequest(RequestRoom requestRoom) {
		// TODO Auto-generated method stub
		
	}

	public void acceptRequest(int requestId) {
		// TODO Auto-generated method stub
		
	}

	public void rejectRequest(String remarkByAdmin, int requestId) {
		// TODO Auto-generated method stub
		
	}

	public List<RequestRoom> getRequestByDateNLocation(int lId, Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<RequestRoom> getRequestByUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<RequestRoom> getRequestByStatusNLocation(int lId, String status) {
		// TODO Auto-generated method stub
		return null;
	}

}
