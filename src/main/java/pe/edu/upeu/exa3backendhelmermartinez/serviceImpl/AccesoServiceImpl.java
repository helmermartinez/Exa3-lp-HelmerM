package pe.edu.upeu.exa3backendhelmermartinez.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.exa3backendhelmermartinez.dao.AccesosDao;
import pe.edu.upeu.exa3backendhelmermartinez.entity.Acceso;
import pe.edu.upeu.exa3backendhelmermartinez.service.AccesoService;

@Service
public class AccesoServiceImpl implements AccesoService {

	@Autowired
	private AccesosDao accesosDao;
		@Override
		public int create(Acceso a) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int update(Acceso a) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int update(int id) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int delete(int id) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public List<Map<String, Object>> read(int iduser) {
			// TODO Auto-generated method stub
			return accesosDao.read(iduser);
		}

		@Override
		public List<Map<String, Object>> readAll() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Map<String, Object> readAll(String username) {
			// TODO Auto-generated method stub
			return null;
		}
}
