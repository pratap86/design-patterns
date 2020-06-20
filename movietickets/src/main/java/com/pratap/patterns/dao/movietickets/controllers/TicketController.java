package com.pratap.patterns.dao.movietickets.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pratap.patterns.dao.movietickets.dao.TicketDAO;
import com.pratap.patterns.dao.movietickets.model.Ticket;

@Controller
public class TicketController {

	@Autowired
	private TicketDAO dao;
	
	@RequestMapping("/showCreateTicket")
	public String showCreateTicket() {
		return "createTicket";
	}
	
	@RequestMapping("/createTicket")
	public String createTicket(Ticket ticket, ModelMap modelMap) {
		dao.create(ticket);
		modelMap.addAttribute("msg", "Ticket purchased successfully");
		return "createTicket";
	}
}
