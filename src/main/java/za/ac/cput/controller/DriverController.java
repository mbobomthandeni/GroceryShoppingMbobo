package za.ac.cput.controller;

import za.ac.cput.domain.Driver;
import za.ac.cput.factory.DriverFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.service.impl.DriverService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/driver")
public class DriverController {

    @Autowired
    private DriverService driverService;

    @PostMapping("/create")
    public Driver create(@RequestBody Driver driver) {
        return driverService.create(driver);
    }
    @GetMapping("/read/{id}")
    public Driver read (@PathVariable String id){
        return driverService.read(id);
    }

    @PostMapping("/update")
        public Driver update (@RequestBody Driver driver){
            return driverService.update(driver);
        }

    @DeleteMapping ("delete/{id}")
        public boolean delete (@PathVariable String id) {
            return driverService.delete(id);
        }

    @GetMapping({"/getall"})
        public List<Driver> getall(){
        return driverService.getAll();
    }

}
