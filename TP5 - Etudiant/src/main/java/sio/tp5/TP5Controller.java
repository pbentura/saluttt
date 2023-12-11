package sio.tp5;


import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
//import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import sio.tp5.Model.Client;
import sio.tp5.Model.Commande;
import sio.tp5.Model.Fleur;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class TP5Controller implements Initializable {

    DecimalFormat df;

    ArrayList<Client> lesclients;
    ArrayList<Commande>lescommandes;
    ArrayList<Fleur>lesfleurs;

    @FXML
    private Button cmdNewCommande;
    @FXML
    private Button cmdAllCommandes;
    @FXML
    private AnchorPane apNewCommande;
    @FXML
    private AnchorPane apAllCommandes;
    @FXML
    private Label lblTitre;
    @FXML
    private TextField txtNumCommande;
    @FXML
    private ComboBox cboClients;
    @FXML
    private ImageView imgFleur;
    @FXML
    private TableColumn tcNom;
    @FXML
    private TableColumn tcPrix;
    @FXML
    private TableColumn tcQuantite;
    @FXML
    private TableView<Fleur> tvFleurs;
    @FXML
    private Button cmdValider;
    @FXML
    private Button cmdEnregistrer;
    @FXML
    private TextField txtMontant;
    @FXML
    private TableView tvCommandes;
    @FXML
    private TableColumn tcNumero;
    @FXML
    private TableColumn tcClient;
    @FXML
    private TableColumn tcMontant;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        lblTitre.setText("TP5 / New commande");
        apNewCommande.toFront();

        df = new DecimalFormat("#.##");



        lesclients=  new ArrayList<>();
        lesfleurs = new ArrayList<>();
        lescommandes = new ArrayList<>();
        initData();

//        for (Client clt : lesclients)
//        {
//            cboClients.getItems().add(clt.getNomClient());
//        }
//        cboClients.getSelectionModel().selectFirst();

        for (int i=0; i < lesclients.size(); i++)
        {
            cboClients.getItems().add(lesclients.get(i).getNomClient());
        }
        cboClients.getSelectionModel().selectFirst();
    }

    public void initData()
    {
        Fleur fleur = new Fleur("Fleur1",2.45,0);
        lesfleurs.add(fleur);
        fleur = new Fleur("Fleur2",1.25,0);
        lesfleurs.add(fleur);
         fleur = new Fleur("Fleur3",1.75,0);
        lesfleurs.add(fleur);
         fleur = new Fleur("Fleur4",2.15,0);
        lesfleurs.add(fleur);
         fleur = new Fleur("Fleur5",0.95,0);
        lesfleurs.add(fleur);
         fleur = new Fleur("Fleur6",1.85,0);
        lesfleurs.add(fleur);
         fleur = new Fleur("Fleur7",1.35,0);
        lesfleurs.add(fleur);
         fleur = new Fleur("Fleur8",1.05,0);
        lesfleurs.add(fleur);
         fleur = new Fleur("Fleur9",1.45,0);
        lesfleurs.add(fleur);
         fleur = new Fleur("Fleur10",2.55,0);
        lesfleurs.add(fleur);


        Client client = new Client(1,"Jean-Morris");
        lesclients.add(client);
        client = new Client(2,"Patrick");
        lesclients.add(client);
        client = new Client(3,"Poulet");
        lesclients.add(client);
    }

    @FXML
    public void cmdNewCommandeClicked(Event event) {
        lblTitre.setText("TP5 / New commande");
        apNewCommande.toFront();
    }

    @FXML
    public void cmdAllCommandesClicked(Event event) {
        lblTitre.setText("TP5 / All commandes");
        apAllCommandes.toFront();
    }

    @FXML
    public void tvFleursClicked(Event event)
    {

    }

    @FXML
    public void cmdValiderClicked(Event event)
    {

    }

    @FXML
    public void cmdEnregistrerClicked(Event event)
    {

    }
}