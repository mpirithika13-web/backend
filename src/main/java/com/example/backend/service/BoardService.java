package com.example.backend.service;
import java.util.*;
import com.example.backend.model.Board;
import com.example.backend.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BoardService {
 @Autowired
private BoardRepository boardRepository;
    public List<Board> getBoards() {
        return boardRepository.findAll();
    }

    // public Board createBoard(Board board) {
    //     return boardRepository.save(board);
    // }

//     public Board updateBoard(Long id, Board board) {
// Board oldBoard = boardRepository
//                         .findById(id)
//                         .orElse(null);

//         if (oldBoard != null) {
//             oldBoard.setTitle(
//                     board.getTitle());

//             return boardRepository
//                     .save(oldBoard);
//         }

//         return null;
//     }

    // public void deleteBoard(Long id) {
    //     boardRepository.deleteById(id);
    // }
        public Board addBoard(Board board){
        return boardRepository.save(board);
    }
    public void deleteBoard(Long id){
        boardRepository.deleteById(id);
    }
}
