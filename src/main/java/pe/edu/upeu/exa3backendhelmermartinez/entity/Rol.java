package pe.edu.upeu.exa3backendhelmermartinez.entity;

public class Rol {
	
	private int idrol;
	private String nombre;
	
	public Rol() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rol(int idrol, String nombre) {
		super();
		this.idrol = idrol;
		this.nombre = nombre;
	}
	public int getIdrol() {
		return idrol;
	}
	public void setIdrol(int idrol) {
		this.idrol = idrol;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
