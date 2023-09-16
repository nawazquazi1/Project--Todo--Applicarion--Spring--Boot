package com.spring.todoapplication.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author nawaz
 */
@Controller
public class SayHelloController {
	
	//"say-hello" => "Hello! What are you learning today?"
	
	//say-hello
	// http://localhost:8080/say-hello
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! What are you learning today?";
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {

		return "<html>" +
				"<head>" +
				"<title> My First HTML Page - Changed</title>" +
				"</head>" +
				"<body>" +
				"My first html page with body - Changed" +
				"</body>" +
				"</html>";
	}
	
	//
	// "say-hello-jsp" => sayHello.jsp 
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/welcome.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/login.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/todos.jsp
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
}
