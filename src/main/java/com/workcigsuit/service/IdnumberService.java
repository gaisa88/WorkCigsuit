package com.workcigsuit.service;

import com.workcigsuit.model.IdNumber;
import com.workcigsuit.repository.IdNumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class IdnumberService {

    @Autowired
    private IdNumberRepository idNumberRepository;


    public IdNumber saveClient(IdNumber idnumber) { // метод для создания и сохранения объекта в таблицу
        idNumberRepository.save(idnumber);
        return idnumber;
    }

    public List<IdNumber> findAll() { return idNumberRepository.findAll();
    }

    public List<IdNumber> findAllByName(String Number) {
        return idNumberRepository.findAllByName(Number);
    }

    public Optional<IdNumber> findClientById(long Id) { // опционально возвращаем объект, для возможности работы с ним
        return idNumberRepository.findById(Id);
    }


    public void deleteClientId(Long id){
        idNumberRepository.deleteById(id);
    }


}
