open class Buch(var titel: String, var autor: String, var verkaufspreis: Double, var isbn: String, var rabatt: Int) {

    fun gewaehreRabatt(i: Int) {
        this.rabatt = i
    }

}