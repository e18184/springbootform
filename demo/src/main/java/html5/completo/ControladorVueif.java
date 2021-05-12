package html5.completo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class ControladorVueif {
	// http://127.0.0.1:8080/vueif
	@RequestMapping("/vueif")
	public String principal(Model model) {
		return "vueif";
	}

}
