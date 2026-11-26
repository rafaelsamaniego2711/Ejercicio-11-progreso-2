public class ReconocimientoFacial extends MetodoAutenticacion {
    public ReconocimientoFacial(int nivel) { super(nivel); }
    @Override public String autenticar() { return "Facial (Nivel " + nivelSeguridad + ")"; }
}
