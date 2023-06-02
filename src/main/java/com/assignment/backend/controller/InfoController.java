package com.assignment.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.backend.services.InfoService;
import com.assignment.backend.models.Info;

@RestController
@RequestMapping("/info")
public class InfoController {

	@Autowired
	private InfoService infoService;

	public InfoController(InfoService infoService) {
		this.infoService = infoService;
	}

	@PostMapping("")
	public Info addUser(@RequestBody Info info) {

		return this.infoService.addInfo(info);
	}

	@GetMapping("")
	public List<Info> getAllInfo(){

		return infoService.getAllInfo();
	}
}
