package productos;

public class Puertas extends Aberturas {
    public Puertas(int idProducto, String nombre, String categoria, String subcategoria, boolean existencia, double precio, String descripcion, String materialMarco, String materialHoja, String tipoApertura, int exterior, int ladoApertura, boolean tieneVidrio, String lineaEstilo, String color, double ancho, double alto, double espesor) {
        super(idProducto, nombre, categoria, subcategoria, existencia, precio, descripcion, materialMarco, materialHoja, tipoApertura, exterior, ladoApertura, tieneVidrio, lineaEstilo, color, ancho, alto, espesor);
    }
}