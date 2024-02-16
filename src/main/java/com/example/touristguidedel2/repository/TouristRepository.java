package com.example.touristguidedel2.repository;

import com.example.touristguidedel2.model.TouristAttraction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {
    private List<TouristAttraction> touristAttractions;

    public TouristRepository(){
        touristAttractions = new ArrayList<>();
        TouristAttraction touristAttraction = new TouristAttraction("Tivoli Tårnet", "Et højt tårn med en verticalt drop");
        TouristAttraction touristAttraction2 = new TouristAttraction("Djævlen", "En rutschebane der indeholder loop og drops");
        touristAttractions.add(touristAttraction);
        touristAttractions.add(touristAttraction2);
    }

    public List<TouristAttraction> getAll(){
        return touristAttractions;
    }

    public TouristAttraction addAttractions(TouristAttraction touristAttraction){
        touristAttraction = new TouristAttraction("Rutchebanen", "En gammel rutchebane der er perfekt til familien");
        touristAttractions.add(touristAttraction);
        return touristAttraction;
    }

    public List<TouristAttraction> getTouristAttractions(){
        return touristAttractions;
    }

    public TouristAttraction getTouristAttraction(int id){
        return touristAttractions.get(id);
    }
}
