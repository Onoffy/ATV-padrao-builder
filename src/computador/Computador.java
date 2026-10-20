package computador;

public class Computador {
    private String processador;
    private String placaDeVideo;
    private int memoriaRam;
    private int armazenamento;

    public Computador (String processador, String placaDeVideo, int memoriaRam, int armazenamento) {
        this.processador = processador;
        this.placaDeVideo = placaDeVideo;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
    }

    public void exibirInformacoes () {
        System.out.println("Processador: " + processador);
        System.out.println("Placa de Vídeo: " + placaDeVideo);
        System.out.println("Memória RAM: " + memoriaRam + " gb");
        System.out.println("Armazenamento: " + armazenamento + " gb");
    }
}
