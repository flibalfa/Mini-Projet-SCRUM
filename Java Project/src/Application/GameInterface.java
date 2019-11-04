package Application;

import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;



public class GameInterface
{

    private Object game;

    private Group currentGroup;
    private Scene currentScene;
    private Stage currentStage;

    public GameInterface(Stage primaryStage)
    {
        this.currentStage = primaryStage;
        GameStaterScene(1000, 600);
    }

    private void GameStaterScene(int X, int Y)
    {
        this.currentGroup = new Group();
        Group nbPlayer = new Group();
        ToggleGroup selectionNbPlayer = new ToggleGroup();

        ToggleButton p2 = new ToggleButton("2");
        p2.setLayoutX(35*X/100);
        p2.setLayoutY(Y/2);
        p2.setToggleGroup(selectionNbPlayer);

        ToggleButton p3 = new ToggleButton("3");
        p3.setLayoutX(45*X/100);
        p3.setLayoutY(Y/2);
        p3.setToggleGroup(selectionNbPlayer);
        p3.setSelected(true);

        ToggleButton p4 = new ToggleButton("4");
        p4.setLayoutX(55*X/100);
        p4.setLayoutY(Y/2);
        p4.setToggleGroup(selectionNbPlayer);


        Label titre = new Label("Nombre de joueur : ");
        titre.setFont(Font.font(40));
        titre.setLayoutX(X/3);
        titre.setLayoutY(Y/3);
        titre.setAlignment(Pos.CENTER);

        nbPlayer.getChildren().addAll(titre, p2, p3, p4);

        currentGroup.getChildren().add(nbPlayer);
        currentScene = new Scene(currentGroup, X, Y, Color.LIGHTBLUE);
        currentStage.setScene(currentScene);
        currentStage.show();
    }


}
