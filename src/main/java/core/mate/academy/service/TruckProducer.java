package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        for (int i = 0; i < LIST_SIZE; i++) {
            truckList.add(new Truck());
        }
        return truckList;
    }
}
