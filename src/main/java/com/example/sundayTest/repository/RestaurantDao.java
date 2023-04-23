package com.example.sundayTest.repository;

import com.example.sundayTest.model.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RestaurantDao {

    private List<Restaurant> List;

    public RestaurantDao()
    {
        List = new ArrayList<>() ;
        List.add(new Restaurant("Taj","mumbai","Non-veg",10,5,"9145392101"));
    }

    public List<Restaurant> getRestaurantFromDataSource(){
            return List;
    }

    public boolean save(Restaurant res)
    {
        List.add(res);
        return true;
    }

    public boolean remove(Restaurant todo)
    {
        List.remove(todo);
        return true;
    }

//
    public boolean update(String RestorentName, int numbers_of_varity)
    {
        boolean updateStatus = false;
        for(Restaurant res : List)
        {
            if(res.getRestaurantName().equals(RestorentName))
            {
//                remove(res);

                res.setNumbers_Of_Varity(numbers_of_varity);

//                save(res);

                return true;
            }

        }
        return false;
    }


}


