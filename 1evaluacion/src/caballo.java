
public class caballo {
	static int peso;
	public String color;
	public String sexo;
	public String due�o;
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
	public void setDue�o(String d) {
		due�o = d;
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
	public String getDue�o() {
		return due�o;
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
