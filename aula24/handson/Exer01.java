package aula24.handson;

public class Exer01 {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		lampada.modelo="A60";
		lampada.tensao ="Bivolt";
		lampada.potencia= 7;
		lampada.garantiaMeses=36;
		lampada.cor="Amarelo";
		lampada.tipoLuz="Amarela";
		lampada.tipos = new String[5];
		lampada.tipos[0] = "Abajour";
		lampada.tipos[1] = "Lampiao";
	}
}
