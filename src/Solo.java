public class Solo {
    // Atributos
    String tipoSolo;
    boolean dertil;
    String cor;
    // Método
    public Planta gerarPlanta (Semente semente) {
        return new Planta(semente);
    }
}
