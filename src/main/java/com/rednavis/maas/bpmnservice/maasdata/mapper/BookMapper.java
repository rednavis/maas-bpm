package com.rednavis.maas.bpmnservice.maasdata.mapper;

import com.rednavis.maas.bpmnservice.maasdata.dto.Book;
import com.rednavis.maas.bpmnservice.maasdata.entity.BookEntity;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper
public interface BookMapper {

  BookEntity dtoToEntity(Book book);

  Book entityToDto(BookEntity bookEntity);

  List<BookEntity> listDtoToListEntity(List<Book> bookList);

  List<Book> listEntityToListDto(List<BookEntity> bookEntityList);
}