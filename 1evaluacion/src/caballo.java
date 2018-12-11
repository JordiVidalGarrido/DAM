
public class caballo {
	static int peso;
	public String color;
	public String sexo;
	public String dueño;
	public String raza;
	
	
	public void setColor(String c) {
		color = c;
	}
	public static void setPeso(int peso) {
		caballo.peso = peso;
	}
	public void setSexo(String s) {
		sexo = s;
	}
	public void setDueño(String d) {
		dueño = d;
	}
	public void setRaza(String r) {
		raza = r;
	}
	
	
	public static int getPeso() {
		return peso;
	}
	public String getColor() {
		return color;
	}
	public String getSexo() {
		return sexo;
	}
	public String getDueño() {
		return dueño;
	}
	public String getRaza() {
		return raza;
	}

	
	
	public String correr() {
		return " esta corriendo";
	}
	public String saltar() {
		return " esta saltando";
	}
	public String relinchar() {
		return " esta relinchando";
	}
}
