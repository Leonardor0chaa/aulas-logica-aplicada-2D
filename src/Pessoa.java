public class Pessoa extends Animal {
    //Atributos
    String sobrenome;
    // Métodos
    public void falar(){
        System.out.println("Falei");
    }
    // sobrecarga do método falar()
    public String falar(String volume){
        return "falei " + volume;
    }
    // construtor
    Pessoa(){

    }
    Pessoa(String _nome){
        this.nome = _nome;
    }
    // sobrescrito do método comer
    public void comer(){
        System.out.println("Pessoa Comeu!!!");
    }


}
