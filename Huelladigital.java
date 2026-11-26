public class HuellaDigital extends MetodoAutenticacion {
    public HuellaDigital(int nivel) { super(nivel); }
    @Override public String autenticar() { return "Huella (Nivel " + nivelSeguridad + ")"; }
}
