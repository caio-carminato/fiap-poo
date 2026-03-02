package br.com.fiapride.model;

public class Tablet {
    
    // Atributos privados (Encapsulamento)
    private String material;
    private String tamanho;
    private double peso;

    // Construtor para inicializar o Tablet
    public Tablet(String material, String tamanho, double peso) {
        this.material = material;
        this.tamanho = tamanho;
        this.peso = peso;
    }

    // --- Métodos de Operação (Comportamentos) ---

    public void ligarTablet() {
        System.out.println("O tablet está ligando... Inicializando sistema.");
    }

    public void desligarTablet() {
        System.out.println("Encerrando processos e desligando o tablet.");
    }

    // --- Getters e Setters (Acesso aos atributos) ---

    public String getMaterial() {
        return material;
    }

    // Definido como private conforme seu diagrama UML (-)
    private void setMaterial(String material) {
        this.material = material;
    }

    public String getTamanho() {
        return tamanho;
    }

    // Definido como private conforme seu diagrama UML (-)
    private void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getPeso() {
        return peso;
    }

    // Definido como private conforme seu diagrama UML (-)
    // Adicionei uma regra simples para o peso não ser negativo
    private void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("Erro: O peso deve ser maior que zero.");
        }
    }
}