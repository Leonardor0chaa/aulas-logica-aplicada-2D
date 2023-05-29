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

        //Criar mais objetos
        Animal cao = new Animal();
        Animal gato = new Animal();
        Animal gato2 = new Animal();
        Animal roedor; // Declarar
        roedor = new Animal(); // Instanciar
        Animal x;
        x = new Animal();

        // Consultar dados de objeto cao
        cao.nome = "Robertinho"; // Atribuição
        System.out.println(cao.nome); // Consulta
        cao.comer(); // chamado de método
        Pessoa nova = new Pessoa();
        nova.nome = "Tina";
        nova.comer();

    }
}