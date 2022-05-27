package modelo;

public enum Gasolina
{

	DIESEL, REGULAR, ESPECIAL, SUPER;

	public static String getGasolina ( int n )
	{
		switch ( n )
		{
			case 1:
				return DIESEL.toString();
			case 2:
				return REGULAR.toString();
			case 3:
				return ESPECIAL.toString();
			case 4:
				return SUPER.toString();
			default:
				return null;
		}
	}
}
