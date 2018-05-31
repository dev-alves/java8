package cap03;

public class ValidadorMain {
	
	public static void main(String[] args) {
		Validador<String> validarCEP = value -> value.matches("[0-9]{5}-[0-9]{3}");
		System.out.println(validarCEP.validar("12345-123"));
	}
	
}
