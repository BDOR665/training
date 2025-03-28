package com.javatraining.javaintermediate.abstractandinterface;

public class Main {

    public static void main(String[] args) {

        Shapeabstract[] shapeabstracts = new Shapeabstract[3];
        Shapeinterface[] shapeinterfaces = new Shapeinterface[3];

        shapeabstracts[0] = new Circle("원", 5);
        shapeabstracts[1] = new Rectangle("사각형", 4, 6);
        shapeabstracts[2] = new Triangle("삼각형", 3, 7);

        shapeinterfaces[0] = (Shapeinterface) shapeabstracts[0];
        shapeinterfaces[1] = (Shapeinterface) shapeabstracts[1];
        shapeinterfaces[2] = (Shapeinterface) shapeabstracts[2];

        for(int i =0; i < shapeabstracts.length; i++){
            System.out.println(shapeabstracts[i].getType() + "의 면적 : " + shapeinterfaces[i].shapeExtent());
        }




    }
}
