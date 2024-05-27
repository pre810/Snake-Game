import javax.swing.*;

public class Game{
    public static void main(String[] args) {
        int boardWidth = 600;
        int boardHeight = 600;

        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(boardHeight,boardWidth);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Snakegame sg = new Snakegame(boardWidth, boardHeight);
        frame.add(sg);
        frame.pack();
        sg.requestFocus(); //the snake will listen to the key presses
    }

}