package ma.cigma.service;

import ma.cigma.dao.IClientDao;
import ma.cigma.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements IService{
    @Autowired
    IClientDao clientDao;

    @Override
    public List<Client> getAll() {
       return (List<Client>) clientDao.findAll();
    }

    public Optional<Client> getOne(long id) {
        Optional<Client> c = clientDao.findById(id);
        return c;
    }

    @Override
    public void save(Client client) {
        clientDao.save(client);
    }

    @Override
    public void update(Client client) {
        Optional<Client> c = clientDao.findById(client.getId());
        if(c != null) {
            c.get().setName(client.getName());
        }
    }

    @Override
    public void delete(long id) {
        clientDao.deleteById(id);
    }
}
