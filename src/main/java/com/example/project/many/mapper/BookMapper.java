package com.example.project.many.mapper;

import com.example.project.many.entity.BookEntity;
import com.example.project.many.model.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {
    BookEntity modelToEntity(Book book);
    Book entityToMode(BookEntity bookEntity);
}
