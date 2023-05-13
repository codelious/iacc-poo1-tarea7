package cl.iacc.rodrigoespinozatarea7.service;

import cl.iacc.rodrigoespinozatarea7.entity.Laptop;
import cl.iacc.rodrigoespinozatarea7.repository.NotebookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopServiceImpl implements LaptopService {

    final NotebookRepository notebookRepository;

    @Autowired
    public LaptopServiceImpl(NotebookRepository notebookRepository) {
        this.notebookRepository = notebookRepository;
    }

    @Override
    public Laptop create(Laptop laptop) {
        return notebookRepository.create(laptop);
    }

    @Override
    public Laptop findById(String serial) {
        return notebookRepository.findById(serial);
    }

    @Override
    public List<Laptop> findAll() {
        return notebookRepository.findAll();
    }

    @Override
    public void remove(String serial) {
        notebookRepository.remove(serial);
    }
}
