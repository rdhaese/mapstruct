package com.rdhaese.commons.mapstruct.default_interfaces;

/**
 * Created on 26/05/2017.
 *
 * @author Robin D'Haese
 */
public interface DefaultMapper<D, B> extends
        DefaultFromMapper<D, B>,
        DefaultBackMapper<D, B> {
}
