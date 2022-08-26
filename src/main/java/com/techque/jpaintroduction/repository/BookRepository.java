package com.techque.jpaintroduction.repository;

import com.techque.jpaintroduction.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
