/*
fun main(){
    println("test")
}
*/

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashSet

fun main(){
    //Sachbücher erstellen
    val s1 = Sachbuch("werwiewas","Habermacher", 15.50,254268954100,0)
    var s2 = Sachbuch("wie werde ich glücklich?","Budda", 67.65, 957896453685, 0)
    //Comics erstellen
    var c1 = Comic("donald duck", "carl bark",4.75, 467895684580, 0)
    var c2 = Comic("lucky luke", "Morris",13.70,498654238495,0 )

    //zusätzliche Bücher
    var k1 = Krimi("der tote im moor", "andre petter", 35.20, 254563859675, 0)
    var r1 = Roman("der name der rose", "umberto eco", 31.35, 568945678953,0)

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
    for (x in hashSetBuecher){
        println("- " + x.titel + ", " + x.verkaufspreis + " CHF")
    }
    println()

/*
    //Titel ausgeben, Variante
    println("Folgende Titel sind vorhanden: " + s1.titel +", " + s2.titel + ", " + c1.titel + ", " + c2.titel)
 */

    //Preis ändern
    s1.verkaufspreis = 20.45

    //Preise ausgeben
    println("Die neuen Preise sind:")
    for (x in hashSetBuecher){
        println("- " + x.titel + " kostet " + x.verkaufspreis + " CHF")
    }
    println()

    //Warenkorb erstellen
    val warenkorb = ArrayList<Buch>()
    warenkorb.add(s2)
    warenkorb.add(c1)
    warenkorb.add(k1)
    warenkorb.add(k1)
    println("--Warenkorb erstellen--")

    //Warenkorbpreis
    var warenkorbPreis = 0.00
    for (b in warenkorb){
        warenkorbPreis = warenkorbPreis + b.verkaufspreis
    }
    println("Diese Bücher befinden sich im Warenkorb:")
    for (b in warenkorb){
        println(b.titel + ", " + b.verkaufspreis + " CHF")
    }
    println("Der Gesamtpreis beträgt " + warenkorbPreis + " CHF")


    println("-Ende-")

}