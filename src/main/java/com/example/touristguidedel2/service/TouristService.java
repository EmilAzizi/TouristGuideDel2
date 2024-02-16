package com.example.touristguidedel2.service;

import com.example.touristguidedel2.model.TouristAttraction;
import com.example.touristguidedel2.repository.TouristRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristService {
    TouristRepository touristRepository;

    public TouristService(){
        this.touristRepository = new TouristRepository();
    }
    public List<TouristAttraction> getAttractions(){
        touristRepository.getTouristAttractions();
        List<TouristAttraction> touristAttractions = touristRepository.getTouristAttractions();
        return touristAttractions;
    }

    public List<TouristAttraction> getAll(){
        return touristRepository.getAll();
    }

    public TouristAttraction getTouristAttraction(int id){
        return touristRepository.getTouristAttraction(id);
    }

    public TouristAttraction postNewAttraction(TouristAttraction touristAttraction){
        touristRepository.addAttractions(touristAttraction);
        return touristAttraction;
    }

//    public TouristAttraction putTouristAttraction(TouristAttraction touristAttraction){
//        TouristAttraction returnTouristAttraction = touristRepository.
//    }
}
