package com.bookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookStore.entity.MyBookList;

public interface MyBookRepository extends JpaRepository<MyBookList, Integer> {

}
