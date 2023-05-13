package cl.iacc.rodrigoespinozatarea7.mocks;

import cl.iacc.rodrigoespinozatarea7.entity.Laptop;

import java.util.ArrayList;
import java.util.List;

public class LaptopData {
    private final List<Laptop> laptopList;

    public LaptopData() {
        this.laptopList = new ArrayList<>();
    }

    public Laptop add(Laptop laptop) {
        laptopList.add(laptop);
        return laptop;
    }

    @SuppressWarnings("OptionalGetWithoutIsPresent")
    public Laptop get(String serial) {
        return laptopList.stream().filter(laptop -> laptop.getSerial().equalsIgnoreCase(serial)).findFirst().get();
    }

    public List<Laptop> getAll() {
        return laptopList;
    }

    public void delete(String serial) {
        this.laptopList.remove(get(serial));
    }
}
