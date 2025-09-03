package rc.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rc.test.repository.EpycRepository;

@Service
public class EpycService {
    private final EpycRepository epycRepository;

    @Autowired
    public EpycService(EpycRepository epycRepository) {
        this.epycRepository = epycRepository;
    }
}
