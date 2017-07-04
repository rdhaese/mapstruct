package com.rdhaese.commons.mapstruct.default_interfaces;

import java.util.Optional;

/**
 * Created on 26/05/2017.
 *
 * @author Robin D'Haese
 */
public interface DefaultObjectBackMapper<D, B> {

    B mapBack(D d);

    default Optional<B> mapBack(Optional<D> d) {
        if (null == d) return null;
        return Optional.ofNullable(mapBack(d.orElse(null)));
    }
}
