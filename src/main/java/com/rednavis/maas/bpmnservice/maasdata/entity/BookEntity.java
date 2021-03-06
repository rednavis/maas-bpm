package com.rednavis.maas.bpmnservice.maasdata.entity;

import com.rednavis.maas.bpmnservice.maasdata.BookStatus;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("book")
public class BookEntity {

  @Id
  private String id;
  private int count;
  private String title;
  private String author;
  private int pageCount;
  private String isbn;
  private int publishYear;
  private BookStatus status;
}
