package com.github.sondaehyeon;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document("board")
public class Board {
	String title;
	String description;
}
