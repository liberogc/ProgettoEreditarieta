package modelli;

public class Studenti extends Persone{
	@Override
	public String toString() {
		return "Studenti [matricola=" + matricola + ", pf=" + pf + ", telefono=" + telefono + ", getNome()=" + getNome()
				+ ", getCognome()=" + getCognome() + "]";
	}
	private int matricola;
	private String pf,telefono;
	
	public int getMatricola() {
		return matricola;
	}
	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}
	public String getPf() {
		return pf;
	}
	public void setPf(String pf) {
		this.pf = pf;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}
