package com.wd.projeto01.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/hello")
public class HelloWord {
	@GetMapping
	public List<String> helloword(){
		List<String> list = new ArrayList();

		String name = "Eu";
		
		list.addAll(Arrays.asList("Rui", "Roberio", "Alex", "Eu", "Benedilson", "Jocilé"));
		
		list.sort(null);
		
		list.removeIf(a->a.equals(name));
		
		return list;

	}
}
