public class Pessoa {
    //Atributos
    String nome;
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

}