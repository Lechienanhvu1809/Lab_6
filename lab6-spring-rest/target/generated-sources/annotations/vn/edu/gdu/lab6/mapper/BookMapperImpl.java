package vn.edu.gdu.lab6.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import vn.edu.gdu.lab6.dto.BookCreateDto;
import vn.edu.gdu.lab6.dto.BookResponseDto;
import vn.edu.gdu.lab6.entity.Book;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-07-18T10:43:22+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class BookMapperImpl implements BookMapper {

    @Override
    public BookResponseDto toResponseDto(Book book) {
        if ( book == null ) {
            return null;
        }

        BookResponseDto bookResponseDto = new BookResponseDto();

        bookResponseDto.setId( book.getId() );
        bookResponseDto.setTitle( book.getTitle() );
        bookResponseDto.setAuthor( book.getAuthor() );
        bookResponseDto.setIsbn( book.getIsbn() );
        bookResponseDto.setPrice( book.getPrice() );

        return bookResponseDto;
    }

    @Override
    public Book toEntity(BookCreateDto createDto) {
        if ( createDto == null ) {
            return null;
        }

        Book book = new Book();

        book.setTitle( createDto.getTitle() );
        book.setAuthor( createDto.getAuthor() );
        book.setIsbn( createDto.getIsbn() );
        book.setPrice( createDto.getPrice() );

        return book;
    }

    @Override
    public void updateEntityFromDto(BookCreateDto dto, Book entity) {
        if ( dto == null ) {
            return;
        }

        entity.setTitle( dto.getTitle() );
        entity.setAuthor( dto.getAuthor() );
        entity.setIsbn( dto.getIsbn() );
        entity.setPrice( dto.getPrice() );
    }
}
