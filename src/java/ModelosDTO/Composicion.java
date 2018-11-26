package ModelosDTO;

/**
 *
 * @author edgar
 */
public class Composicion {

    private int idComposicion;
    private String sustanciaActiva;
    private double miligramos;

    public Composicion(int idComposicion, String sustanciaActiva, double miligramos) {
        this.idComposicion = idComposicion;
        this.sustanciaActiva = sustanciaActiva;
        this.miligramos = miligramos;
    }

    public int getIdComposicion() {
        return idComposicion;
    }

    public void setIdComposicion(int idComposicion) {
        this.idComposicion = idComposicion;
    }

    public String getSustanciaActiva() {
        return sustanciaActiva;
    }

    public void setSustanciaActiva(String sustanciaActiva) {
        this.sustanciaActiva = sustanciaActiva;
    }

    public double getMiligramos() {
        return miligramos;
    }

    public void setMiligramos(double miligramos) {
        this.miligramos = miligramos;
    }

}
