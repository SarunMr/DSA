// Maximizing Tech Startup Revenue before Acquisition
// A tech startup, AlgoStart, is planning to get acquired by a larger company.
// To negotiate a higher acquisition price, AlgoStart wants to increase its
// revenue by launching a few high-return projects. However, due to limited
// resources, the startup can only work on at most k distinct projects before
// the acquisition. You are given n potential projects, where the i-th project
// has a projected revenue gain of revenues[i] and requires a minimum investment
// capital of investments[i] to launch. Initially, AlgoStart has c capital. When
// a project is completed, its revenue gain is added to the startup’s total
// capital, which can then be reinvested into other projects. Your task is to
// determine the maximum possible capital AlgoStart can accumulate after
// completing at most k projects.

public class AlgoStart {
  int maxCaptital(int k, int c, int revenue[], int investment[]) {
    for (int i = 0; i < k; i++) {
      if (c >= investment[i]) {
        c += revenue[i];
      }
    }
    return c;
  }

  public static void main(String[] args) {
    AlgoStart m1 = new AlgoStart();

    // Test Case 1
    int[] revenue1 = { 3, 6, 10 };
    int[] investment1 = { 1, 3, 5 };
    int result1 = m1.maxCaptital(3, 1, revenue1, investment1);
    int expected1 = 20;
    System.out.println(
        "Test Case 1: Final Capital = "
            + result1
            + " | Expected = "
            + expected1
            + " | Pass: "
            + (result1 == expected1));

    // Test Case 2
    int[] revenue2 = { 2, 5, 8 };
    int[] investment2 = { 0, 2, 3 };
    int result2 = m1.maxCaptital(2, 0, revenue2, investment2);
    int expected2 = 7;
    System.out.println(
        "Test Case 2: Final Capital = "
            + result2
            + " | Expected = "
            + expected2
            + " | Pass: "
            + (result2 == expected2));

    // Test Case 3
    int[] revenue3 = { 10, 20 };
    int[] investment3 = { 5, 10 };
    int result3 = m1.maxCaptital(5, 0, revenue3, investment3);
    int expected3 = 0;
    System.out.println(
        "Test Case 3: Final Capital = "
            + result3
            + " | Expected = "
            + expected3
            + " | Pass: "
            + (result3 == expected3));

    // Test Case 4
    int[] revenue4 = { 50 };
    int[] investment4 = { 20 };
    int result4 = m1.maxCaptital(0, 100, revenue4, investment4);
    int expected4 = 100;
    System.out.println(
        "Test Case 4: Final Capital = "
            + result4
            + " | Expected = "
            + expected4
            + " | Pass: "
            + (result4 == expected4));
  }
}

/*
 * ========= EXPECTED OUTPUT =========
 * Test Case 1: Final Capital = 20 | Expected = 20 | Pass: true
 * Test Case 2: Final Capital = 7 | Expected = 7 | Pass: true
 * Test Case 3: Final Capital = 0 | Expected = 0 | Pass: true
 * Test Case 4: Final Capital = 100| Expected = 100| Pass: true
 * ===================================
 */
