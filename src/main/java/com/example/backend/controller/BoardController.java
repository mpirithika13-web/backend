package com.example.backend.controller;
import com.example.backend.model.Board;
import com.example.backend.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.*;

@RestController
@RequestMapping("/boards")
@CrossOrigin(origins = "*")
public class BoardController {
    @Autowired
    private BoardService boardService;
   @GetMapping("/get")
   public List<Board> getBoards() {
    return boardService.getBoards();
    }

//     @PostMapping
//     public Board createBoard( @RequestBody Board board) {

//         return boardService.createBoard(board);
//     }

//     @PutMapping("/{id}")
//     public Board updateBoard(
//             @PathVariable Long id,
//             @RequestBody Board board) {

//         return boardService.updateBoard( id, board);
//     }

//     @DeleteMapping("/{id}")
//     public String deleteBoard( @PathVariable Long id) {

//         boardService.deleteBoard(id);
//         return "Board Deleted";
//     }

@PostMapping
public Board addBoard(@RequestBody Board board){
 return boardService.addBoard(board);
}
@DeleteMapping("/{id}")
public String deleteBoard(@PathVariable Long id){
    boardService.deleteBoard(id);
    return "Board deleted successfully";
}
}

