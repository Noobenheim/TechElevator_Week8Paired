package com.techelevator.ssg.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.ssg.model.forum.ForumDao;
import com.techelevator.ssg.model.forum.ForumPost;

@Controller
@RequestMapping("/forum")
public class ForumController {
	
	@Autowired
	private ForumDao forumDao;

	@RequestMapping(path = {"/", "/viewForum"} , method=RequestMethod.GET)
	public String displayForumPosts(ModelMap modelHolder) {
		modelHolder.put("forum_posts", forumDao.getAllPosts());
		return "forum/displayPosts";
	}
	
	//This is the method to save a post
	@RequestMapping(path = ("/makePost") , method=RequestMethod.POST)
	public String saveForumPost(ForumPost p, ModelMap modelHolder ) {
		p.setDatePosted(LocalDateTime.now());
		forumDao.save(p);
		return displayForumPosts(modelHolder);
	}
	
	//This is the method that leads to saving a post
	@RequestMapping(path = ("/newPost") , method=RequestMethod.GET)
	public String makeForumPost() {
		
		return "forum/makePost";
	}
}
