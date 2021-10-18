package com.devsuperior.bds02.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.devsuperior.bds02.dto.EventDTO;
import com.devsuperior.bds02.services.EventService;

@Controller
@RequestMapping(value = "/events")
public class EventController {

	@Autowired
	private EventService service;
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<EventDTO> uptade(@PathVariable Long id, @RequestBody EventDTO dto) {
		dto = service.update(id, dto);
		return ResponseEntity.ok().body(dto);
	}
}
