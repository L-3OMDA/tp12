package ma.cigma;

import ma.cigma.dao.IClientDao;
import ma.cigma.models.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
class MockClients implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(MockClients.class);
    @Autowired
    private IClientDao clientRepository;


    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        Client c1 = new Client("Omar");
        Client c2 = new Client("Said");
        Client c3 = new Client("Ahmed");
        Client c4 = new Client("Farah");
        clientRepository.save(c1);
        clientRepository.save(c2);
        clientRepository.save(c3);
        clientRepository.save(c4);
        clientRepository.findAll().forEach(c ->
                System.out.println
                        (c)
        );
    }

}
