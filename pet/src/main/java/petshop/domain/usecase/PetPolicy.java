package petshop.domain.usecase;

import petshop.domain.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class PetPolicy{
    @Autowired
    PetRepository petRepository;

}