package com.pratap.patterns.dao.movietickets.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratap.patterns.dao.movietickets.dao.TicketDAO;
import com.pratap.patterns.dao.movietickets.bo.Ticket;
@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketDAO dao;
	
	@Override
	public void purchaseTicket(Ticket ticket) {
		// process payment
		// create the obj of Ticket entity
		com.pratap.patterns.dao.movietickets.entities.Ticket ticketEntity = new com.pratap.patterns.dao.movietickets.entities.Ticket();
		ticketEntity.setMovie(ticket.getMovieName());
		ticketEntity.setScreen(ticket.getScreenNo());
		ticketEntity.setSeat(ticket.getSeatNo());
		dao.create(ticketEntity);
		// send back the booked ticket information by email & phone
	}

}
