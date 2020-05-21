package design_patterns.builder.demo9_generic_builder;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class GenericBuilder<T> {

	private final Supplier<T> instantiator;

	private final List<Consumer<T>> instanceModifiers = new ArrayList<>();

	private GenericBuilder(Supplier<T> instantiator) {
		this.instantiator = instantiator;
	}

	public static <T> GenericBuilder<T> of(Supplier<T> instantiator) {
		return new GenericBuilder<T>(instantiator);
	}

	public <V> GenericBuilder<T> with(BiConsumer<T, V> biConsumer, V value) {

		//ok, now I get it: it's a consumer of T, so it gets an instance ot T
		instanceModifiers.add(t -> biConsumer.accept(t, value));
		return this;
	}

	public T build() {
		T t = instantiator.get();
		instanceModifiers.forEach(consumer -> consumer.accept(t));
		instanceModifiers.clear();
		return t;
	}
}

