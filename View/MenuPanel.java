package View;

import javax.swing.JButton;
import javax.swing.JPanel;

import Controller.GameController;
import java.awt.event.*;

public class MenuPanel extends JPanel{

    private static final int TILE_SIZE = 64;
    private JButton smartButton;
    private JButton randomButton;

    public MenuPanel (int n, GameController mainGame)
    {
        this.setSize(n*TILE_SIZE, n*TILE_SIZE);
        this.setLayout(null);

        //TODO Input for n Size


        smartButton = new JButton("Smart Mode");
        smartButton.setName("Smart Mode");
        smartButton.setBounds(7*TILE_SIZE, 2*TILE_SIZE, 128, 48);
        smartButton.addMouseListener(gMouseAdapter(smartButton, mainGame));
        this.add(smartButton);

        randomButton = new JButton("Random Mode");
        randomButton.setName("Random Mode");
        randomButton.setBounds(7*TILE_SIZE, 4*TILE_SIZE, 128,48);
        randomButton.addMouseListener(gMouseAdapter(randomButton, mainGame));
        this.add(randomButton);
    }
    
    private MouseAdapter gMouseAdapter(JButton button, GameController mainGame)
    {
        return new MouseAdapter(){
            public void mouseClicked(MouseEvent evt) {
                if(button.getName().equals("Smart Mode"))
                    mainGame.initializeGame('S');
                else
                    mainGame.initializeGame('R');
            }
        };
    }
}
