import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
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
        pane.setPrefSize(900,600);

        Menu menu=new Menu("Archivo");
        MenuItem open=new MenuItem("Abrir");
        MenuItem exit=new MenuItem("Salir");

        menu.getItems().addAll(open,exit);
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
        exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage.close();
            }
        });

        textArea=new TextArea();textArea.setPrefSize(200,200);
        textArea.setLayoutX(10);textArea.setLayoutY(50);

        lista= new ListView();lista.setPrefSize(500,400);lista.setLayoutX(200);lista.setLayoutY(90);

        pane.getChildren().addAll(lista,menuBar);
        leerArchivo("./src/Inicio.csv");

        return pane;
    }
    public void leerArchivo(String ruta){
        File file=new File(ruta);
        try {
            BufferedReader br=new BufferedReader(new FileReader(file));
            String renglon;
            String todo="";
            lista.getItems().clear();
            while ((renglon= br.readLine()) !=null){
                todo=todo+"\n"+renglon;
            }
            renglones=todo.split("\n");
            for (int x=2;x< renglones.length;x++){
                String [] arrayRenglon=renglones[x].split(",");
                lista.getItems().add(arrayRenglon[0]+","+arrayRenglon[1]);
            }
            textArea.setText(todo);

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
