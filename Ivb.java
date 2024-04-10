//created by Heaven Williams
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ivb extends JPanel{
    public int x;
    public int y;
    public int width;
    public int height;

    public int cells;
    public JPanel bg;
    public int cellWidth;
    public int borderCellWidth;
    public int maxCells;

    public int barMaxWidth;
    public boolean showCells;
    Ivb(int x, int y, int width, int height, int cells, JFrame frame, int thickness, boolean showcells){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.showCells = showcells;
        this.cells = cells;
        this.maxCells = cells;
        setBounds(x, y, width, height);

        setLayout(null);
        setBorder(BorderFactory.createLineBorder(Color.black, thickness));
         bg = new JPanel();
        
        
        
        bg.setBounds(thickness, thickness, this.width - thickness * 2, this.height - thickness * 2);
        bg.setBackground(Color.green);
        bg.setOpaque(true);
        this.barMaxWidth = bg.getWidth();
        //the numebr of cells ake things in a tank
        cellWidth = barMaxWidth / maxCells;
        borderCellWidth = this.width / maxCells;
        System.out.println("There are " + cells + " cells and they will each have a width of " + cellWidth);
        System.out.println("The maximum width of the bar is "+ barMaxWidth);


        
        this.add(bg);
        frame.add(this);

            
    }
    Ivb(int x, int y, int width, int height, int cells, JPanel panel, int thickness, boolean showcells){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.showCells = showcells;
        this.cells = cells;
        this.maxCells = cells;
        setBounds(x, y, width, height);

        setLayout(null);
        setBorder(BorderFactory.createLineBorder(Color.black, thickness));
         bg = new JPanel();
        
        
        
        bg.setBounds(thickness, thickness, this.width - thickness * 2, this.height - thickness * 2);
        bg.setBackground(Color.green);
        bg.setOpaque(true);
        this.barMaxWidth = bg.getWidth();
        //the numebr of cells ake things in a tank
        cellWidth = barMaxWidth / maxCells;
        borderCellWidth = this.width / maxCells;
        System.out.println("There are " + cells + " cells and they will each have a width of " + cellWidth);
        System.out.println("The maximum width of the bar is "+ barMaxWidth);


        
        this.add(bg);
        panel.add(this);

            
    }
    public void paint(Graphics g){
        super.paint(g);
        if(showCells){
            for(int i = 0; i < maxCells; i++){
                //draw a line where each cell is supposed to go
                //to caluclate the x position of each cell take the width for accountability
                g.drawLine(i * borderCellWidth , 0, i * borderCellWidth, this.height);
                
            }
        }
    }


    public void subtractFromBar(int takeAway){
        
        int cellsLeft = cells - takeAway;
        if(cellsLeft <= 0){
            //bar is empty
            cells = 0;
            bg.setSize(0, bg.getHeight());
            
            System.out.println(cells + " cells.");
        }else if(cellsLeft > 0){
            bg.setSize(bg.getWidth() - cellWidth * takeAway, bg.getHeight());
            cells -= takeAway;
            System.out.println(cells + " cells left");
        }

        
    }

    public void addToBar(int giveAway){
        int totalCells = cells + giveAway;
        //total cells is the outcome of how many cells there will be if you add the cells you want to the bar
        int beforeCells = cells;
            //if total cells os greater than or equal to the max cells then set the number of cells to the max amount and set the width of the bar to the max bar width
        if(totalCells >= maxCells){
            System.out.println("bar maxed out!");
            cells = maxCells;

            bg.setSize(barMaxWidth, bg.getHeight());
            System.out.println();

            System.out.println(maxCells - beforeCells + " cells addedto the bar");
        }else if(totalCells < maxCells && totalCells > 0){
            cells =+ giveAway;
            bg.setSize(bg.getWidth() + cellWidth * giveAway,bg.getHeight());
            System.out.println("added " + giveAway + " cells to bar.");
        }
    }
}