package com.empresa.demo.service;

import java.util.ArrayList;
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

import com.empresa.demo.model.cargoper;
import com.empresa.demo.repositorio.CargoPerfilRepository;

@Service
public class CargoperfilService implements CargoPerfilRepository{
    
    @Autowired
    private CargoPerfilRepository cargoPerfilRepository;

    //------------------------------- Metodos modificados ---------------------------------------------
    //Metodo modificado
    @Override
    public List<cargoper> findAll() {
        
        
        return cargoPerfilRepository.findAll();
    }

    //Como es metodo propio no va con @Override
    public List<cargoper> findAllByIdCPE(int idCPE){
        //Creacion de listas
        List<cargoper> carpRespuesta = new ArrayList<>(); 
        List<cargoper> carp = cargoPerfilRepository.findAll();

        //Busqueda y separacion 
        for (int i=0 ; i<carp.size(); i++){
            //Pregunto por el valor buscado
            if(carp.get(i).getIdCPE() == idCPE){
                carpRespuesta.add(carp.get(i));
            }
        }
        return carpRespuesta;
    }

    //------------------------------- Metodos no modificados ---------------------------------------------
    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> ids) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAllInBatch() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAllInBatch(Iterable<cargoper> entities) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public <S extends cargoper> List<S> findAll(Example<S> example) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends cargoper> List<S> findAll(Example<S> example, Sort sort) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void flush() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public cargoper getById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public cargoper getOne(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public cargoper getReferenceById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends cargoper> List<S> saveAllAndFlush(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends cargoper> S saveAndFlush(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    

    @Override
    public List<cargoper> findAllById(Iterable<Integer> ids) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends cargoper> List<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void delete(cargoper entity) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAll(Iterable<? extends cargoper> entities) {
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
    public Optional<cargoper> findById(Integer id) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public <S extends cargoper> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<cargoper> findAll(Sort sort) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Page<cargoper> findAll(Pageable pageable) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends cargoper> long count(Example<S> example) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public <S extends cargoper> boolean exists(Example<S> example) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public <S extends cargoper> Page<S> findAll(Example<S> example, Pageable pageable) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends cargoper, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends cargoper> Optional<S> findOne(Example<S> example) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }
}
