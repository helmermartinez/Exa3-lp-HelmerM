package pe.edu.upeu.exa3backendhelmermartinez.service;

import java.util.Map;

import pe.edu.upeu.exa3backendhelmermartinez.entity.Rol;

public interface RolService {
	
	int create(Rol r);
	int update(Rol r);
	int update(int id);
	int delete(int id);
    Map<String, Object> read(int id);
	Map<String, Object> readAll();
}
