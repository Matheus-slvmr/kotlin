
fun main(){
    val valorInicial: Int = 1000
    val descontoInicial: Double = 0.2
    val comDescontoSobreVenda: Double = 1000-0.2*valorInicial
    val comDescontoSobre2Vendas:Double = comDescontoSobreVenda- 0.2*comDescontoSobreVenda
    println("desconto de 20% da primeira venda ${comDescontoSobreVenda}")
    println("desconto de 20% da segunda venda ${comDescontoSobre2Vendas}")

}