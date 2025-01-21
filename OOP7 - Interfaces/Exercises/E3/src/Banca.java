import java.util.ArrayList;
import java.util.List;

public class Banca {
    private List<Client> clientList;
    private String codBanca;

    public Banca(String codBanca) {
        this.clientList = new ArrayList<>();
        this.codBanca = codBanca;
    }

    public void add(Client clientNou){
        boolean isClient = false;
        for(Client clientVechi : clientList){
            if(clientVechi == clientNou){
                isClient = true;
                break;
            }
        }
        if(!isClient){
            clientList.add(clientNou);
        }
    }

    public void afisareClient(String nume){
        Client client = searchClient(nume);
        System.out.println("Client: " + client.getNume());
        System.out.println("Adresa: " + client.getAdresa());
        showConturi(client);

    }

    private Client searchClient(String nume){
        for(Client c : clientList){
            if(c.getNume().equals(nume)){
                return c;
            }
        }
        System.out.println("Clientul nu exista!");
        return null;
    }

    private void showConturi(Client client){
        for(ContBancar cont : client.getListaConturi()){
            System.out.println(cont.getNumarCont() + ": " + cont.getSuma());
        }
    }





}
