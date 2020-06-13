package action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import mantenimiento.GestionTurismo;
import models.Categoria;
import models.Paquete;

public class TurismoAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// DATOS
	private ArrayList<Categoria> listaCategorias;
	private ArrayList<Paquete> listaPaquetes;
	private Paquete p;
	private String mensaje;

	public String registrarPaquete() {
		int i= new GestionTurismo().registrarPaquete(p);
		
		if (i == 0) {
			mensaje = "No se pudo registrar";
			addActionError("No se registro correctamente");
			return "error";
		} else {
			mensaje = "Registro exitoso";
			addActionMessage(mensaje);
			return "ok";
		}

		
	}

	public String listadoCategoria() {
		listaCategorias = new GestionTurismo().listaCategorias();
		return "ok";
	}

	public String listadoPaquetes() {

		return "ok";
	}

	public ArrayList<Categoria> getListaCategorias() {
		return listaCategorias;
	}

	public void setListaCategorias(ArrayList<Categoria> listaCategorias) {
		this.listaCategorias = listaCategorias;
	}

	public ArrayList<Paquete> getListaPaquetes() {
		return listaPaquetes;
	}

	public void setListaPaquetes(ArrayList<Paquete> listaPaquetes) {
		this.listaPaquetes = listaPaquetes;
	}

	public Paquete getP() {
		return p;
	}

	public void setP(Paquete p) {
		this.p = p;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
