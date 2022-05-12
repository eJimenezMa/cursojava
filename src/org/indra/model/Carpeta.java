package org.indra.model;

import java.util.*;

public class Carpeta extends EntidadSistemaFicheros{

	List<EntidadSistemaFicheros> subFiles = new ArrayList<EntidadSistemaFicheros>();
	
	public void Add(EntidadSistemaFicheros file) {
		
		if(!subFiles.contains(file)) {
			if(miradoPor!=null) miradoPor.notify("Agregando "+file.getNombre()+" a la carpeta "+this.getNombre());
			this.subFiles.add(file);
		}
	}
	
	public Carpeta(String nombre) {
		super(nombre);
		if(miradoPor!=null) miradoPor.notify("Creando carpeta "+nombre+".");
	}

	

	@Override
	public int size() {
		int sizeFiles = 0;
		for(EntidadSistemaFicheros file : subFiles) {
			sizeFiles += file.size();
		}
		return sizeFiles;
	}

	@Override
	public void notify(Object cambio) {
		// TODO Auto-generated method stub
		
	}
}
