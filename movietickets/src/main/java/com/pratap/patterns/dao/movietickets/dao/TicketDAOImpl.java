package com.pratap.patterns.dao.movietickets.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pratap.patterns.dao.movietickets.entities.Ticket;
@Repository
public class TicketDAOImpl implements TicketDAO {

	private static final String sql = "insert into ticket(movie, screen, seat) values(?, ?, ?)";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void create(Ticket ticket) {

		jdbcTemplate.update(sql, ticket.getMovie(), ticket.getScreen(), ticket.getSeat());
		// need to handle dao exception
	}

}
