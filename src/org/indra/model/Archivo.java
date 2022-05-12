package org.indra.model;

public class Archivo extends EntidadSistemaFicheros{

	private int sizeFile;
	
	public int getSizeFile() {
		return sizeFile;
	}

	public void setSizeFile(int sizeFile) {
		this.sizeFile = sizeFile;
	}

	public Archivo(String nombre, int sizeFile) {
		super(nombre);
		this.sizeFile = sizeFile;
		if(miradoPor!=null) miradoPor.notify("Creando archivo "+nombre+" con "+sizeFile+" bytes.");
	}
	
	public Archivo(String nombre) {
		super(nombre);
		this.sizeFile = 0;
		if(miradoPor!=null) miradoPor.notify("Creando archivo "+nombre+".");
	}

	@Override
	public int size() {
		return this.sizeFile;
	}

	@Override
	public void notify(Object cambio) {
		// TODO Auto-generated method stub
		
	}

}
