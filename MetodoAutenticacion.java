public abstract class MetodoAutenticacion {
    protected int nivelSeguridad;

    public MetodoAutenticacion(int nivelSeguridad) {
        this.nivelSeguridad = nivelSeguridad;
    }

    public int getNivelSeguridad() { return nivelSeguridad; }
    public abstract String autenticar();
}
