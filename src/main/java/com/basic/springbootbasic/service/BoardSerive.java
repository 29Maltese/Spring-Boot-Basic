package com.basic.springbootbasic.service;


import com.basic.springbootbasic.domain.Board;
import com.basic.springbootbasic.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardSerive {

    @Autowired
    private BoardRepository boardRepository; //NOTE : java 경우 = new boardRepository 를 해야되지만 autowired를 이용해서 생략한다

    public void BoardWrite(Board board){

        boardRepository.save(board); // NOTE : insert
    };

    public List<Board> boardList(){
        return boardRepository.findAll();
    }
}
