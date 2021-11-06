package org.gachi.dataBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataBaseDungeon {
    private List<Master> masterList = new ArrayList<>();
    private List<Slave> slaveList = new ArrayList<>();

    public Master getMaster() {
        return masterList.get(new Random().nextInt(masterList.size()));
    }

    public void addMaster(Master masterEntity) {
        this.masterList.add(masterEntity);
    }

    public void addAllMaster(List<Master> masterList) {
        this.masterList.addAll(masterList);
    }
}
