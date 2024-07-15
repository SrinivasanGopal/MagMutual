package org.magmutual;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.magmutual.userinfos.UserNotFoundException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api")
class UserController {

  @Autowired
  public UserRepository repository;

  UserController(UserRepository repository) {
    this.repository = repository;
  }

//All Users
  @GetMapping("/api/users")
  public List<UserDetails> all() {
	  System.out.println("/n/n Inside the API Call");
    return repository.findAll();
  }
 
  // Single USER By ID
  
  @GetMapping("/api/users/{id}")
  Optional<UserDetails> findId(@PathVariable Long id) {
    
    return repository.findById(id);
    
 //  return ( repository.findById(id)).orElseThrow(() -> new UserNotFoundException(id));
  }
  
//All Users by Profession
  @GetMapping("/api/profession/{profession}")
  public List<UserDetails> userByProffession(@PathVariable String profession) {
	  System.out.println("/n/n Inside the Proffession Call");
    return repository.findByProfession(profession);
  }
  
//All Users by date Range
  @GetMapping("/api/users/between/{dates1}/{dates2}")
  public List<UserDetails> userByDateRange(@PathVariable String dates1,@PathVariable String dates2) {
	  //String[] range = dates.split(",");
    return repository.findByDate(dates1,dates2);
  }
  
// Users with Firstname starting
  @GetMapping("/api/users/fname/{fname}")
  public List<UserDetails> userByFirstName(@PathVariable String fname) {
    return repository.findByFirstname(fname);
  }

}
