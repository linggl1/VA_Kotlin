import java.util.*
import kotlin.collections.ArrayList

class Warenkorb(var liste: ArrayList<Buch>) {

    fun hinzufuegen(buch: Buch) {
        this.liste.add(buch)
    }

    fun anzeigen() {
        println("Diese Bücher befinden sich im Warenkorb:")
        for (b in this.liste) {
            println(b.titel + ", " + b.verkaufspreis + " CHF")
        }
        println()
    }

    fun berechnePreis(): Double {

        var warenkorbPreis = 0.00
        for (b in this.liste) {
            warenkorbPreis = warenkorbPreis + b.verkaufspreis
        }
        warenkorbPreis = (Math.round(warenkorbPreis * 100.00) / 100.00)
    //    println("Der Gesamtpreis beträgt " + warenkorbPreis + " CHF")
    //   println()
        return warenkorbPreis
    }

    fun gewaehreRabatt(){
        var rabatt = 0
        var eingabewert = Scanner(System.`in`)
        do {
        println("Wie viel Prozent Rabatt möchtest du?")
        var e = eingabewert.nextInt()
        if (e >= 100 && rabatt <= 0) {
            println("dieser Rabatt ist nicht möglich!")
        } else rabatt = e
        } while (e >= 100 && rabatt <= 0)

        println("-Rabatt erfolgreich zugewiesen-")


        var warenkorbPreis = this.berechnePreis() - this.berechnePreis() * rabatt / 100

        println("Der Gesamtpreis inkl. " + rabatt + "% Rabatt beträgt " + warenkorbPreis + " CHF")



    }

}