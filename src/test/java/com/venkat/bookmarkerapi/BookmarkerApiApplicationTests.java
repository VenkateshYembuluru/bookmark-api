package com.venkat.bookmarkerapi;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.venkat.bookmarkerapi.domain.Bookmark;
import com.venkat.bookmarkerapi.domain.BookmarkRepository;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
/*@TestPropertySource(properties = {
		"spring.datasource.url=jdbc:tc:postgresql:14-alpine:///demo"
})*/
class BookmarkerApiApplicationTests {

	/*@Autowired
	private MockMvc mockMvc;

	@Autowired
	private BookmarkRepository bookmarkRepository;

	private List<Bookmark> bookmarks;

	@BeforeEach
	void setup()
	{
		bookmarkRepository.deleteAllInBatch();
		bookmarks = new ArrayList<>();

		bookmarks.add(new Bookmark(null, "SivaLabs", "https://sivalabs.in", Instant.now()));
		bookmarks.add(new Bookmark(null, "SpringBlog", "https://spring.io/blog", Instant.now()));
		bookmarks.add(new Bookmark(null, "Quarkus", "https://quarkus.io/", Instant.now()));
		bookmarks.add(new Bookmark(null, "Micronaut", "https://micronaut.io/", Instant.now()));
		bookmarks.add(new Bookmark(null, "JOOQ", "https://www.jooq.org/", Instant.now()));
		bookmarks.add(new Bookmark(null, "VladMihalcea", "https://vladmihalcea.com", Instant.now()));
		bookmarks.add(new Bookmark(null, "Thoughts On Java", "https://thorben-janssen.com/", Instant.now()));
		bookmarks.add(new Bookmark(null, "DZone", "https://dzone.com/", Instant.now()));
		bookmarks.add(new Bookmark(null, "DevOpsBookmarks", "http://www.devopsbookmarks.com/", Instant.now()));
		bookmarks.add(new Bookmark(null, "Kubernetes docs", "https://kubernetes.io/docs/home/", Instant.now()));
		bookmarks.add(new Bookmark(null, "Expressjs", "https://expressjs.com/", Instant.now()));
		bookmarks.add(new Bookmark(null, "Marcobehler", "https://www.marcobehler.com", Instant.now()));
		bookmarks.add(new Bookmark(null, "baeldung", "https://www.baeldung.com", Instant.now()));
		bookmarks.add(new Bookmark(null, "devglan", "https://www.devglan.com", Instant.now()));
		bookmarks.add(new Bookmark(null, "linuxize", "https://linuxize.com", Instant.now()));

		bookmarkRepository.saveAll(bookmarks);
	}
	@ParameterizedTest
	@CsvSource({
			"1,15,3,1,true,false,true,false",
			"2,15,3,2,false,false,true,true",
			"3,15,3,3,false,true,false,true"
	})
	@Test
	void shouldGetBookmarks(int pageNo, int totalElements, int totalPages, int currentPage,
							boolean isFirst, boolean isLast,
							boolean hasNext, boolean hasPrevious) throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/api/bookmark/two?page="+pageNo))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.totalElements", CoreMatchers.equalTo(totalElements)))
				.andExpect(jsonPath("$.totalPages", CoreMatchers.equalTo(totalPages)))
				.andExpect(jsonPath("$.currentPage", CoreMatchers.equalTo(currentPage)))
				.andExpect(jsonPath("$.isFirst", CoreMatchers.equalTo(isFirst)))
				.andExpect(jsonPath("$.isLast", CoreMatchers.equalTo(isLast)))
				.andExpect(jsonPath("$.hasNext", CoreMatchers.equalTo(hasNext)))
				.andExpect(jsonPath("$.hasPrevious", CoreMatchers.equalTo(hasPrevious)))
		;
	}*/
}
