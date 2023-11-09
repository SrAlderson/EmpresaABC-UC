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

import com.empresa.demo.model.usuario;
import com.empresa.demo.repositorio.UsuarioRepository;

@Service
public class UsuarioService implements UsuarioRepository{
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    //------------------------------- Metodos modificados ---------------------------------------------

    //Metodo Modificado | Sirve para listar los datos registrados
    @Override
    public List<usuario> findAll() {
        
        return usuarioRepository.findAll();
    }
    
     @Override
    public <S extends usuario> S save(S entity) {
        
        return usuarioRepository.save(entity);
    }

    //Metodo modificado | Sirve para hacer la eliminacion de un dato
    @Override
    public void delete(usuario entity) {
        usuarioRepository.delete(entity);
        
    }

    //Metodo modificado | Sirve para hacer una eliminacion por ID
    @Override
    public void deleteById(Integer id) {
        usuarioRepository.deleteAllById(null);        
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
    public void deleteAllInBatch(Iterable<usuario> entities) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public <S extends usuario> List<S> findAll(Example<S> example) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends usuario> List<S> findAll(Example<S> example, Sort sort) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void flush() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public usuario getById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public usuario getOne(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public usuario getReferenceById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends usuario> List<S> saveAllAndFlush(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends usuario> S saveAndFlush(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    

    @Override
    public List<usuario> findAllById(Iterable<Integer> ids) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends usuario> List<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }
    

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAll(Iterable<? extends usuario> entities) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> ids) {
        // TODO Auto-generated method stub
        
    }

    

    @Override
    public boolean existsById(Integer id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Optional<usuario> findById(Integer id) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

   

    @Override
    public List<usuario> findAll(Sort sort) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Page<usuario> findAll(Pageable pageable) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends usuario> long count(Example<S> example) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public <S extends usuario> boolean exists(Example<S> example) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public <S extends usuario> Page<S> findAll(Example<S> example, Pageable pageable) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends usuario, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends usuario> Optional<S> findOne(Example<S> example) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }
}
