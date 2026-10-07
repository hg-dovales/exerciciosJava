public class Pedido {
    private Produto produto;
    private int quantidade;
    public Pedido(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }
    double calcularTotal(){
        double valorTotal = produto.getPreco() * this.quantidade;
        return valorTotal;
    }
    boolean finalizarPedido(){
        if(produto.removerEstoque(this.quantidade)){
            return true;
        } else{
            System.out.println("Não foi possível finalizar o pedido.");
            return false;
        }
    }
}
