package com.snm01234.springboard.service;

import com.snm01234.springboard.model.Board;
import com.snm01234.springboard.model.User;
import com.snm01234.springboard.repository.BoardRepository;
import com.snm01234.springboard.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private UserRepository userRepository;

    public Board save(String username, Board board) {
        User user = userRepository.findByUsername(username);
        board.setUser(user);
        return boardRepository.save(board);
    }
}
