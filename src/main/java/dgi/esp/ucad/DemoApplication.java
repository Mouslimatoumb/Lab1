package ucad.esp.dgi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotanion.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;



@SpringBootApplication
public class DemoApplication {

	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		logger.info("Demo app Started ! Goto http://localhost:8081/dic_student_name");
	}

}

@RestController
@RequestMapping("/dic_student_name")
class DemoApplication{
	@value("${fullname:Mously}")
	private String fullname;


	@GetMapping
	String getFullname(){
	 return "Work done by "+ this.fullname +" ! ";
	}
}
