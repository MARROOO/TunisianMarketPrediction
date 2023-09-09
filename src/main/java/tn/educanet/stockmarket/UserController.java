package tn.educanet.stockmarket;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import tn.educanet.stockmarket.persistence.User;
import tn.educanet.stockmarket.service.UserService;

@Controller
public class UserController {
	String name;
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/users", method=RequestMethod.GET)
    public String init(Locale locale, Model model) {
        model.addAttribute("msg", "Please Enter Your Login Details");
        return "user";
    }
    
    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public String registerUser(@RequestParam("name") String name,
            @RequestParam("surname") String surname,
            @RequestParam("email") String email,
            @RequestParam("age") int age){
        userService.createUser(name, surname, email,age);
               return "home";
               
    }
    // Add other methods for retrieving, updating, and deleting users

    @GetMapping(value="usersList")
    public String getUsersList(Model model) {
    	List<User> users=userService.getUsers();
    	model.addAttribute("users",users);
    	return "usersList";
    }
   
}