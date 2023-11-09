package com.empresa.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.empresa.demo.model.cargo;
import com.empresa.demo.repositorio.CargoRepository;

@Service
public class CargoService implements CargoRepository {
    
    @Autowired
    private CargoRepository cargoRepository;

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> ids) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAllInBatch() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAllInBatch(Iterable<cargo> entities) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public <S extends cargo> List<S> findAll(Example<S> example) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends cargo> List<S> findAll(Example<S> example, Sort sort) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void flush() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public cargo getById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public cargo getOne(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public cargo getReferenceById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends cargo> List<S> saveAllAndFlush(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends cargo> S saveAndFlush(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    //Metodo Modificado
    @Override
    public List<cargo> findAll() {
        
        return cargoRepository.findAll();
    }

    @Override
    public List<cargo> findAllById(Iterable<Integer> ids) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends cargo> List<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void delete(cargo entity) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAll(Iterable<? extends cargo> entities) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> ids) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteById(Integer id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean existsById(Integer id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Optional<cargo> findById(Integer id) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public <S extends cargo> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<cargo> findAll(Sort sort) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Page<cargo> findAll(Pageable pageable) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends cargo> long count(Example<S> example) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public <S extends cargo> boolean exists(Example<S> example) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public <S extends cargo> Page<S> findAll(Example<S> example, Pageable pageable) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends cargo, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends cargo> Optional<S> findOne(Example<S> example) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }
}
