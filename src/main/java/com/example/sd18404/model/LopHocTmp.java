package com.example.sd18404.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class LopHocTmp {

    @Id
    private String className;

    private Integer siSo;

    @Override
    public String toString() {
        return "LopHocTmp{" +
                "className='" + className + '\'' +
                ", siSo=" + siSo +
                '}';
    }
}
