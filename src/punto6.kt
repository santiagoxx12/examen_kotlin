fun main() {
    val eder = Person("eder", 19, "futbol", null)
    val majo = Person("majo", 18, "leer", eder)
    eder.showProfile()
    majo.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")

        if (hobby != null) {
            println("Le gusta el $hobby.")
        } else {
            println("No tiene un hobby.")
        }

        if (referrer == null) {
            println("No tiene referente.")
        } else {
            val referrerHobby = referrer.hobby ?: "ningún pasatiempo específico"
            println("Tiene un referente llamado ${referrer.name}, a quien le gusta $referrerHobby.")
        }

        println()
    }
}
