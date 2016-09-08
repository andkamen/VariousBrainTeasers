package game.gui;

import game.staticData.Constants;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class ScorePoints extends Pane {

    private Text text;
    private String scoreText;

    public ScorePoints(int score) {
        this.setText("Score: " + score);
    }

    public void changeScorePoints(int newScore) {
        this.scoreText = String.format("SCORE:  %d", newScore);
        this.setText(this.scoreText);
    }

    private void setText(String setScore) {
        this.text = new Text(setScore);
        this.text.setFont(Font.font(Constants.DEFAULT_BARS_FONT_STYLE, FontWeight.BOLD, Constants.GUI_DEFAULT_FONT_SIZE));
        this.text.setFill(Color.WHITE);
        this.text.setLayoutX(Constants.SCORE_POINTS_LAYOUT_X);
        this.text.setLayoutY(Constants.SCORE_POINTS_LAYOUT_Y);

        if (this.getChildren().size() > 0) {
            this.getChildren().remove(0, 1);
        }
        this.getChildren().add(this.text);
    }
}
