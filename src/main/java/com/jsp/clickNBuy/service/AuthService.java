package com.jsp.clickNBuy.service;

import com.jsp.clickNBuy.dto.ResponseDto;
import com.jsp.clickNBuy.dto.UserDto;

public interface AuthService {

	ResponseDto register(UserDto userDto);

}
