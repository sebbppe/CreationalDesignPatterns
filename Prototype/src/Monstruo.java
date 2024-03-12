public class Monstruo implements Prototype{
    private String tipo;

    public Monstruo(String tipo) {
        this.tipo = tipo;
    }


    @Override
    public Prototype clone() {
        return new Monstruo(this.tipo);
    }

    public void atacar() {
        System.out.println("El " + tipo + " ataca!");
    }

    public String getTipo() {
        return tipo;
    }
}
