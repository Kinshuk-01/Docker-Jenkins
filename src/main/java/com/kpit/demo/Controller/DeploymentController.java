package com.kpit.demo.Controller;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
 
 
@RestController
@RequestMapping("/Deployment")
public class DeploymentController {
   
    @GetMapping("/get")
    public String getInformation() {
        // Text displaying on main page
        return "WELCOME TO JAVA MAVEN PROJECT INTIGRATED WITH DOCKER!!\n MADE BY: KINSHUK CHAUHAN\n EID: 219639";
    }
}
 
 