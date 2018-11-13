package com.rameshify.coding.algorithmictoolbox;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.time.Duration;

import static java.time.Duration.ofMillis;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

public class GreatestCommonDivisorTest {

  public static final Duration SEVENTY_FIVE_MILLISECONDS = ofMillis(75);
  private GreatestCommonDivisor greatestCommonDivisor;

  @BeforeEach
  public void beforeEach() {
    greatestCommonDivisor = new GreatestCommonDivisor();
  }

  @AfterEach
  public void afterEach() {
    greatestCommonDivisor = null;
  }

  @Test()
  void gcdNaive() {
    Long gcd = assertTimeoutPreemptively(SEVENTY_FIVE_MILLISECONDS, () -> greatestCommonDivisor.gcdNaive(Integer.MAX_VALUE, Integer.MAX_VALUE));
    assertThat(gcd).isEqualTo(Integer.MAX_VALUE);
  }

  @Test
  void gcdEuclidLong() {
    long gcd = assertTimeout(SEVENTY_FIVE_MILLISECONDS, () -> greatestCommonDivisor.gcdEuclid(Integer.MAX_VALUE, Integer.MAX_VALUE));
    assertThat(gcd).isEqualTo(Integer.MAX_VALUE);
  }

  @Test
  void gcdEuclidBigInteger() {
    BigInteger gcd = assertTimeout(SEVENTY_FIVE_MILLISECONDS, () -> greatestCommonDivisor.gcdEuclid(BigInteger.valueOf(Integer.MAX_VALUE), BigInteger.valueOf(Integer.MAX_VALUE)));
    assertThat(gcd).isEqualTo(Integer.MAX_VALUE);
  }
}