
public class MetodosString {

	public static void main(String[] args) {
		String original = "levi MaRtins de ANDRade  ";
		String originalMinusculas = original.toLowerCase();
		String originalMaiusculas = original.toUpperCase();
		String originalSemEspacos = original.trim();
		String orinalAPartir = original.substring(3);
		String orinalTroca = original.replace("a", "trocou");
		int i =  original.indexOf("e");
		int j = original.lastIndexOf("e");
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + originalMinusculas + "-");
		System.out.println("toUpperCase: -" + originalMaiusculas + "-");
		System.out.println("trim: -" + originalSemEspacos + "-");
		System.out.println("substring(3): -" + orinalAPartir + "-");
		System.out.println("replace: -" + orinalTroca + "-");
		System.out.println("indexOf: -" + i + "-");
		System.out.println("indexOf: -" + j + "-");
	}
}
