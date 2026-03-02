package br.com.fiapride.main;

// ESTA LINHA É A CORREÇÃO DO ERRO:
import br.com.fiapride.model.Tablet;

public class TesteTablet {
    public static void main(String[] args) {
        // 1. Instanciando o objeto Tablet (Material, Tamanho, Peso)
        // Certifique-se que o construtor na classe Tablet seja 'public'
        Tablet meuTablet = new Tablet("Alumínio", "11 polegadas", 0.480);

        System.out.println("--- Status do Dispositivo ---");
        
        // 2. Acessando informações via métodos GET (públicos)
        System.out.println("Material: " + meuTablet.getMaterial());
        System.out.println("Tamanho: " + meuTablet.getTamanho());
        System.out.println("Peso: " + meuTablet.getPeso() + "kg");

        System.out.println("\n--- Executando Ações ---");
        
        // 3. Chamando os métodos de operação
        meuTablet.ligarTablet();
        meuTablet.desligarTablet();
        
        /* * Nota: Tentar usar meuTablet.setMaterial("Plástico"); 
         * causará erro pois o método é 'private' no seu diagrama.
         */
    }
}