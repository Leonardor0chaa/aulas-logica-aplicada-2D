public class Main {
    public static void main(String[] args) {
        // Auto inicial de Orientação à objetos
        Pessoa adao = new Pessoa();
        // Declaração
        Pessoa qualquer;
        // Intanciação
        qualquer = new Pessoa();
        // Definir forma do objeto
        qualquer.nome = "Rita";
        qualquer.sobrenome = "Lee";
        // Definir comportamento
        qualquer.falar();
        System.out.println(qualquer.falar("alto"));

    }
}