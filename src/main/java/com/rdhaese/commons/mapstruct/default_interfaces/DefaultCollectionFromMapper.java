package com.rdhaese.commons.mapstruct.default_interfaces;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

/**
 * Created on 26/05/2017.
 *
 * @author Robin D'Haese
 */
public interface DefaultCollectionFromMapper<D, B> {
    Collection<D> mapFrom(Collection<B> b);

    List<D> mapFrom(List<B> b);

    Set<D> mapFrom(Set<B> b);

    Stream<D> mapFrom(Stream<B> b);
}
