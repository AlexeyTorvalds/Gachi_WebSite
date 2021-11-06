package org.gachi.dataBase;

public class Bucks {
    private int value;

    public Bucks(int value) {
        this.value = value;
    }

    public void addBucks(Bucks bucks) {
        if (bucks.value < 300) {
            throw new RuntimeException("Fuck you");
        } else {
            return;
        }
    }

    @Override
    public String toString() {
        return "$ " + value;
    }
}
