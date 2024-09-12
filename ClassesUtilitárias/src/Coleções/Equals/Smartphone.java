package Coleções.Equals;

public class Smartphone {
	private String serialNumber;
	private String marca;
	
	public Smartphone(String sn, String m) {
		serialNumber = sn;
		marca = m;
	}
	
	@Override
	public boolean equals(Object objeto) {
		if(objeto == null) return false; 
		if(this == objeto) return true;
		if(this.getClass() != objeto.getClass()) return false;
		Smartphone smartphone = (Smartphone) objeto;
		return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
	}
	
	@Override
	public int hashCode() {
		return serialNumber == null ? 0 : this.serialNumber.hashCode();
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
}