package com.example.sd18404.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserCustom {

//    @NotBlank
    private String name;

    @Override
    public String toString() {
        return "UserCustom{" +
                "name='" + name + '\'' +
                '}';
    }
}
