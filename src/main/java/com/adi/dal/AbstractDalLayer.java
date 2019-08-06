package com.adi.dal;
/*
 * @author: aditya10.kumar
 * @created: 05/08/19
 */
/*
 * @author: aditya10.kumar
 * @created: 05/08/19
 */

import com.adi.entity.AbstractEntity;

import java.util.List;

public interface AbstractDalLayer<E extends AbstractEntity,P> {
    E findById(P id);
    List<E> findAll();
}

