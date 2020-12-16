package pe.edu.upeu.exa3backendhelmermartinez.service;

import java.util.Map;

import pe.edu.upeu.exa3backendhelmermartinez.entity.Usuario;

public interface UsuarioService {
	
	int create(Usuario u);
	int update(Usuario u);
	int delete(int id);
	Usuario read(int id);
	Usuario validarUsuario(String nomuser);
	Map<String, Object> datosUsuario(String username);

}
