public class Main {
    public static void main(String[] args) {

        Veiculo carro_1 = new Veiculo("Volks", "Parati");
        Veiculo carro_2 = new Veiculo("Honda", "Civic");
        Veiculo carro_3 = new Veiculo("Toyota", "Camry");
        Veiculo carro_4 = new Veiculo("Ford", "Mustang2014");

        System.out.println("Carro 1: " + carro_1.marca);
        Veiculo[] estacionamento = {carro_1, carro_2, carro_3, carro_4}

        for(Veiculo item:: estacionamento){
            System.out.println("Marca:" + item.marca);
            System.out.println("Modelo:" + item.modelo)
        }

        }
    }
}
