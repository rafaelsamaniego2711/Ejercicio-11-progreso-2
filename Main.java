public class Main {
    public static void main(String[] args) {
        Empleado e = new Empleado("Nicolás");
        e.agregarMetodo(new HuellaDigital(3));
        e.agregarMetodo(new ReconocimientoFacial(4));
        e.agregarMetodo(new TokenSeguridad(5));
        System.out.println(e.mostrarMetodos());
        System.out.println("Supera nivel 4: " + e.superaUmbral(4));
    }
}
