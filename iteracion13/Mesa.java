package Codigo1;
public class Mesa {

	private int ID;
	private Estado estado;
	private int NComensales;

	public int getID() {
		// TODO - implement Mesa.getID
		return ID;
	}

	/**
	 * 
	 * @param ID
	 */
	public void setID(int ID) {
		// TODO - implement Mesa.setID
		throw new UnsupportedOperationException();
	}

	public Estado getEstado() {
		// TODO - implement Mesa.getEstado
		return estado;
	}

	/**
	 * 
	 * @param Estado
	 */
	public void setEstado(int Estado) {
		// TODO - implement Mesa.setEstado
		throw new UnsupportedOperationException();
	}

	public int getNComensales() {
	return NComensales;
	}

	/**
	 * 
	 * @param NComensales
	 */
	public void setNComensales(int NComensales) {
		// TODO - implement Mesa.setNComensales
		throw new UnsupportedOperationException();
	}

	public Mesa(int ID , int NComensales) {
		// TODO - implement Mesa.Mesa
		this.ID=ID;
		this.NComensales=NComensales;
		this.estado=Estado.LIBRE;
	}

}