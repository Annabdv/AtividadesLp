package petShop;

public class FachadaPetshop {
    private InventarioPetshop inventarioPetshop;

    public FachadaPetshop() {
        this.inventarioPetshop = new InventarioPetshop();
    }

    public String listaServicos() {
        return inventarioPetshop.listaServico();
    }

    public Banho addBanho(int codigo, TamanhoDoAnimal tamanhoDoAnimal, TamanhoPelo tamanhoPelo) {
        Banho banho = new Banho(codigo, tamanhoDoAnimal, tamanhoPelo);
        inventarioPetshop.adicionaServico(banho);
        return banho;
    }

    public Hotelzinho addHotelzinho(int codigo, TamanhoDoAnimal tamanhoDoAnimal, int qtdeHoras) {
        Hotelzinho hotelzinho = new Hotelzinho(codigo, tamanhoDoAnimal, qtdeHoras);
        inventarioPetshop.adicionaServico(hotelzinho);
        return hotelzinho;
    }

    public Tosa addTosa(int codigo, TamanhoDoAnimal tamanhoDoAnimal) {
        Tosa tosa = new Tosa(codigo, tamanhoDoAnimal);
        inventarioPetshop.adicionaServico(tosa);
        return tosa;
    }

    public double calculaServico() {
        return inventarioPetshop.calculaValorServico();
    }

    public InventarioPetshop getInventario() {
        return inventarioPetshop;
    }
}