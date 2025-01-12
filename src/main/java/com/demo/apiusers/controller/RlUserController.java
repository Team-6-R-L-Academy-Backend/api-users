package com.demo.apiusers.controller;
import lombok.RequiredArgsConstructor;
import com.demo.apiusers.dtos.request.UserRequestDTO;
import com.demo.apiusers.dtos.response.ResponseTokenDTO;
import com.demo.apiusers.service.RlUserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Validated
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class RlUserController {

   private final RlUserService rlUserService;

   @PostMapping("/auth/login")
   public ResponseTokenDTO login(@Valid @RequestBody UserRequestDTO request) {return rlUserService.login(request);
   }

   @PostMapping("/auth/register")
   public ResponseTokenDTO register(@Valid @RequestBody UserRequestDTO request) {
      return rlUserService.register(request);
   }
}