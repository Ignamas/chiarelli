package productos;


public class Aberturas extends Productos {
    private String materialMarco;
    private String materialHoja;
    private String tipoApertura;
    private int exterior;
    private int ladoApertura;
    private boolean tieneVidrio;
    private String lineaEstilo;
    private String color;
    private double ancho;
    private double alto;
    private double espesor;



    public Aberturas(int idProducto, String nombre, String categoria, String subcategoria, boolean existencia, double precio, String descripcion, String materialMarco, String materialHoja, String tipoApertura, int exterior, int ladoApertura, boolean tieneVidrio, String lineaEstilo, String color, double ancho, double alto, double espesor) {
        super(idProducto, nombre, categoria, subcategoria, existencia, precio, descripcion);
        this.materialMarco = materialMarco;
        this.materialHoja = materialHoja;
        this.tipoApertura = tipoApertura;
        this.exterior = exterior;
        this.ladoApertura = ladoApertura;
        this.tieneVidrio = tieneVidrio;
        this.lineaEstilo = lineaEstilo;
        this.color = color;
        this.ancho = ancho;
        this.alto = alto;
        this.espesor = espesor;
    }

    public String getMaterialMarco() {
        return materialMarco;
    }

    public void setMaterialMarco(String materialMarco) {
        this.materialMarco = materialMarco;
    }

    public String getMaterialHoja() {
        return materialHoja;
    }

    public void setMaterialHoja(String materialHoja) {
        this.materialHoja = materialHoja;
    }

    public String getTipoApertura() {
        return tipoApertura;
    }

    public void setTipoApertura(String tipoApertura) {
        this.tipoApertura = tipoApertura;
    }

    public int getExterior() {
        return exterior;
    }

    public void setExterior(int exterior) {
        this.exterior = exterior;
    }

    public int getLadoApertura() {
        return ladoApertura;
    }

    public void setLadoApertura(int ladoApertura) {
        this.ladoApertura = ladoApertura;
    }

    public boolean isTieneVidrio() {
        return tieneVidrio;
    }

    public void setTieneVidrio(boolean tieneVidrio) {
        this.tieneVidrio = tieneVidrio;
    }

    public String getLineaEstilo() {
        return lineaEstilo;
    }

    public void setLineaEstilo(String lineaEstilo) {
        this.lineaEstilo = lineaEstilo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getEspesor() {
        return espesor;
    }

    public void setEspesor(double espesor) {
        this.espesor = espesor;
    }

    public boolean altoValido(double alto){
        return this.alto>=0;
    }

    public boolean anchoValido(double ancho){
        return  this.ancho>=0;

    }

    public boolean espesorValido(double espesor){
        return this.espesor>=0;
    }
}
