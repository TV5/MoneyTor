/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pda;

import java.awt.Image;
import java.util.Random;

/**
 *
 * @author Trisha Lim
 */
public class Bag {
    
    int id;
    String color;
    Image image;

    public Bag(int id, String color, Image image) {
        this.id = id;
        this.color = color;
        this.image = image;
    }

    public Bag(int id) {
        this.id = id;
        this.setColor(id);
        this.setImage(id);
    }

    public static Bag generateRandomBag(){
        Random rand = new Random();
        int id= rand.nextInt(50) + 1;
        return new Bag(id);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    private void setColor(int id) {
       //set color of bag given id
    }

    private void setImage(int id) {
        //set image of bag given id
    }
    
}
