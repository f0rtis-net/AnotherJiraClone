package rc.test.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rc.test.repository.EpycRepository;

@Service
@AllArgsConstructor
public class EpycService {
    private final EpycRepository epycRepository;
}
