import Model.Direction;
import Model.Grid;
import Model.RandomMiner;
import Model.SmartMiner;
import View.MainFrame;

public class Driver {
    public static void main (String[] args) {
        Grid map = new Grid(8, false);
        /* COMMENT OUT THE NEXT 4 LINES IF GRID RANDOMIZE = TRUE */
        map.addGold(4, 3);
        map.addBeacon(5, 5);
        map.addPit(0, 4);
        map.addPit(5, 2);
        
        map.printGrid();
        System.out.println("\n");

        //trial
        MainFrame game = new MainFrame(8, map.getMap(), Direction.NORTH);

        String mode = "smart";

        if(mode == "smart"){
            SmartMiner miner = new SmartMiner(map);
            miner.startSearch();
        }
        else if (mode == "random"){
            RandomMiner miner = new RandomMiner(map);
            miner.startSearch();
        }
    }
}