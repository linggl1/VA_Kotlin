/*
fun main(){
    println("test")
}
*/

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashSet

fun main() {
    //Sachbücher erstellen
    var s1 = Sachbuch("Physik für Techniker", "Günter Simon und Jürgen Zeitler", 40.70, "978-3-446-44953-4", 0)
    var s2 = Sachbuch("Java lernen in abgeschlossenen Lerneinheiten", "Sebastian Dörn", 30.70, "978-3-658-24002-8", 0)
    //Comics erstellen
    var c1 = Comic("Donald Duck - sein Leben, seine Pleiten", "Walt Disney", 39.90, "978-3-7704-3912-6", 0)
    var c2 = Comic("Lucky Luke 99", "Achdé Jul", 18.00, "978-3-7704-4127-3", 0)

    //zusätzliche Bücher
    var k1 = Krimi("Sechseläuten", "Michael Theurillat", 12.80, "978-3-548-60944-7", 0)
    var r1 = Roman("Der Name der Rose", "Umberto Eco", 39.90, "978-3-446-27074-9", 0)


    //erstellte Bücher in ein Set speichern
    val hashSetBuecher = HashSet<Buch>()
    hashSetBuecher.add(s1)
    hashSetBuecher.add(s2)
    hashSetBuecher.add(c1)
    hashSetBuecher.add(c2)
    hashSetBuecher.add(k1)
    hashSetBuecher.add(r1)

    //Titel ausgeben
    println("Diese Titel sind vorhanden:")
    for (x in hashSetBuecher) {
        println("- " + x.titel + ", " + x.verkaufspreis + " CHF")
    }
    println()

/*
    //Titel ausgeben, Variante
    println("Folgende Titel sind vorhanden: " + s1.titel +", " + s2.titel + ", " + c1.titel + ", " + c2.titel)
 */

    //Preis ändern
    s1.verkaufspreis = 20.45
    println("--Preis ändern--")

    //Preise ausgeben
    println("Die neuen Preise sind:")
    for (x in hashSetBuecher) {
        println("- " + x.titel + " kostet " + x.verkaufspreis + " CHF")
    }
    println()

    //Warenkorb erstellen
    println("--Warenkorb erstellen--")
    var warenkorb = Warenkorb(ArrayList<Buch>())
    warenkorb.hinzufuegen(s2)
    warenkorb.hinzufuegen(c1)
    warenkorb.hinzufuegen(k1)
    warenkorb.hinzufuegen(k1)


    //Warenkorb ausgeben
    println("--Warenkorb anzeigen--")
    warenkorb.anzeigen()


    //Preis anzeigen
    println("--Warenkorbpreis anzeigen--")
    //warenkorb.berechnePreis()
    println("Der Gesamtpreis beträgt " + warenkorb.berechnePreis() + " CHF")
    println()

    //Rabatt gewähren
    println("--Warenkorb mit Rabatt--")
    warenkorb.gewaehreRabatt()

    println()

    println("-Ende-")

}