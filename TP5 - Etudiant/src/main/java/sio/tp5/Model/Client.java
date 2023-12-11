package sio.tp5.Model;

public class Client
{
    private int numeroClient;
    private String nomClient;

    public Client(int numeroClient, String nomClient) {
        this.numeroClient = numeroClient;
        this.nomClient = nomClient;
    }

    public int getNumeroClient() {
        return numeroClient;
    }

    public String getNomClient() {
        return nomClient;
    }
}
