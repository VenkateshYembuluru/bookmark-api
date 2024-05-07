package com.venkat.bookmarkerapi.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
	
	@Query("select b from Bookmark b")
	Page<Bookmark> findBookmarkWithAllCloumns(Pageable pageable);
	
	@Query("select new com.venkat.bookmarkerapi.domain.BookmarkDTO(b.id,b.title,b.url,b.createdAt) from Bookmark b ")
	Page<BookmarkDTO> findBookmarks(Pageable pageable);
}