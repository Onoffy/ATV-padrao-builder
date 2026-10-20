package computador;

public class ComputadorNormal implements Builder {

    @Override
    public Computador criar () {
        return new Computador(
            "Intel I5 13°",
            "Intel UHD",
            8,
            500
        );
    }

}
