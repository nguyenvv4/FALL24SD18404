package com.example.sd18404.repository;

import com.example.sd18404.model.LopHocTmp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LopHocTmpRepo extends JpaRepository<LopHocTmp, String> {

    @Query(value = "SELECT l.class_name, count(*) as 'si_so' \n" +
            "from lop_hoc l inner join sinh_vien s on l.id = s.lop_hoc\n" +
            "GROUP BY l.class_name", nativeQuery = true)
    List<LopHocTmp> getList();
}
