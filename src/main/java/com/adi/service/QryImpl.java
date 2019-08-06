package com.adi.service;
/*
 * @author: aditya10.kumar
 * @created: 05/08/19
 */

import com.adi.repo.UserRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QryImpl
{
    private UserRepo userRepo;
    @RequestMapping("/test")
     public void impl()
     {

         System.out.println(userRepo.findByEmailAddress("adi@qwerty.com"));
     }
}
