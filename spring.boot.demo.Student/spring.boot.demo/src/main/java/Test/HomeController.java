package Test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {

	//http://localhost:1111/
@RequestMapping("/pqr")
public String sayhello() {
	return "<h2> Welcome to spring Boot </h2>";
}
	
}
