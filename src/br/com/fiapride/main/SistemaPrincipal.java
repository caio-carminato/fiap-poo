package br.com.fiapride.main;
import br.com.fiapride.model.Tablet;
public class SistemaPrincipal {
	
public static void main(String[] args) {

// Dentro do main...// Fabriquei a primeira (Instância 1)


// Fabriquei a segunda (Instância 2)
Tablet tabletDoCaio = new Tablet();
tabletDoCaio.tamanho = "Grande";
tabletDoCaio.material = "Alumínio";
System.out.println("Meu Tablet é: " + tabletDoCaio.tamanho);
System.out.println("O materrial é: " + tabletDoCaio.material);

}
}
