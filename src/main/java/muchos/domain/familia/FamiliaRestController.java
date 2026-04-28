package muchos.domain.familia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/familias")
public class FamiliaRestController {
	@Autowired
	private FamiliaRepository frepo;
	
	@GetMapping("/")
	public List<Familia> todas(){
		return frepo.findAll();
	}

}
