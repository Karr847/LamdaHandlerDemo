import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override //Override the start method in the application class
    public void start(Stage primaryStage){
        //Hold two button in an HBox
        HBox hBox=new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        Button btNew=new Button("New");
        Button btOpen=new Button("Open");
        Button btSave=new Button("Save");
        Button btPrint=new Button("Print");
        hBox.getChildren().addAll(btNew,btOpen,btSave,btPrint);
        //Create and register the handler
        btNew.setOnAction((ActionEvent e)->{
            System.out.println("Process New");
        });
        btOpen.setOnAction((ActionEvent)->{
            System.out.println("Process Open");
        });
        btSave.setOnAction((ActionEvent e)->{
            System.out.println("Process Save");
        });
        btPrint.setOnAction((ActionEvent e)->{
            System.out.println("Process Print");
        });
        //Create a place in the Stage
        Scene scene=new Scene(hBox,300,50);
        primaryStage.setTitle("LambdaHandlerDemo");//Set tittle
        primaryStage.setScene(scene);//Set scene in the stage
        primaryStage.show();//Display the stage

    }
}
