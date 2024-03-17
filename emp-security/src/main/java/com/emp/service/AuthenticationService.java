package com.emp.service;


import com.emp.dao.JwtAuthenticationResponse;
import com.emp.dao.SignUpRequest;
import com.emp.dao.SigninRequest;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}
