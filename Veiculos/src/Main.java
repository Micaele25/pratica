public class Main {
    public static void main(String[] args) {

        Veiculo[] veiculos = {
                new Carro("Toyota", "Hilux", 2014, 2),
                new Moto("Honda", "CB300", 2024, 300),
                new Caminhao("Scania", "R 500", 2019, 20.5),
                new Onibus("Mercedes", "OF 1721", 2021, 45)
        };


        for (Veiculo veiculo : veiculos) {
            veiculo.exibirDetalhes();
            veiculo.mover();
            System.out.println();
        }
    }
}
