package com.rdhaese.commons.mapstruct.default_interfaces;

import java.util.Optional;

/**
 * Created on 26/05/2017.
 *
 * @author Robin D'Haese
 */
public interface DefaultObjectFromMapper<D, B> {

    D mapFrom(B b);

    default Optional<D> mapFrom(Optional<B> b) {
        if (null == b) return null;
        return Optional.ofNullable(mapFrom(b.orElse(null)));
    }
}
