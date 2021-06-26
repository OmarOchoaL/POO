import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;

public class Ventana {
    private TextArea textArea;
    private Stage stage;
    private ListView lista;
    private  String[] renglones;

    public  Ventana(Stage stage){ this.stage=stage; }
    public AnchorPane crearVentana(){
        AnchorPane pane=new AnchorPane();
        pane.setStyle("-fx-background-image: url(./img/fondo.jpg); -fx-background-size: 100% 100%");
        pane.setPrefSize(900,600);

        Menu menu=new Menu("Archivo");
        MenuItem open=new MenuItem("Abrir");
        MenuItem save=new MenuItem("Guardar");
        MenuItem salir=new MenuItem("Exit");

        menu.getItems().addAll(open,save,salir);
        MenuBar menuBar=new MenuBar();
        menuBar.setPrefSize(900,25);menuBar.setLayoutX(0);menuBar.setLayoutY(0);
        menuBar.getMenus().addAll(menu);

        open.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FileChooser chooser=new FileChooser();
                chooser.setTitle("Favor de elegir el archivo");
                File file=  chooser.showOpenDialog(stage);
                if(file !=null){
                    leerArchivo(file.getAbsolutePath());
                    System.out.println(file.getTotalSpace());
                }
            }
        });


        textArea=new TextArea();textArea.setPrefSize(200,200);
        textArea.setLayoutX(10);textArea.setLayoutY(50);


        lista= new ListView();lista.setPrefSize(230,400);lista.setLayoutX(10);lista.setLayoutY(90);
        TextField textField=new TextField();textField.setPrefSize(150,20);textField.setLayoutX(10);textField.setLayoutY(50);textField.setPromptText("Elementos a buscar");
        Button btnBuscar=new Button("Search");btnBuscar.setPrefSize(80,20);btnBuscar.setLayoutX(165);btnBuscar.setLayoutY(50);
        btnBuscar.setStyle("-fx-background-color:#04d14c;-fx-background-radius: 5em;-fx-text-fill:white");

        Label simboloEl=new Label("H");simboloEl.setFont(new Font("Arial",150));simboloEl.setStyle("-fx-text-fill: #111");
        simboloEl.setLayoutX(450);simboloEl.setLayoutY(80);

        Label nombreEle=new Label("Hidrogeno");nombreEle.setFont(new Font("Arial",30));nombreEle.setStyle("-fx-text-fill:#0489d1");
        nombreEle.setLayoutX(430);nombreEle.setLayoutY(250);

        ListView listaPropiedades=new ListView();listaPropiedades.setLayoutX(430);listaPropiedades.setLayoutY(300);listaPropiedades.setPrefSize(200,200);

        pane.getChildren().addAll(lista,menuBar,textField,btnBuscar,simboloEl,nombreEle,listaPropiedades);
        leerArchivo("./src/Elementos.csv");

        //EVENTOOOSSS//
        lista.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (lista.getSelectionModel().getSelectedIndex()>-1){
                    int index=lista.getSelectionModel().getSelectedIndex();
                    System.out.println(renglones[index+2]);
                    String[] elemento=renglones[index+2].split(",");
                    simboloEl.setText(elemento[2]);
                    nombreEle.setText(elemento[1]);
                    listaPropiedades.getItems().clear();
                    String[] arrayProps=renglones[1].split(",");
                    for (int x=3;x<arrayProps.length;x++){
                        listaPropiedades.getItems().add(arrayProps[x]+","+elemento[x]);
                        x++;
                       // listaPropiedades.getItems().add(arrayProps[x]);

                    }
                }
            }
        });
        return pane;
    }
    public void leerArchivo(String ruta){
        File file=new File(ruta);
        try {
            BufferedReader br=new BufferedReader(new FileReader(file));
            String renglon;
            String todo="";
            while ((renglon= br.readLine()) !=null){
                todo=todo+"\n"+renglon;
            }
            renglones=todo.split("\n");
            for (int x=2;x< renglones.length;x++){
                String [] arrayRenglon=renglones[x].split(",");
                lista.getItems().add(arrayRenglon[0]+"-"+arrayRenglon[1]);
            }
            //textArea.setText(todo);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setContentText("No se pudo leer el archivo");
            alert.show();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
