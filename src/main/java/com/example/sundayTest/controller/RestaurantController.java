package com.example.sundayTest.controller;

import com.example.sundayTest.model.Restaurant;
import com.example.sundayTest.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @GetMapping(value="/getAll")
    public List<Restaurant> getAll(){
        return restaurantService.getAllNames();
    }

    @GetMapping(value = "/getResByAddress")//request param
    public List<Restaurant> getTodosByStatus(@RequestParam String name)
    {
        return restaurantService.getNameByAddress(name);
    }

    @RequestMapping(value="/getByName/{RestorentName}",method = RequestMethod.GET)
    public Restaurant getByName(@PathVariable String name){
        return restaurantService.getRestaurent(name);
    }

    @PostMapping(value="/addRestaurant")
    public String addRestaurant(@RequestBody Restaurant res){
        return restaurantService.addRestaurant(res);
    }


    @DeleteMapping(value = "/deleteByName/{name}")
    public String deleteTodoById(@PathVariable String name)
    {
        return restaurantService.removeRes(name);
    }


    @PutMapping(value = "/updateByName/{name}/{numbers_Of_varity}")
    public String updateTodoStatusById(@PathVariable String name, @PathVariable int numbers_Of_varity)
    {
        return restaurantService.updateRes(name,numbers_Of_varity);
    }


}
