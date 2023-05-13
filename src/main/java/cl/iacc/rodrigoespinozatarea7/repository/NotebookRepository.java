package cl.iacc.rodrigoespinozatarea7.repository;

import cl.iacc.rodrigoespinozatarea7.entity.Laptop;

import java.util.List;

public interface NotebookRepository {

    Laptop create(Laptop laptop);
    Laptop findById(String serial);
    List<Laptop> findAll();
    void remove(String serial);
}
