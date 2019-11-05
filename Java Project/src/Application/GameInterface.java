package Application;

import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
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
        GameMenuScene(1920, 1080);
    }

    private void GameMenuScene(int X, int Y)
    {
        this.currentGroup = new Group();

        Image imageFont= new Image("Images/1.jpg", X, Y, false, false);
        ImageView viewFont = new ImageView(imageFont);
        currentGroup.getChildren().add(viewFont);

        Image imageButton = new Image("Images/Carrot.jpg", 100, 60, false, false);
        final ImageView viewButton = new ImageView();

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


        Label titre = new Label("Nombre de joueurs : ");
        titre.setFont(Font.font(40));
        titre.setLayoutX(X/3);
        titre.setLayoutY(Y/3);
        titre.setAlignment(Pos.CENTER);

        Button startGame = new Button("Demarer la partie ");
        startGame.setFont(Font.font(40));
        startGame.setLayoutX(X/3);
        startGame.setLayoutY(2*Y/3);

        nbPlayer.getChildren().addAll(titre, p2, p3, p4, startGame);
        currentGroup.getChildren().add(nbPlayer);


        currentScene = new Scene(currentGroup, X, Y);
        currentStage.setScene(currentScene);
        currentStage.show();
    }

    private void GameStarterScene(int X, int Y)
    {

        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; i < 10; i++)
            {
                Button button = new Button("Case " + i + " / " + j);
            }
        }
    }
}
