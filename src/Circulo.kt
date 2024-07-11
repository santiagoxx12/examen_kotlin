class Circulo(val radio:Double): FiguraGeometrica() {

    override fun calcularArea(): Double {
        var PI = 3.1416
        return PI + (radio*radio)
    }
}