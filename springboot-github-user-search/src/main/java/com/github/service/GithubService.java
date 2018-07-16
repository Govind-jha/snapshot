package com.github.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.github.model.UserDetails;
import com.github.utils.JsonUtil;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

@Service
public class GithubService {

	private static final String API_GITHUB = "https://api.github.com/users/";

	public String getUser(String name) {

		HttpResponse<String> response;
		String responseBody = "";
		try {
			response = Unirest.get(API_GITHUB + name).asString();
			responseBody = response.getBody();
		} catch (UnirestException e) {
			e.printStackTrace();
		}

		return responseBody;
	}

	public Map<String, String> getFollowers(String name) {
		String followersUrl = JsonUtil.parseJsonToMap(getUser(name)).get("followers_url");
		String responseBody = "";

		try {
			HttpResponse<String> response = Unirest.get(followersUrl).asString();
			responseBody = response.getBody();
		} catch (UnirestException e) {
			e.printStackTrace();
		}

		List<UserDetails> followersList = JsonUtil.parseJsonListToPojo(responseBody);

		Map<String, String> followersListResponse = new HashMap<String, String>();
		followersList.stream().forEach(user -> followersListResponse.put(user.getLogin(), user.getUrl()));

		return followersListResponse;
	}

}
