import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.effect.Effect;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.awt.*;


public class GameInterface
{

    private Object game;
    private Deck deck;

    private Stage currentStage;
    private Group lastGroup;

    final int X = 1920;
    final int Y = 1080;
    final int ScaleX = 88;
    final int ScaleY = 90;

    public GameInterface(Stage primaryStage)
    {
        this.currentStage = primaryStage;
        GameMenuScene();
    }

    private void GameMenuScene()
    {
        Group groupMenuScene = new Group();

        Image imageFont= new Image("Images/1.jpg", X, Y, false, false);
        ImageView viewFont = new ImageView(imageFont);
        groupMenuScene.getChildren().add(viewFont);

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
        startGame.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                GameStarterScene();
            }
        });

        nbPlayer.getChildren().addAll(titre, p2, p3, p4, startGame);
        groupMenuScene.getChildren().add(nbPlayer);


        Scene menuScene = new Scene(groupMenuScene, X, Y);
        currentStage.setScene(menuScene);
        currentStage.show();
    }

    private void GameStarterScene()
    {
        System.out.println("Bite");
        if (lastGroup != null)
        {
            Group firstGroup = new Group(lastGroup);
            Scene firstScene = new Scene(firstGroup);
            this.currentStage.setScene(firstScene);
            this.currentStage.show();
        }
        else
        {
            this.deck = new Deck();
            this.deck.initDeck();
            Group firstGroup = new Group();
            Button buttonDraw = new Button("Piocher");
            buttonDraw.setLayoutX(1600);
            buttonDraw.setLayoutY(500);
            buttonDraw.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    Carte drawed = deck.pioche();
                    if (drawed.img != null)
                    {
                        Group newGroup = new Group(lastGroup);
                        Image carte_image = new Image(drawed.img);
                        ImageView carte = new ImageView(carte_image);
                        carte.setLayoutX(1400);
                        carte.setLayoutY(500);
                        newGroup.getChildren().add(carte);
                        lastGroup = newGroup;
                        Scene newScene = new Scene(newGroup, X, Y);
                        currentStage.setScene(newScene);
                        currentStage.show();
                    }
                }
            });
            firstGroup.getChildren().add(buttonDraw);
            Image plateau_image = new Image("Images/Plateau.PNG");
            ImageView plateau_view = new ImageView(plateau_image);
            plateau_view.setLayoutX(100);
            plateau_view.setLayoutY(30);
            plateau_view.setScaleY(1.18);
            plateau_view.setScaleX(1.18);

            firstGroup.getChildren().add(plateau_view);
            lastGroup = firstGroup;
            Scene firstScene = new Scene(firstGroup, X , Y);
            firstGroup.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    int x = MouseInfo.getPointerInfo().getLocation().x;
                    int y = MouseInfo.getPointerInfo().getLocation().y;
                    System.out.println(x + " / " + y);
                    System.out.println(getCaseX(x - 90) + " / " + getCaseY(y - 40));
                    Group newGroup = new Group(lastGroup);
                    Rectangle rectangle = caseSelected(getCaseX(x - 90), getCaseY(y - 40));
                    if (rectangle != null)
                    {
                        newGroup.getChildren().add(rectangle);
                        Scene newScene = new Scene(newGroup);
                        currentStage.setScene(newScene);
                        currentStage.show();
                    }
                    else
                    {
                        GameStarterScene();
                    }
                }
            });
            this.currentStage.setScene(firstScene);
            this.currentStage.show();
        }
    }

    private int getCaseX(int x) {
        return (x / ScaleX);
    }

    private int getCaseY(int y) {
        return (y / ScaleY);
    }

    private Rectangle caseSelected(int x, int y)
    {
        if (x >= 10 || y >= 10)
        {
            return null;
        }
        Rectangle rectangle = new Rectangle(90, 90, Color.BLACK);
        rectangle.setOpacity(0.5);
        rectangle.setLayoutX(90 + x * ScaleX);
        rectangle.setLayoutY(45 + y * ScaleY);
        return rectangle;
    }


}
