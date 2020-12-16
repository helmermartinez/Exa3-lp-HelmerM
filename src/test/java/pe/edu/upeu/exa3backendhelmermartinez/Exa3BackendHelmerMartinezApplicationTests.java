package pe.edu.upeu.exa3backendhelmermartinez;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import pe.edu.upeu.exa3backendhelmermartinez.dao.PersonaDao;


@SpringBootTest
class Exa3BackendHelmerMartinezApplicationTests {

	@Autowired
	PasswordEncoder p;
	@Autowired
	PersonaDao per ;
	@Test
	void contextLoads() {
		/*System.out.println(p.encode("123"));*/
		System.out.println(per.read(5).getNombres());
	
	}

}
