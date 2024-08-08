package com.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.entity.Book;
import com.bookStore.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bRepository;

	public void save(Book b) {
		bRepository.save(b);
	}

	public List<Book> getAllBooks() {
		return bRepository.findAll();
	}

	public Book getBookById(int id) {
		return bRepository.findById(id).get();
	}

	public void deleteById(int id) {
		bRepository.deleteById(id);
	}
}
