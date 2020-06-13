package interfaces;

import java.util.ArrayList;

import models.Categoria;
import models.Paquete;

public interface TurismoInterface {
	
	public ArrayList<Categoria> listaCategorias();
	
	public int registrarPaquete(Paquete p);

}
