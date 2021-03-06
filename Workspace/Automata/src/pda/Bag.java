/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pda;

import javax.swing.ImageIcon;

/**
 *
 * @author Trisha Lim
 */
public class Bag {
    
    int id;
    int index;
    String color;
    ImageIcon image;

    public Bag(int id, String color, ImageIcon image) {
        this.id = id;
        this.color = color;
        this.image = image;
    }

    public Bag(int id, int index) {
        this.id = id;
        this.index = index;
        this.setColor();
        this.setImage();
    }
    

/*    public static Bag generateRandomBag(){
        Random rand = new Random();
        int id= rand.nextInt(50) + 1;
        return new Bag(id);
    }*/
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage() {
        switch(id){
            case 1: image = new ImageIcon(getClass().getResource("/pda/res/blo.png")); break;
            case 2: image = new ImageIcon(getClass().getResource("/pda/res/fenk.png")); break;
            case 3: image = new ImageIcon(getClass().getResource("/pda/res/gren.png")); break;
        }
    }

    private void setColor() {
       switch(id) {
           case 1: color = "blue"; break;
           case 2: color = "pink"; break;
           case 3: color = "green"; break;
       }
    }
    
}
