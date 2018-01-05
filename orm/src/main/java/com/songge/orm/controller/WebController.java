package com.songge.orm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.songge.orm.mapper.lhgene.UserMapper_lhgene;
import com.songge.orm.mapper.songge.UserMapper_songge;


@RestController
public class WebController {
	
	@Autowired
	UserMapper_songge userMapper_songge;
	
	@Autowired
	UserMapper_lhgene userMapper_lhgene;
	
	@RequestMapping("/songge")
	public int Hello() {
		return userMapper_songge.getAll().size();
	}

	@RequestMapping("/lhgene")
	public int Hello_lhgene() {
		return userMapper_lhgene.getAll().size();
	}
}
