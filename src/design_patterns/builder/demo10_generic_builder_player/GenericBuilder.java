package design_patterns.builder.demo10_generic_builder_player;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class GenericBuilder<T> {

    private final Supplier<T> instantiator;

    private List<Consumer<T>> instanceModifiers = new ArrayList<>();

    private GenericBuilder(Supplier<T> instantiator) {
        this.instantiator = instantiator;
    }

    public static <T> GenericBuilder<T> of(Supplier<T> instantiator) {

        return new GenericBuilder<>(instantiator);
    }

    public <V> GenericBuilder<T> with(BiConsumer<T, V> biConsumer, V value) {
        instanceModifiers.add(consumer -> biConsumer.accept(consumer, value));
        return this;
    }


    public T build() {
        T t = instantiator.get();
        instanceModifiers.forEach(consumer -> consumer.accept(t));
        instanceModifiers.clear();
        return t;
    }
}
