package com.zh.pojo;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private int book_id;
    private String book_name;
    private int book_count;
    private String detail;
}
