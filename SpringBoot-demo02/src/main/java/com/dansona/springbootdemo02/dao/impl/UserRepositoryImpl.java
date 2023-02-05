/**
 * Copyright (C), 2022-2023,
 * FileName: UserRepositoryImpl
 * Author:   cyl
 * Date:     2023/2/5 21:55
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.dansona.springbootdemo02.dao.impl;

import com.dansona.springbootdemo02.dao.UserRepository;
import org.springframework.stereotype.Repository;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author cyl
 * @create 2023/2/5
 * @since 1.0.0
 */
@Repository
public class UserRepositoryImpl implements UserRepository {

    @Override
    public void save() {
        System.out.println("save..........");
    }
}