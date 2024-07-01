package com.github.sondaehyeon;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BoardService {

	private final BoardRepository repository;

	public List<Board> getBoards() {
		return repository.findAll();
	}

	public void createBoard(String title, String description) {
		repository.save(new Board(title, description));
	}
}
