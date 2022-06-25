open class Buch(var titel: String, var autor: String, var verkaufspreis: Double, var ean: Long, var rabatt: Int) {

    fun gewaehreRabatt(i:Int){
        this.rabatt = i
    }

}