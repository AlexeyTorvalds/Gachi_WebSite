package org.gachi.dataBase;

public class Master implements Suck {
    private final String pathToImage;
    private Dick dick;

    public Master(String pathToImage) {
        this.pathToImage = "image/" + pathToImage; //for this it would be worth fisting
    }

    public String getPathToImage() {
        return pathToImage;
    }

    @Override
    public Semens suckSomeDick(Slave slave) {
        throw new RuntimeException("Oh, fuck you leather mean");
    }
}
