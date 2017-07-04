package com.rdhaese.commons.mapstruct.default_interfaces;

/**
 * Created on 4/07/2017.
 *
 * @author Robin D'Haese
 */
public interface DefaultFromMapper<D, B> extends
        DefaultObjectFromMapper<D, B>,
        DefaultCollectionFromMapper<D, B> {
}
