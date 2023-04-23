package com.example.sundayTest.service;

import com.example.sundayTest.model.Restaurant;
import com.example.sundayTest.repository.RestaurantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    RestaurantDao restaurantDao;

    public List<Restaurant> getAllNames(){
        return restaurantDao.getRestaurantFromDataSource();
    }

    public String addRestaurant(Restaurant res){
        boolean ans=restaurantDao.save(res);
        if(ans){
            return "Restaurant added successfully!!!!!";
        }else{
            return "Failed!!!!!....Restaurant Not added !!!...Database error";
        }
    }


    public List<Restaurant> getNameByAddress(String name)
    {
        List<Restaurant> ListRightNow =  restaurantDao.getRestaurantFromDataSource();

        List<Restaurant> ListBasedOnAddress = new ArrayList<>();

        for(Restaurant res : ListRightNow)
        {
            if(res.getRestaurantName().equals(name))
            {
                ListBasedOnAddress.add(res);
            }
        }
        return ListBasedOnAddress;

    }

    public Restaurant getRestaurent(String name) {
        List<Restaurant> ListRightNow =  restaurantDao.getRestaurantFromDataSource();
        for(Restaurant todo:ListRightNow){
            if(todo.getRestaurantName().equals(name)){
                return todo;
            }
        }
        return null;
    }

    public String removeRes(String name) {
        boolean deleteResponse = false;
        String status;
        if(name!=null){
            List<Restaurant> ListRightNow =  restaurantDao.getRestaurantFromDataSource();
            for(Restaurant res:ListRightNow){
                if(res.getRestaurantName().equals(name)){
                    deleteResponse=restaurantDao.remove(res);
                    if(deleteResponse){
                        status="Restaurant was deleted !!!!";
                    }else{
                        status="Restaurant was not deleted !!!!...Database error";
                    }
                    return status;
                }
                return "name not exist!!!";
            }
        }

        return "Invalid Name ... Cannot accept Null";
    }


    public String updateRes(String name, int numbersOfVarity) {

        boolean updateStatus =  restaurantDao.update(name,numbersOfVarity);
        if(updateStatus){
            return "Updated!!";
        }else{
            return "Not Updated !!!!!!!";
        }
    }
}
