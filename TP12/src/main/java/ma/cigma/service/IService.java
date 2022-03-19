package ma.cigma.service;

import ma.cigma.models.Client;

import java.util.List;
import java.util.Optional;

public interface IService {
    List<Client> getAll();
    Optional<Client> getOne(long id);
    void save(Client client);
    void update(Client client);
    void delete(long id);
}
