package by.pvt.core.repository.interfaceRepository;

import by.pvt.core.domain.shopDomain.AKB;
import java.util.List;

public interface AKBInterface
    {

    void addAKB(AKB akb);

    List<AKB> getAllAKB();

    AKB findById(Long akbID);

    void updateAKB (AKB akb);

    void delAKB(long id);
    }
