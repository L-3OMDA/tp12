package ma.cigma.presentation;

import ma.cigma.models.Client;
import ma.cigma.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    IService service;

    @GetMapping("/all")
    public List<Client> getAll() {
        // TODO Auto-generated method stub
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Client> getOne(@PathVariable("id") long id) {
        return service.getOne(id);
    }

    @PostMapping("/create")
    public void save(@RequestBody Client client) {
        service.save(client);
    }

    @PutMapping("/update")
    public void update(@RequestBody Client client) {
        service.update(client);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        service.delete(id);
    }

}
