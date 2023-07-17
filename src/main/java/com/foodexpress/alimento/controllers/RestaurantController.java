package com.foodexpress.alimento.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.foodexpress.alimento.models.Restaurant;
import com.foodexpress.alimento.services.RestaurantService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/restaurants")
public class RestaurantController {
		
	@Autowired
	RestaurantService restaurantService;
	
	@PostMapping("/register")// register new restaurant
	public Restaurant create(@Valid @RequestBody final Restaurant restaurant) {
		
		return restaurantService.saveRestaurant(restaurant);
	}
	 
	@GetMapping("{id}") // find Restaurant by ID
	public Restaurant find(@PathVariable("id") Long restaurantId) {
		return restaurantService.getRestaurantById(restaurantId);
	}

    @PostMapping("/login") // login for restaurant
   public Restaurant login(@RequestParam("rId") long rId , @RequestParam("rpassword") String password) {
	 return restaurantService.loginRestaurant(rId,password); //restaurantService.getrestaurantByEmail(restaurant);
    }
    
	 @PutMapping("restaurant/{id}")//update restaurant
	 public Restaurant update(@PathVariable("{rid}")long restaurantId,@RequestBody Restaurant restaurant) {
		 return restaurantService.updateRestaurant(restaurant, restaurantId);
	 } 
		@GetMapping()
		public List<Restaurant> getAllRestaurant() {
			return restaurantService.getAllRestaurants();
		}
	 
	 @DeleteMapping("restaurant/{id}")
	 public void delete(@PathVariable("{rid}")long restaurantId) {
		 restaurantService.deleteRestaurant(restaurantId);
		 System.out.println("Deleted");
	 }
	 
		@PostMapping("/{cid}/{newpassword}")
		public Restaurant changerestaurantPassword(@PathVariable("cid") long rid,@PathVariable("newpassword") String newpassword) {
			Restaurant r=restaurantService.getRestaurantById(rid);
			r.setrPassword(newpassword);
			restaurantService.updateRestaurant(r, rid);
			return r;
		}
	
	
		
}
