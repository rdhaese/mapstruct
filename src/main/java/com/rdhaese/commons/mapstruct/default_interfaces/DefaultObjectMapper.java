package com.rdhaese.commons.mapstruct.default_interfaces;

/**
 * Created on 26/05/2017.
 *
 * @author Robin D'Haese
 */
public interface DefaultObjectMapper<D, B> extends
        DefaultObjectFromMapper<D, B>,
        DefaultObjectBackMapper<D, B> {
}
