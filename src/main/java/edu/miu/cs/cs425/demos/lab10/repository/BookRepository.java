package edu.miu.cs.cs425.demos.lab10.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.miu.cs.cs425.demos.lab10.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

}
