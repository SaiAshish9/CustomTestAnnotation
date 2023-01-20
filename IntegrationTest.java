package main.java.utils.common;

import main.java.utils.enums.IntegrationTestTag;
import org.junit.jupiter.api.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Test
public @interface IntegrationTest {
    IntegrationTestTag tag();
}
