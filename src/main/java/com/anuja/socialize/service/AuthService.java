package com.anuja.socialize.service;

import com.anuja.socialize.payload.LoginDto;
import com.anuja.socialize.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);
}
