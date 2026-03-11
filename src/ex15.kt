fun calcularChurrasco() {
    var homem = 5
    var mulher = 3
    var homemCarne = 400
    var homemLata = 8
    var homemRefri = 400
    var mulherCarne = 300
    var mulherLata = 6
    var mulherRefri = 400

    var calculoCarneKG = ((homem * homemCarne) + (mulher * mulherCarne)) / 1000.0
    var calculoLata = (homem * homemLata) + (mulher * mulherLata)
    var calculoRefri = ((homem * homemRefri) + (mulher * mulherRefri))/ 1000.0

    var precoRefriEmReais = 8
    var precoCarneKgEmReais = 40
    var precoCervejaEmReais = 4

    var pessoasTotal = (homem + mulher)

    var valorTotalCarne = (calculoCarneKG) * precoCarneKgEmReais
    var valorTotalLata = (calculoLata) * precoCervejaEmReais
    var valorTotalRefri = (calculoRefri) * precoRefriEmReais

    var valoresPorPessoa = (valorTotalRefri + valorTotalLata + valorTotalCarne) / pessoasTotal

    println("Quantidade de Carne (em Kg): $calculoCarneKG")
    println("Quantidade de Latas de Cerveja: $calculoLata")
    println("Quantidade de Refrigerante (em L): $calculoRefri")
    println("valor por pessoa R$: $valoresPorPessoa")
}

fun main() {
    calcularChurrasco()

}