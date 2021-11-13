package com.snm01234.springboard.repository;

import com.snm01234.springboard.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
