package com.github.utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.model.UserDetails;

public class JsonUtil {

	public static final List<UserDetails> parseJsonListToPojo(String responseBody) {
		ObjectMapper mapper = new ObjectMapper();
		TypeReference<List<UserDetails>> mapType = new TypeReference<List<UserDetails>>() {
		};
		List<UserDetails> followersList = null;
		try {
			followersList = mapper.readValue(responseBody, mapType);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return followersList;
	}

	public static final Map<String, String> parseJsonToMap(String responseBody) {
		ObjectMapper mapper = new ObjectMapper();
		Map<String, String> responseMap = new HashMap<>();
		try {
			responseMap = mapper.readValue(responseBody, //
					new TypeReference<Map<String, String>>() {
					});
		} catch (IOException e) {
			e.printStackTrace();
		}
		return responseMap;
	}

}
