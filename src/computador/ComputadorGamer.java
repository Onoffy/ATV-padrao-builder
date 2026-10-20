package computador;

public class ComputadorGamer implements Builder {

    @Override
    public Computador criar () {
        return new Computador(
            "AMD Ryzen 7",
            "RX 7600",
            32,
            1000
        );
    }

}
