package com.github.resource;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.service.GithubService;

@RestController
public class GithubRestController {

	@Autowired
	private GithubService gitService;

//	@RequestMapping(value = "/addComment", method = RequestMethod.POST)
//	public ResponseEntity<String> addComment(@RequestBody AddCommentRequest person) {
//		return ResponseEntity.status(HttpStatus.CREATED).build();
//	}

	@RequestMapping(value = "/getUser/{name}")
	public String getUser(@PathVariable("name") String name) {
		return gitService.getUser(name);
	}
	
	@RequestMapping(value = "/getFollowers/{name}")
	public Map<String, String> getFollowers(@PathVariable("name") String name) {
		return gitService.getFollowers(name);
	}

}