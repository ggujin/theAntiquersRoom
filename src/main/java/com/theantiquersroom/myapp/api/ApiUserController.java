package com.theantiquersroom.myapp.api;

import com.theantiquersroom.myapp.domain.UserDTO;
import com.theantiquersroom.myapp.service.UserService;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@NoArgsConstructor

@RequestMapping("/api/users")
@RestController
public class ApiUserController {

    @Setter(onMethod_= {@Autowired})
    private UserService userService;

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public void register(UserDTO user) {
        this.userService.registerUser(user);
    }

    // Http Response code
    // 200 -> 성공
    // 201 -> 어떤 리소스가 생성되었다
    // 400 -> 잘못된 요청
    // 401 -> 인증 오류
    // 500 -> 서버 내부 오류
}
