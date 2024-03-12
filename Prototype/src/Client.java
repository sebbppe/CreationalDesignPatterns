public class Client {
    public static void main(String[] args) {
        Monstruo original = new Monstruo("Fuego");
        Monstruo clon = (Monstruo) original.clone();
        System.out.println("Monstruo original:");
        original.atacar();
        System.out.println("Monstruo clonado:");
        clon.atacar();
        //Verificación
        System.out.println("¿Son el mismo objeto? " + (original == clon));
        System.out.println("¿Tienen el mismo tipo? " + original.getTipo().equals(clon.getTipo()));
    }
}