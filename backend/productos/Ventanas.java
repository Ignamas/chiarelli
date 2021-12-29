package productos;

public class Ventanas extends Aberturas {

    private boolean tieneCelosia = false;

    public Ventanas(int idProducto, String nombre, String categoria, String subcategoria, boolean existencia, double precio, String descripcion, String materialMarco, String materialHoja, String tipoApertura, int exterior, int ladoApertura, boolean tieneVidrio, String lineaEstilo, String color, double ancho, double alto, double espesor, boolean celosia) {


        super(idProducto, nombre, categoria, subcategoria, existencia, precio, descripcion, materialMarco, materialHoja, tipoApertura, exterior, ladoApertura, tieneVidrio, lineaEstilo, color, ancho, alto, espesor);
        this.tieneCelosia = celosia;
    }

    public boolean isTieneCelosia() {
        return tieneCelosia;
    }

    public void setTieneCelosia(boolean tieneCelosia) {
        this.tieneCelosia = tieneCelosia;
    }


}
