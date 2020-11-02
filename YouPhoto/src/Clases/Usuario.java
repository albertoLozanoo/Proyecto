package Clases;

import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private String contraseya;
	private int seguidores;
	private int seguidos;
	private ArrayList<Publicacion> listaPublicaciones;
	private String rutaFotoUsuario;
	
	
	public Usuario(String nombre, String contraseya, int nSeguidores, int nSeguidos, ArrayList<Publicacion> listaPublicaciones ) {

		this.nombre = nombre;
		this.contraseya = contraseya;
		this.seguidores = nSeguidores;
		this.seguidos = nSeguidos;
		this.listaPublicaciones = listaPublicaciones;
	}


	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public String getContraseya() {
		return contraseya;
	}

	public void setContraseya(String contraseya) {
		this.contraseya = contraseya;
	}


	public int getnSeguidores() {
		return seguidores;
	}


	public void setnSeguidores(int nSeguidores) {
		this.seguidores = nSeguidores;
	}


	public int getnSeguidos() {
		return seguidos;
	}


	public void setnSeguidos(int nSeguidos) {
		this.seguidos = nSeguidos;
	}


	public ArrayList<Publicacion> getListaPublicaciones() {
		return listaPublicaciones;
	}


	public void setListaPublicaciones(ArrayList<Publicacion> listaPublicaciones) {
		this.listaPublicaciones = listaPublicaciones;
	}
	
	public String getRutaFotoUsuario() {
		return rutaFotoUsuario;
	}


	public void setRutaFotoUsuario(String rutaFotoUsuario) {
		this.rutaFotoUsuario = rutaFotoUsuario;
	}



	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", contraseya=" + contraseya + ", nSeguidores=" + seguidores
				+ ", nSeguidos=" + seguidos + ", listaPublicaciones=" + listaPublicaciones + "]";
	}

	

	

}