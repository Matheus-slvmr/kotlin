fun homemEmulher() {
    var homem = 5
    var mulher = 3
    var homemCarne: Int = 400
    var homemLata: Int = 8
    var homemRefri: Int = 400
    var mulherCarne: Int = 300
    var mulherLata: Int = 6
    var mulherRefri: Int = 400

    var calculoCarneKG :Int = (homem * homemCarne) + (mulher * mulherCarne)
    var calculoLata :Int = (homem * homemLata) + (mulher * mulherLata)
    var calculoRefri :Int = (homem * homemRefri) + (mulher * mulherRefri)

    println("Quantidade de Carne (em gramas): $calculoCarneKG")
    println("Quantidade de Latas de Cerveja: $calculoLata")
    println("Quantidade de Refrigerante (em ml): $calculoRefri")
}
fun main() {
    homemEmulher()

}