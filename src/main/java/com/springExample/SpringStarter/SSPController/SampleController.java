package com.springExample.SpringStarter.SSPController;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springExample.SpringStarter.SSPService.SampleService;

@RestController
@RequestMapping("/Sample")
public class SampleController {
	
	@Autowired
	private SampleService sampleService;
	
	@GetMapping("")
	public Object Test() {
		return "Test";
	}
	
	@GetMapping("/Hello")
	public Object returnHello() {
		JSONObject val = (JSONObject) sampleService.helloMethod(); 
		return val;
	}
	
}
