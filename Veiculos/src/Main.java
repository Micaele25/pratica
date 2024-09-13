public class Main {
    public static void main(String[] args) {

        Veiculo[] veiculos = {
                new Carro("Toyota", "Corolla", 2024, 4),
                new Moto("Honda", "CB300", 2024, 300),
                new Caminhao("Volvo", "FH", 2021, 20.5),
                new Onibus("Mercedes", "O500", 2023, 45)
        };


        for (Veiculo veiculo : veiculos) {
            veiculo.exibirDetalhes();
            veiculo.mover();
            System.out.println();
        }
    }
}
