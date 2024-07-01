package com.github.sondaehyeon;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
@RequestMapping("/api/board")
public class BoardController {

	private final BoardService service;

	// ############################################################

	@PostMapping
	public ResponseEntity<?> getBoards() {
		return ResponseEntity.ok(service.getBoards());
	}

	// ############################################################

	@PutMapping
	public ResponseEntity<?> createBoard(@RequestBody CreateBoardRequest request) {

		String title = request.getTitle();
		String description = request.getDescription();

		service.createBoard(title, description);

		return ResponseEntity.ok().build();
	}

	@Data
	public static class CreateBoardRequest {
		String title;
		String description;
	}
}
