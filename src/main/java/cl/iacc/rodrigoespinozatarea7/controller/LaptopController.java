package cl.iacc.rodrigoespinozatarea7.controller;

import cl.iacc.rodrigoespinozatarea7.entity.Laptop;
import cl.iacc.rodrigoespinozatarea7.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/laptop")
public class LaptopController {

    final LaptopService laptopService;

    @Autowired
    public LaptopController(LaptopService laptopService) {
        this.laptopService = laptopService;
    }

    @PostMapping
    public ResponseEntity<Laptop> create(@RequestBody Laptop laptop) {
        return new ResponseEntity<>(laptopService.create(laptop), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Laptop> getById(@PathVariable String id) {
        return new ResponseEntity<>(laptopService.findById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Laptop>> getAll() {
        return new ResponseEntity<>(laptopService.findAll(), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remove(@PathVariable String id) {
        laptopService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
