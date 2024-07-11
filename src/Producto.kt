class Producto(val nombre: String, val precio: Double) {

    fun mostrarPrecioIVA() {
        val precioIVA = precio * 1.16
        println("Precio con IVA: $precioIVA")
    }
}