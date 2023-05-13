package cl.iacc.rodrigoespinozatarea7.service;

import cl.iacc.rodrigoespinozatarea7.entity.Laptop;

import java.util.List;

public interface LaptopService {
    Laptop create(Laptop laptop);
    Laptop findById(String serial);
    List<Laptop> findAll();
    void remove(String serial);
}
