package com.dansona.dao;

import com.dansona.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author cyl
 */
@Mapper
public interface BookRepository {
    /**
     * 查询
     * @param id
     * @return
     */
    @Select("select * from tb_book where id = #{id}")
    Book getBookById(Long id);
}
