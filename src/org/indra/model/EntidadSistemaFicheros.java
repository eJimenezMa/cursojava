package org.indra.model;

import org.indra.view.FileSystemWatcher;

//PATRON DE DISEÑO COMPOSITE
public abstract class EntidadSistemaFicheros implements IObserver{
	private String nombre = null;
	
	protected static IObserver miradoPor = null;
	
	public static void RegistrarQuienMeMira(IObserver obs) {
		//EntidadSistemaFicheros.miradoPor = obs; TAMBIEN SE PUEDE PONER ASI
		miradoPor = obs;
	}
	
	public static void RegistrarQuienMeMira(FileSystemWatcher obs) {
		//EntidadSistemaFicheros.miradoPor = obs; TAMBIEN SE PUEDE PONER ASI
		miradoPor = obs;
	}
	
	public EntidadSistemaFicheros(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract int size();
	
	
}
