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
public interface DefaultCollectionBackMapper<D, B> {
    Collection<B> mapBack(Collection<D> d);

    List<B> mapBack(List<D> d);

    Set<B> mapBack(Set<D> d);

    Stream<B> mapBack(Stream<D> d);

}
