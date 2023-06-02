package com.assignment.backend.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.assignment.backend.models.Info;
import com.assignment.backend.repository.InfoRepository;

@Service
public class InfoService {

	private InfoRepository infoRepository;

	public InfoService(InfoRepository infoRepository) {
		this.infoRepository = infoRepository;
	}

	public Info addInfo(Info info) {
		return this.infoRepository.save(info);
	}

	public List<Info> getAllInfo() {
		return this.infoRepository.findAll();
	}
}
