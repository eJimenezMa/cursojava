package org.indra.view;

import org.indra.model.Archivo;
import org.indra.model.Carpeta;
import org.indra.model.EntidadSistemaFicheros;

public class Program {

	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		System.out.println("Hola Mundo");
		System.out.println("Hola Mundo");
		
		//MIS AGREGADOS
		FileSystemWatcher observer = new FileSystemWatcher();
		EntidadSistemaFicheros.RegistrarQuienMeMira(observer);
		
		System.out.println("Creando carpeta root");
		Carpeta carpetaRaiz = new Carpeta("Root");
		System.out.println("Creando carpeta temp");
		Carpeta temp = new Carpeta("temp");
		System.out.println("Creando carpeta trash");
		Carpeta trash = new Carpeta("trash");
		System.out.println("Creando archivo autoexec.bat con 100 bytes");
		Archivo autoexec = new Archivo("autoexec.bat", 100);
		System.out.println("Creando archivo imagen.jpg vacío");
		Archivo imagen = new Archivo("imagen.jpg");
		System.out.println("Hola Mundo");
		imagen.setSizeFile(350);
		
		
		carpetaRaiz.Add(temp);
		temp.Add(autoexec);
		temp.Add(trash);
		trash.Add(imagen);
		
		EntidadSistemaFicheros root = carpetaRaiz;
		System.out.println("El tamaño total es "+root.size());
	}

}
