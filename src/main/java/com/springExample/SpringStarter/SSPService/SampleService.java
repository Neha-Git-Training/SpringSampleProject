package com.springExample.SpringStarter.SSPService;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

	public Object helloMethod() {
		JSONObject obj = new JSONObject();
		obj.put("Greet", "Hello User");
		return obj;
	}
}
