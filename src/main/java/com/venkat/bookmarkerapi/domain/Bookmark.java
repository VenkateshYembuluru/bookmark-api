package com.venkat.bookmarkerapi.domain;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "bookmarks")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Bookmark {
	
	@Id
	@SequenceGenerator(name = "bm_seq", sequenceName = "bm_id_seq")
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator ="bm_seq")
	private Long id;
	@Column(nullable = false)
	private String title;
	@Column(nullable = false)
	private String url;	
	private Instant createdAt;
	

}
