package html5.completo;



import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class OrigenControllerForm {
	// http://127.0.0.1:8080/origenform
	@GetMapping("/origenform")
	public String principal(Model model) {
		return "origenform";
	}
	
	@PostMapping("/origenform")
	  public String origenSubmit(@RequestParam("nombre") String nombre,
			  @RequestParam("apellidos") String apellidos, 
			  @RequestParam("sexo") String sexo,
			  @RequestParam("correo") String correo
			  ) {
		
          System.out.println(nombre);
          System.out.println(apellidos);
          System.out.println(sexo);
          System.out.println("correo:"+correo);
 	    return "origenform";
	  }
}