// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    "Median of 1 element is correct!" {
        median(listOf(1.0)) shouldBe (1.0f plusOrMinus tolerance)
    }

    "Median of 2 elements is correct!" {
        median(listOf(1.0, 2.0)) shouldBe (1.5f plusOrMinus tolerance)
    }

    "Median of 3 elements is correct!" {
        median(listOf(32.0, 62.0, 33.0)) shouldBe (33.0f plusOrMinus tolerance)
    }

    "Median of 4 elements is correct!" {
        median(listOf(10.0, 6.0, 18.0, 4.0)) shouldBe (8.0f plusOrMinus tolerance)
    }
})
