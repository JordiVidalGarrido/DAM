import java.util.Scanner;
 
public class CifradoCesar { 
    public static void main(String[] arg){ 
    	String texto;
    	Scanner scan=new Scanner(System.in);
        System.out.print("Introduce texto para cifrar: ");
        texto=scan.nextLine();
        String textocesar=""; 
        int desplazamiento=3; 
        textocesar = cifrar(texto, desplazamiento); 
        System.out.println("El texto cifrado es: " + textocesar); 
    } 
 
    public static String cifrar(String Cadena, int Desplazamiento){ 
        int VInt=0; 
        String CCifrado=""; 
         
        for (int i=0; i<Cadena.length();i++){ 
            if((Cadena.codePointAt(i)>=65 && Cadena.codePointAt(i)<=90) || (Cadena.codePointAt(i)>=97 && Cadena.codePointAt(i)<=122) ){ 
                VInt= Cadena.codePointAt(i) + Desplazamiento;             
                CCifrado = CCifrado + new Character((char) VInt).toString(); 
            }else{ 
                CCifrado=CCifrado+ Cadena.charAt(i); 
            } 
        } 
        return CCifrado; 
    } 
}