package com.rdhaese.commons.mapstruct.default_interfaces;

/**
 * Created on 4/07/2017.
 *
 * @author Robin D'Haese
 */
public interface DefaultBackMapper<D, B> extends
        DefaultObjectBackMapper<D, B>,
        DefaultCollectionBackMapper<D, B> {
}
