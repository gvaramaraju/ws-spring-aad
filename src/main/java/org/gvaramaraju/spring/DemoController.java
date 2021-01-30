package org.gvaramaraju.spring;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

   @GetMapping("spring")
   @ResponseBody
   @PreAuthorize("hasRole('ROLE_spring-aad-users')")
   public String group1() {
      return "Hello Group 1 Users!";
   }

   @GetMapping("group2")
   @ResponseBody
   @PreAuthorize("hasRole('ROLE_group2')")
   public String group2() {
      return "Hello Group 2 Users!";
   }

}