fun cuadrado(numero: Int): Int {
    return numero * numero
}

fun aplicarOperacion(numero: Int, operacion: (Int) -> Int): Int {
    return operacion(numero)
}


fun main() {
    println(aplicarOperacion(5, ::cuadrado))
}
