package Clases;

import java.util.ArrayList;

public class Publicacion {
	
	public int likes;
	public int dislikes;
	public String rutaFoto;
	public String pieDeFoto;
	
	public Publicacion(){
		super();
	}
	
	public Publicacion (String rutaFoto, String pieDeFoto) {
		super();
		this.pieDeFoto = pieDeFoto;
		this.rutaFoto = rutaFoto;
	}

	@Override
	public String toString() {
		return "Publicacion [likes=" + likes + ", dislikes=" + dislikes + ", rutaFoto=" + rutaFoto + ", pieDeFoto="
				+ pieDeFoto + "]";
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getDislikes() {
		return dislikes;
	}

	public void setDislikes(int dislikes) {
		this.dislikes = dislikes;
	}

	public String getRutaFoto() {
		return rutaFoto;
	}

	public void setRutaFoto(String rutaFoto) {
		this.rutaFoto = rutaFoto;
	}

	public String getPieDeFoto() {
		return pieDeFoto;
	}

	public void setPieDeFoto(String pieDeFoto) {
		this.pieDeFoto = pieDeFoto;
	}
}
