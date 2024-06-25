package dummy;

// make use of Java 17 feature since this project mandates JDK 17
public sealed interface Dummy permits DummyImpl {
}
