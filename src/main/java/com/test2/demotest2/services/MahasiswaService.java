package com.test2.demotest2.services;

import com.test2.demotest2.model.Mahasiswa;

import java.util.List;

public interface MahasiswaService {

    List <Mahasiswa> listMahasiswa();
    Mahasiswa saveOrUpdate(Mahasiswa mahasiswa);

    Mahasiswa getIdMahasiswa(Integer id);
    void hapus (Integer id);

}
