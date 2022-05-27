package modelo;

import java.util.ArrayList;

public class Pais
{

	private int puntosV;
	private String nombre;
	private ArrayList<String> archivosPlanos = new ArrayList<>();

	public Pais ( String nombre, int puntosV )
	{
		this.nombre = nombre;
		this.puntosV = puntosV;
	}

	public ArrayList<String> getArchivosPlanos ()
	{
		return archivosPlanos;
	}

	public String getNombre ()
	{
		return nombre;
	}

	public void setArchivosPlanos ( ArrayList<String> archivosPlanos )
	{
		this.archivosPlanos = archivosPlanos;
	}

}
