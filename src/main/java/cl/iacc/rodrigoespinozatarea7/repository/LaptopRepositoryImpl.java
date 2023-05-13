package cl.iacc.rodrigoespinozatarea7.repository;

import cl.iacc.rodrigoespinozatarea7.mocks.LaptopData;
import cl.iacc.rodrigoespinozatarea7.entity.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LaptopRepositoryImpl implements NotebookRepository {

    final LaptopData laptopData;

    @Autowired
    public LaptopRepositoryImpl(LaptopData laptopData) {
        this.laptopData = laptopData;
    }

    @Override
    public Laptop create(Laptop laptop) {
        return laptopData.add(laptop);
    }

    @Override
    public Laptop findById(String serial) {
        return laptopData.get(serial);
    }

    @Override
    public List<Laptop> findAll() {
        return laptopData.getAll();
    }

    @Override
    public void remove(String serial) {
        laptopData.delete(serial);
    }
}
