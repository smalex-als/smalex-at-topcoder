package p400.srm485;

import utils.ExampleRunner;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 12/15/10
 * Time: 10:54 PM
 */
public class AfraidOfEven {
  public int[] restoreProgression(int[] seq) {
    int diff0 = getDiff(seq, 0);
    int diff1 = getDiff(seq, 1);
    if (diff0 != Integer.MAX_VALUE) {
      int[] newSeq = createAndTestSeqDiff(seq, diff0, 0);
      if (newSeq != null) {
        return newSeq;
      }
    }
    if (diff1 != Integer.MAX_VALUE) {
      int[] newSeq = createAndTestSeqDiff(seq, diff1, 1);
      if (newSeq != null) {
        return newSeq;
      }
    }
    return new int[0];
  }

  private int[] createAndTestSeqDiff(int[] seq, int diff0, int offset) {
    int[] newSeq = new int[seq.length];
    int a0 = offset == 0 ? seq[0] : seq[1] - diff0;
    if (!testExpected(seq[0], a0)) {
      return null;
    }
    for (int i = 0; i < seq.length; i++) {
      newSeq[i] = a0 + i * diff0;
      if (i % 2 != offset) {
        if (!testExpected(seq[i], newSeq[i])) {
          return null;
        }
      }
    }
    return newSeq;
  }

  private boolean testExpected(int n, int expected) {
    while (n != expected && n < expected) {
      n *= 2;
    }
    return n == expected;
  }

  private int getDiff(int[] seq, int i) {
    int diff = seq[2 + i] - seq[i];
    for (int j = i + 2; j < seq.length - 2; j += 2) {
      if (seq[2 + j] - seq[j] != diff) {
        return Integer.MAX_VALUE;
      }
    }
    return diff / 2;
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, new int[]{1, 2, 3, 4, 5}, new AfraidOfEven().restoreProgression(new int[]{1, 1, 3, 1, 5}));
    ExampleRunner.eq(2, new int[]{9, 7, 5, 3, 1}, new AfraidOfEven().restoreProgression(new int[]{9, 7, 5, 3, 1}));
    ExampleRunner.eq(3, new int[]{999, 999, 999, 999}, new AfraidOfEven().restoreProgression(new int[]{999, 999, 999, 999}));
    ExampleRunner.eq(4, new int[]{14, 47, 80, 113, 146, 179, 212}, new AfraidOfEven().restoreProgression(new int[]{7, 47, 5, 113, 73, 179, 53}));
    ExampleRunner.eq(5, new int[]{1498, 999, 500, 1}, new AfraidOfEven().restoreProgression(new int[]{749, 999, 125, 1}));
    ExampleRunner.eq(6, new int[]{1, 500, 999, 1498}, new AfraidOfEven().restoreProgression(new int[]{1, 125, 999, 749}));
    ExampleRunner.eq(7, new int[]{317, 316, 315, 314, 313, 312, 311, 310, 309, 308, 307, 306, 305}, new AfraidOfEven().restoreProgression(new int[]{317, 79, 315, 157, 313, 39, 311, 155, 309, 77, 307, 153, 305}));
    ExampleRunner.eq(8, new int[]{484, 465, 446, 427, 408, 389, 370, 351, 332, 313, 294, 275, 256, 237, 218, 199, 180, 161, 142, 123, 104, 85, 66, 47}, new AfraidOfEven().restoreProgression(new int[]{121, 465, 223, 427, 51, 389, 185, 351, 83, 313, 147, 275, 1, 237, 109, 199, 45, 161, 71, 123, 13, 85, 33, 47}));
    ExampleRunner.eq(9, new int[]{488, 489, 490, 491, 492, 493, 494, 495, 496, 497, 498, 499, 500, 501, 502, 503, 504, 505, 506, 507, 508, 509, 510, 511, 512, 513, 514, 515, 516, 517, 518, 519, 520, 521, 522, 523, 524, 525, 526, 527, 528, 529, 530, 531, 532, 533, 534, 535, 536}, new AfraidOfEven().restoreProgression(new int[]{61, 489, 245, 491, 123, 493, 247, 495, 31, 497, 249, 499, 125, 501, 251, 503, 63, 505, 253, 507, 127, 509, 255, 511, 1, 513, 257, 515, 129, 517, 259, 519, 65, 521, 261, 523, 131, 525, 263, 527, 33, 529, 265, 531, 133, 533, 267, 535, 67}));
    ExampleRunner.eq(10, new int[]{80, 77, 74, 71, 68, 65, 62, 59, 56}, new AfraidOfEven().restoreProgression(new int[]{5, 77, 37, 71, 17, 65, 31, 59, 7}));
    ExampleRunner.eq(11, new int[]{224, 221, 218, 215, 212, 209, 206, 203, 200, 197, 194, 191, 188, 185, 182, 179, 176, 173, 170, 167, 164, 161, 158, 155, 152, 149, 146, 143, 140, 137, 134, 131, 128, 125, 122, 119, 116, 113, 110, 107, 104, 101, 98, 95, 92, 89}, new AfraidOfEven().restoreProgression(new int[]{7, 221, 109, 215, 53, 209, 103, 203, 25, 197, 97, 191, 47, 185, 91, 179, 11, 173, 85, 167, 41, 161, 79, 155, 19, 149, 73, 143, 35, 137, 67, 131, 1, 125, 61, 119, 29, 113, 55, 107, 13, 101, 49, 95, 23, 89}));
    ExampleRunner.eq(12, new int[]{384, 333, 282, 231, 180, 129, 78}, new AfraidOfEven().restoreProgression(new int[]{3, 333, 141, 231, 45, 129, 39}));
    ExampleRunner.eq(13, new int[]{256, 255, 254, 253, 252, 251, 250, 249, 248, 247, 246, 245, 244, 243, 242, 241, 240, 239, 238, 237, 236, 235, 234, 233, 232, 231, 230, 229, 228, 227, 226}, new AfraidOfEven().restoreProgression(new int[]{1, 255, 127, 253, 63, 251, 125, 249, 31, 247, 123, 245, 61, 243, 121, 241, 15, 239, 119, 237, 59, 235, 117, 233, 29, 231, 115, 229, 57, 227, 113}));
    ExampleRunner.eq(14, new int[]{768, 751, 734, 717, 700, 683, 666, 649, 632, 615, 598, 581, 564, 547, 530, 513, 496, 479, 462, 445, 428, 411, 394, 377, 360, 343, 326, 309, 292, 275, 258, 241, 224, 207, 190, 173, 156, 139, 122, 105, 88, 71, 54}, new AfraidOfEven().restoreProgression(new int[]{3, 751, 367, 717, 175, 683, 333, 649, 79, 615, 299, 581, 141, 547, 265, 513, 31, 479, 231, 445, 107, 411, 197, 377, 45, 343, 163, 309, 73, 275, 129, 241, 7, 207, 95, 173, 39, 139, 61, 105, 11, 71, 27}));
    ExampleRunner.eq(15, new int[]{579, 512, 445, 378, 311}, new AfraidOfEven().restoreProgression(new int[]{579, 1, 445, 189, 311}));
    ExampleRunner.eq(16, new int[]{507, 512, 517, 522, 527, 532, 537, 542, 547, 552, 557, 562, 567, 572, 577, 582, 587, 592, 597, 602, 607, 612, 617, 622, 627, 632, 637, 642, 647, 652, 657, 662, 667, 672, 677, 682, 687, 692, 697, 702, 707, 712, 717, 722, 727, 732, 737, 742, 747}, new AfraidOfEven().restoreProgression(new int[]{507, 1, 517, 261, 527, 133, 537, 271, 547, 69, 557, 281, 567, 143, 577, 291, 587, 37, 597, 301, 607, 153, 617, 311, 627, 79, 637, 321, 647, 163, 657, 331, 667, 21, 677, 341, 687, 173, 697, 351, 707, 89, 717, 361, 727, 183, 737, 371, 747}));
    ExampleRunner.eq(17, new int[]{512, 505, 498, 491, 484, 477, 470, 463, 456, 449, 442, 435, 428, 421, 414, 407, 400, 393, 386, 379, 372, 365, 358, 351, 344, 337, 330, 323, 316, 309, 302, 295, 288, 281, 274, 267, 260, 253, 246, 239, 232, 225, 218, 211, 204, 197, 190, 183, 176}, new AfraidOfEven().restoreProgression(new int[]{1, 505, 249, 491, 121, 477, 235, 463, 57, 449, 221, 435, 107, 421, 207, 407, 25, 393, 193, 379, 93, 365, 179, 351, 43, 337, 165, 323, 79, 309, 151, 295, 9, 281, 137, 267, 65, 253, 123, 239, 29, 225, 109, 211, 51, 197, 95, 183, 11}));
    ExampleRunner.eq(18, new int[]{110, 177, 244, 311, 378, 445, 512, 579}, new AfraidOfEven().restoreProgression(new int[]{55, 177, 61, 311, 189, 445, 1, 579}));
    ExampleRunner.eq(19, new int[]{323, 332, 341, 350, 359, 368, 377, 386, 395, 404, 413, 422, 431, 440, 449, 458, 467, 476, 485, 494, 503, 512, 521}, new AfraidOfEven().restoreProgression(new int[]{323, 83, 341, 175, 359, 23, 377, 193, 395, 101, 413, 211, 431, 55, 449, 229, 467, 119, 485, 247, 503, 1, 521}));
    ExampleRunner.eq(20, new int[]{122, 317, 512, 707}, new AfraidOfEven().restoreProgression(new int[]{61, 317, 1, 707}));
    ExampleRunner.eq(21, new int[]{512, 513, 514, 515}, new AfraidOfEven().restoreProgression(new int[]{1, 513, 257, 515}));
    ExampleRunner.eq(22, new int[]{515, 514, 513, 512}, new AfraidOfEven().restoreProgression(new int[]{515, 257, 513, 1}));
    ExampleRunner.eq(23, new int[]{1, 1, 1, 1}, new AfraidOfEven().restoreProgression(new int[]{1, 1, 1, 1}));
    ExampleRunner.eq(24, new int[]{9, 14, 19, 24, 29}, new AfraidOfEven().restoreProgression(new int[]{9, 7, 19, 3, 29}));
    ExampleRunner.eq(25, new int[]{9, 18, 27, 36, 45}, new AfraidOfEven().restoreProgression(new int[]{9, 9, 27, 9, 45}));
    ExampleRunner.eq(26, new int[]{2, 11, 20, 29, 38, 47, 56, 65, 74}, new AfraidOfEven().restoreProgression(new int[]{1, 11, 5, 29, 19, 47, 7, 65, 37}));
    ExampleRunner.eq(27, new int[]{2, 7, 12, 17, 22, 27, 32, 37, 42, 47}, new AfraidOfEven().restoreProgression(new int[]{1, 7, 3, 17, 11, 27, 1, 37, 21, 47}));
    ExampleRunner.eq(28, new int[]{7, 14, 21, 28, 35, 42, 49, 56, 63}, new AfraidOfEven().restoreProgression(new int[]{7, 7, 21, 7, 35, 21, 49, 7, 63}));
    ExampleRunner.eq(29, new int[]{7, 15, 23, 31, 39, 47, 55, 63, 71, 79}, new AfraidOfEven().restoreProgression(new int[]{7, 15, 23, 31, 39, 47, 55, 63, 71, 79}));
    ExampleRunner.eq(30, new int[]{1, 9, 17, 25, 33, 41, 49, 57}, new AfraidOfEven().restoreProgression(new int[]{1, 9, 17, 25, 33, 41, 49, 57}));
    ExampleRunner.eq(31, new int[]{8, 7, 6, 5, 4, 3}, new AfraidOfEven().restoreProgression(new int[]{1, 7, 3, 5, 1, 3}));
    ExampleRunner.eq(32, new int[]{9, 8, 7, 6, 5, 4, 3, 2}, new AfraidOfEven().restoreProgression(new int[]{9, 1, 7, 3, 5, 1, 3, 1}));
    ExampleRunner.eq(33, new int[]{11, 18, 25, 32, 39, 46, 53, 60, 67, 74}, new AfraidOfEven().restoreProgression(new int[]{11, 9, 25, 1, 39, 23, 53, 15, 67, 37}));
    ExampleRunner.eq(34, new int[]{10, 9, 8, 7, 6, 5, 4, 3}, new AfraidOfEven().restoreProgression(new int[]{5, 9, 1, 7, 3, 5, 1, 3}));
    ExampleRunner.eq(35, new int[]{25, 86, 147, 208, 269, 330}, new AfraidOfEven().restoreProgression(new int[]{25, 43, 147, 13, 269, 165}));
    ExampleRunner.eq(36, new int[]{54, 57, 60, 63, 66, 69, 72, 75, 78}, new AfraidOfEven().restoreProgression(new int[]{27, 57, 15, 63, 33, 69, 9, 75, 39}));
    ExampleRunner.eq(37, new int[]{3, 3, 3, 3, 3}, new AfraidOfEven().restoreProgression(new int[]{3, 3, 3, 3, 3}));
    ExampleRunner.eq(38, new int[]{31, 31, 31, 31, 31, 31, 31, 31, 31, 31}, new AfraidOfEven().restoreProgression(new int[]{31, 31, 31, 31, 31, 31, 31, 31, 31, 31}));
    ExampleRunner.eq(39, new int[]{19, 16, 13, 10, 7, 4, 1}, new AfraidOfEven().restoreProgression(new int[]{19, 1, 13, 5, 7, 1, 1}));
    ExampleRunner.eq(40, new int[]{6, 27, 48, 69, 90, 111}, new AfraidOfEven().restoreProgression(new int[]{3, 27, 3, 69, 45, 111}));
    ExampleRunner.eq(41, new int[]{187, 269, 351, 433, 515, 597, 679, 761, 843}, new AfraidOfEven().restoreProgression(new int[]{187, 269, 351, 433, 515, 597, 679, 761, 843}));
    ExampleRunner.eq(42, new int[]{673, 629, 585, 541, 497}, new AfraidOfEven().restoreProgression(new int[]{673, 629, 585, 541, 497}));
    ExampleRunner.eq(43, new int[]{48, 47, 46, 45, 44, 43, 42, 41, 40, 39}, new AfraidOfEven().restoreProgression(new int[]{3, 47, 23, 45, 11, 43, 21, 41, 5, 39}));
    ExampleRunner.eq(44, new int[]{229, 311, 393, 475, 557, 639, 721, 803}, new AfraidOfEven().restoreProgression(new int[]{229, 311, 393, 475, 557, 639, 721, 803}));
    ExampleRunner.eq(45, new int[]{657, 647, 637, 627, 617, 607, 597, 587, 577, 567}, new AfraidOfEven().restoreProgression(new int[]{657, 647, 637, 627, 617, 607, 597, 587, 577, 567}));
    ExampleRunner.eq(46, new int[]{21, 21, 21, 21, 21, 21, 21, 21, 21, 21}, new AfraidOfEven().restoreProgression(new int[]{21, 21, 21, 21, 21, 21, 21, 21, 21, 21}));
    ExampleRunner.eq(47, new int[]{68, 65, 62, 59, 56, 53, 50}, new AfraidOfEven().restoreProgression(new int[]{17, 65, 31, 59, 7, 53, 25}));
    ExampleRunner.eq(48, new int[]{503, 458, 413, 368, 323, 278, 233, 188}, new AfraidOfEven().restoreProgression(new int[]{503, 229, 413, 23, 323, 139, 233, 47}));
    ExampleRunner.eq(49, new int[]{129, 206, 283, 360, 437}, new AfraidOfEven().restoreProgression(new int[]{129, 103, 283, 45, 437}));
    ExampleRunner.eq(50, new int[]{5, 22, 39, 56, 73, 90, 107, 124, 141, 158, 175, 192, 209, 226, 243, 260, 277, 294, 311, 328, 345}, new AfraidOfEven().restoreProgression(new int[]{5, 11, 39, 7, 73, 45, 107, 31, 141, 79, 175, 3, 209, 113, 243, 65, 277, 147, 311, 41, 345}));
    ExampleRunner.eq(51, new int[]{40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14}, new AfraidOfEven().restoreProgression(new int[]{5, 39, 19, 37, 9, 35, 17, 33, 1, 31, 15, 29, 7, 27, 13, 25, 3, 23, 11, 21, 5, 19, 9, 17, 1, 15, 7}));
    ExampleRunner.eq(52, new int[]{36, 109, 182, 255, 328, 401, 474, 547, 620, 693, 766, 839, 912, 985}, new AfraidOfEven().restoreProgression(new int[]{9, 109, 91, 255, 41, 401, 237, 547, 155, 693, 383, 839, 57, 985}));
    ExampleRunner.eq(53, new int[]{117, 138, 159, 180, 201, 222, 243, 264, 285, 306, 327, 348, 369, 390, 411, 432, 453, 474, 495, 516, 537, 558, 579, 600, 621, 642, 663}, new AfraidOfEven().restoreProgression(new int[]{117, 69, 159, 45, 201, 111, 243, 33, 285, 153, 327, 87, 369, 195, 411, 27, 453, 237, 495, 129, 537, 279, 579, 75, 621, 321, 663}));
    ExampleRunner.eq(54, new int[]{30, 47, 64, 81, 98, 115, 132, 149, 166, 183, 200, 217, 234, 251, 268, 285, 302, 319, 336, 353, 370, 387, 404, 421, 438, 455, 472, 489, 506, 523, 540, 557, 574, 591, 608, 625, 642, 659, 676, 693, 710, 727, 744, 761, 778, 795, 812}, new AfraidOfEven().restoreProgression(new int[]{15, 47, 1, 81, 49, 115, 33, 149, 83, 183, 25, 217, 117, 251, 67, 285, 151, 319, 21, 353, 185, 387, 101, 421, 219, 455, 59, 489, 253, 523, 135, 557, 287, 591, 19, 625, 321, 659, 169, 693, 355, 727, 93, 761, 389, 795, 203}));
    ExampleRunner.eq(55, new int[]{487, 498, 509, 520, 531, 542, 553, 564, 575, 586, 597, 608, 619, 630, 641, 652, 663, 674, 685, 696, 707, 718, 729, 740, 751, 762, 773, 784, 795, 806}, new AfraidOfEven().restoreProgression(new int[]{487, 249, 509, 65, 531, 271, 553, 141, 575, 293, 597, 19, 619, 315, 641, 163, 663, 337, 685, 87, 707, 359, 729, 185, 751, 381, 773, 49, 795, 403}));
    ExampleRunner.eq(56, new int[]{149, 146, 143, 140, 137, 134, 131, 128, 125, 122, 119, 116, 113, 110, 107, 104, 101, 98, 95, 92, 89, 86, 83, 80, 77, 74, 71, 68, 65, 62, 59, 56, 53, 50, 47, 44, 41, 38}, new AfraidOfEven().restoreProgression(new int[]{149, 73, 143, 35, 137, 67, 131, 1, 125, 61, 119, 29, 113, 55, 107, 13, 101, 49, 95, 23, 89, 43, 83, 5, 77, 37, 71, 17, 65, 31, 59, 7, 53, 25, 47, 11, 41, 19}));
    ExampleRunner.eq(57, new int[]{219, 240, 261, 282, 303, 324, 345, 366, 387, 408, 429, 450, 471, 492, 513, 534, 555, 576, 597, 618, 639, 660, 681, 702, 723, 744, 765, 786, 807, 828, 849, 870, 891, 912}, new AfraidOfEven().restoreProgression(new int[]{219, 15, 261, 141, 303, 81, 345, 183, 387, 51, 429, 225, 471, 123, 513, 267, 555, 9, 597, 309, 639, 165, 681, 351, 723, 93, 765, 393, 807, 207, 849, 435, 891, 57}));
    ExampleRunner.eq(58, new int[]{61, 82, 103, 124, 145, 166, 187, 208, 229, 250, 271, 292, 313, 334, 355, 376, 397, 418, 439, 460, 481, 502, 523, 544, 565, 586, 607, 628, 649, 670, 691, 712, 733, 754, 775, 796, 817, 838, 859, 880}, new AfraidOfEven().restoreProgression(new int[]{61, 41, 103, 31, 145, 83, 187, 13, 229, 125, 271, 73, 313, 167, 355, 47, 397, 209, 439, 115, 481, 251, 523, 17, 565, 293, 607, 157, 649, 335, 691, 89, 733, 377, 775, 199, 817, 419, 859, 55}));
    ExampleRunner.eq(59, new int[]{245, 246, 247, 248, 249, 250, 251, 252, 253, 254, 255, 256, 257, 258, 259, 260, 261, 262, 263, 264, 265, 266, 267, 268, 269, 270, 271, 272, 273, 274, 275, 276, 277, 278, 279, 280, 281, 282, 283, 284, 285, 286, 287, 288, 289, 290, 291, 292, 293, 294}, new AfraidOfEven().restoreProgression(new int[]{245, 123, 247, 31, 249, 125, 251, 63, 253, 127, 255, 1, 257, 129, 259, 65, 261, 131, 263, 33, 265, 133, 267, 67, 269, 135, 271, 17, 273, 137, 275, 69, 277, 139, 279, 35, 281, 141, 283, 71, 285, 143, 287, 9, 289, 145, 291, 73, 293, 147}));
    ExampleRunner.eq(60, new int[]{937, 930, 923, 916, 909, 902, 895, 888, 881, 874, 867, 860, 853, 846, 839, 832, 825, 818, 811, 804, 797, 790, 783, 776, 769, 762, 755, 748, 741, 734, 727, 720, 713, 706, 699, 692, 685, 678, 671, 664, 657, 650, 643, 636, 629, 622, 615, 608, 601, 594}, new AfraidOfEven().restoreProgression(new int[]{937, 465, 923, 229, 909, 451, 895, 111, 881, 437, 867, 215, 853, 423, 839, 13, 825, 409, 811, 201, 797, 395, 783, 97, 769, 381, 755, 187, 741, 367, 727, 45, 713, 353, 699, 173, 685, 339, 671, 83, 657, 325, 643, 159, 629, 311, 615, 19, 601, 297}));
    ExampleRunner.eq(61, new int[]{961, 953, 945, 937, 929, 921, 913, 905, 897, 889, 881, 873, 865, 857, 849, 841, 833, 825, 817, 809, 801, 793, 785, 777, 769, 761, 753, 745, 737, 729, 721, 713, 705, 697, 689, 681, 673, 665, 657, 649, 641, 633, 625, 617, 609, 601, 593, 585, 577, 569}, new AfraidOfEven().restoreProgression(new int[]{961, 953, 945, 937, 929, 921, 913, 905, 897, 889, 881, 873, 865, 857, 849, 841, 833, 825, 817, 809, 801, 793, 785, 777, 769, 761, 753, 745, 737, 729, 721, 713, 705, 697, 689, 681, 673, 665, 657, 649, 641, 633, 625, 617, 609, 601, 593, 585, 577, 569}));
    ExampleRunner.eq(62, new int[]{187, 185, 183, 181, 179, 177, 175, 173, 171, 169, 167, 165, 163, 161, 159, 157, 155, 153, 151, 149, 147, 145, 143, 141, 139, 137, 135, 133, 131, 129, 127, 125, 123, 121, 119, 117, 115, 113, 111, 109, 107, 105, 103, 101, 99, 97, 95, 93, 91, 89}, new AfraidOfEven().restoreProgression(new int[]{187, 185, 183, 181, 179, 177, 175, 173, 171, 169, 167, 165, 163, 161, 159, 157, 155, 153, 151, 149, 147, 145, 143, 141, 139, 137, 135, 133, 131, 129, 127, 125, 123, 121, 119, 117, 115, 113, 111, 109, 107, 105, 103, 101, 99, 97, 95, 93, 91, 89}));
    ExampleRunner.eq(63, new int[]{148, 145, 142, 139, 136, 133, 130, 127, 124, 121, 118, 115, 112, 109, 106, 103, 100, 97, 94, 91, 88, 85, 82, 79, 76, 73, 70, 67, 64, 61, 58, 55, 52, 49, 46, 43, 40, 37, 34, 31, 28, 25, 22, 19, 16, 13, 10, 7, 4, 1}, new AfraidOfEven().restoreProgression(new int[]{37, 145, 71, 139, 17, 133, 65, 127, 31, 121, 59, 115, 7, 109, 53, 103, 25, 97, 47, 91, 11, 85, 41, 79, 19, 73, 35, 67, 1, 61, 29, 55, 13, 49, 23, 43, 5, 37, 17, 31, 7, 25, 11, 19, 1, 13, 5, 7, 1, 1}));
    ExampleRunner.eq(64, new int[]{415, 426, 437, 448, 459, 470, 481, 492, 503, 514, 525, 536, 547, 558, 569, 580, 591, 602, 613, 624, 635, 646, 657, 668, 679, 690, 701, 712, 723, 734, 745, 756, 767, 778, 789, 800, 811, 822, 833, 844, 855, 866, 877, 888, 899, 910, 921, 932, 943, 954}, new AfraidOfEven().restoreProgression(new int[]{415, 213, 437, 7, 459, 235, 481, 123, 503, 257, 525, 67, 547, 279, 569, 145, 591, 301, 613, 39, 635, 323, 657, 167, 679, 345, 701, 89, 723, 367, 745, 189, 767, 389, 789, 25, 811, 411, 833, 211, 855, 433, 877, 111, 899, 455, 921, 233, 943, 477}));
    ExampleRunner.eq(65, new int[]{155, 160, 165, 170, 175, 180, 185, 190, 195, 200, 205, 210, 215, 220, 225, 230, 235, 240, 245, 250, 255, 260, 265, 270, 275, 280, 285, 290, 295, 300, 305, 310, 315, 320, 325, 330, 335, 340, 345, 350, 355, 360, 365, 370, 375, 380, 385, 390, 395, 400}, new AfraidOfEven().restoreProgression(new int[]{155, 5, 165, 85, 175, 45, 185, 95, 195, 25, 205, 105, 215, 55, 225, 115, 235, 15, 245, 125, 255, 65, 265, 135, 275, 35, 285, 145, 295, 75, 305, 155, 315, 5, 325, 165, 335, 85, 345, 175, 355, 45, 365, 185, 375, 95, 385, 195, 395, 25}));
    ExampleRunner.eq(66, new int[]{555, 548, 541, 534, 527, 520, 513, 506, 499, 492, 485, 478, 471, 464, 457, 450, 443, 436, 429, 422, 415, 408, 401, 394, 387, 380, 373, 366, 359, 352, 345, 338, 331, 324, 317, 310, 303, 296, 289, 282, 275, 268, 261, 254, 247, 240, 233, 226, 219, 212}, new AfraidOfEven().restoreProgression(new int[]{555, 137, 541, 267, 527, 65, 513, 253, 499, 123, 485, 239, 471, 29, 457, 225, 443, 109, 429, 211, 415, 51, 401, 197, 387, 95, 373, 183, 359, 11, 345, 169, 331, 81, 317, 155, 303, 37, 289, 141, 275, 67, 261, 127, 247, 15, 233, 113, 219, 53}));
    ExampleRunner.eq(67, new int[]{753, 754, 755, 756, 757, 758, 759, 760, 761, 762, 763, 764, 765, 766, 767, 768, 769, 770, 771, 772, 773, 774, 775, 776, 777, 778, 779, 780, 781, 782, 783, 784, 785, 786, 787, 788, 789, 790, 791, 792, 793, 794, 795, 796, 797, 798, 799, 800, 801, 802}, new AfraidOfEven().restoreProgression(new int[]{753, 377, 755, 189, 757, 379, 759, 95, 761, 381, 763, 191, 765, 383, 767, 3, 769, 385, 771, 193, 773, 387, 775, 97, 777, 389, 779, 195, 781, 391, 783, 49, 785, 393, 787, 197, 789, 395, 791, 99, 793, 397, 795, 199, 797, 399, 799, 25, 801, 401}));
    ExampleRunner.eq(68, new int[]{393, 482, 571, 660, 749, 838, 927, 1016}, new AfraidOfEven().restoreProgression(new int[]{393, 241, 571, 165, 749, 419, 927, 127}));
    ExampleRunner.eq(69, new int[]{1, 206, 411, 616, 821, 1026}, new AfraidOfEven().restoreProgression(new int[]{1, 103, 411, 77, 821, 513}));
    ExampleRunner.eq(70, new int[]{26, 111, 196, 281, 366, 451, 536, 621, 706, 791, 876, 961, 1046}, new AfraidOfEven().restoreProgression(new int[]{13, 111, 49, 281, 183, 451, 67, 621, 353, 791, 219, 961, 523}));
    ExampleRunner.eq(71, new int[]{162, 247, 332, 417, 502, 587, 672, 757, 842, 927, 1012}, new AfraidOfEven().restoreProgression(new int[]{81, 247, 83, 417, 251, 587, 21, 757, 421, 927, 253}));
    ExampleRunner.eq(72, new int[]{241, 418, 595, 772, 949, 1126}, new AfraidOfEven().restoreProgression(new int[]{241, 209, 595, 193, 949, 563}));
    ExampleRunner.eq(73, new int[]{1000, 997, 994, 991, 988, 985, 982, 979, 976, 973, 970, 967, 964, 961, 958, 955, 952, 949, 946, 943, 940, 937, 934, 931, 928, 925, 922, 919, 916, 913, 910, 907, 904, 901, 898, 895, 892, 889, 886, 883, 880, 877, 874, 871, 868, 865, 862, 859, 856, 853}, new AfraidOfEven().restoreProgression(new int[]{125, 997, 497, 991, 247, 985, 491, 979, 61, 973, 485, 967, 241, 961, 479, 955, 119, 949, 473, 943, 235, 937, 467, 931, 29, 925, 461, 919, 229, 913, 455, 907, 113, 901, 449, 895, 223, 889, 443, 883, 55, 877, 437, 871, 217, 865, 431, 859, 107, 853}));
    ExampleRunner.eq(74, new int[]{26, 61, 96, 131, 166, 201, 236, 271, 306, 341, 376, 411, 446, 481, 516, 551, 586, 621, 656, 691, 726, 761, 796, 831, 866, 901, 936, 971, 1006}, new AfraidOfEven().restoreProgression(new int[]{13, 61, 3, 131, 83, 201, 59, 271, 153, 341, 47, 411, 223, 481, 129, 551, 293, 621, 41, 691, 363, 761, 199, 831, 433, 901, 117, 971, 503}));
    ExampleRunner.eq(75, new int[]{102, 371, 640, 909, 1178}, new AfraidOfEven().restoreProgression(new int[]{51, 371, 5, 909, 589}));
    ExampleRunner.eq(76, new int[]{208, 351, 494, 637, 780, 923, 1066}, new AfraidOfEven().restoreProgression(new int[]{13, 351, 247, 637, 195, 923, 533}));
    ExampleRunner.eq(77, new int[]{14, 47, 80, 113, 146, 179, 212}, new AfraidOfEven().restoreProgression(new int[]{7, 47, 5, 113, 73, 179, 53}));
    ExampleRunner.eq(78, new int[]{1498, 999, 500, 1}, new AfraidOfEven().restoreProgression(new int[]{749, 999, 125, 1}));
    ExampleRunner.eq(79, new int[]{1, 6, 11, 16}, new AfraidOfEven().restoreProgression(new int[]{1, 3, 11, 1}));
    ExampleRunner.eq(80, new int[]{1, 2, 3, 4, 5}, new AfraidOfEven().restoreProgression(new int[]{1, 1, 3, 1, 5}));
    ExampleRunner.eq(81, new int[]{10, 125, 240, 355}, new AfraidOfEven().restoreProgression(new int[]{5, 125, 15, 355}));
    ExampleRunner.eq(82, new int[]{16, 17, 18, 19}, new AfraidOfEven().restoreProgression(new int[]{1, 17, 9, 19}));
    ExampleRunner.eq(83, new int[]{14, 11, 8, 5, 2}, new AfraidOfEven().restoreProgression(new int[]{7, 11, 1, 5, 1}));
    ExampleRunner.eq(84, new int[]{8, 7, 6, 5}, new AfraidOfEven().restoreProgression(new int[]{1, 7, 3, 5}));
    ExampleRunner.eq(85, new int[]{5, 4, 3, 2}, new AfraidOfEven().restoreProgression(new int[]{5, 1, 3, 1}));
    ExampleRunner.eq(86, new int[]{1, 4, 7, 10}, new AfraidOfEven().restoreProgression(new int[]{1, 1, 7, 5}));
    ExampleRunner.eq(87, new int[]{1, 32, 63, 94, 125, 156, 187, 218, 249, 280, 311, 342, 373, 404, 435, 466, 497, 528, 559, 590, 621, 652, 683, 714, 745, 776, 807, 838, 869, 900, 931, 962, 993}, new AfraidOfEven().restoreProgression(new int[]{1, 1, 63, 47, 125, 39, 187, 109, 249, 35, 311, 171, 373, 101, 435, 233, 497, 33, 559, 295, 621, 163, 683, 357, 745, 97, 807, 419, 869, 225, 931, 481, 993}));
    ExampleRunner.eq(88, new int[]{5, 6, 7, 8}, new AfraidOfEven().restoreProgression(new int[]{5, 3, 7, 1}));
    ExampleRunner.eq(89, new int[]{4, 7, 10, 13, 16, 19}, new AfraidOfEven().restoreProgression(new int[]{1, 7, 5, 13, 1, 19}));
    ExampleRunner.eq(90, new int[]{15, 16, 17, 18}, new AfraidOfEven().restoreProgression(new int[]{15, 1, 17, 9}));
    ExampleRunner.eq(91, new int[]{4, 3, 2, 1}, new AfraidOfEven().restoreProgression(new int[]{1, 3, 1, 1}));
    ExampleRunner.eq(92, new int[]{345, 388, 431, 474, 517, 560, 603, 646, 689, 732, 775, 818, 861, 904}, new AfraidOfEven().restoreProgression(new int[]{345, 97, 431, 237, 517, 35, 603, 323, 689, 183, 775, 409, 861, 113}));
    ExampleRunner.eq(93, new int[]{8, 7, 6, 5, 4, 3, 2, 1}, new AfraidOfEven().restoreProgression(new int[]{1, 7, 3, 5, 1, 3, 1, 1}));
    ExampleRunner.eq(94, new int[]{5, 338, 671, 1004}, new AfraidOfEven().restoreProgression(new int[]{5, 169, 671, 251}));
    ExampleRunner.eq(95, new int[]{4, 5, 6, 7}, new AfraidOfEven().restoreProgression(new int[]{1, 5, 3, 7}));
    ExampleRunner.eq(96, new int[]{1, 8, 15, 22}, new AfraidOfEven().restoreProgression(new int[]{1, 1, 15, 11}));
    ExampleRunner.eq(97, new int[]{256, 259, 262, 265, 268, 271, 274, 277, 280, 283, 286, 289, 292, 295, 298, 301, 304, 307, 310, 313, 316, 319, 322, 325, 328, 331, 334, 337, 340, 343, 346, 349, 352, 355, 358, 361, 364, 367, 370, 373, 376, 379, 382, 385, 388, 391, 394, 397, 400, 403}, new AfraidOfEven().restoreProgression(new int[]{1, 259, 131, 265, 67, 271, 137, 277, 35, 283, 143, 289, 73, 295, 149, 301, 19, 307, 155, 313, 79, 319, 161, 325, 41, 331, 167, 337, 85, 343, 173, 349, 11, 355, 179, 361, 91, 367, 185, 373, 47, 379, 191, 385, 97, 391, 197, 397, 25, 403}));
    ExampleRunner.eq(98, new int[]{16, 117, 218, 319}, new AfraidOfEven().restoreProgression(new int[]{1, 117, 109, 319}));
    ExampleRunner.eq(99, new int[]{510, 511, 512, 513}, new AfraidOfEven().restoreProgression(new int[]{255, 511, 1, 513}));
    ExampleRunner.eq(100, new int[]{512, 509, 506, 503, 500, 497, 494, 491, 488, 485, 482, 479, 476, 473, 470, 467, 464, 461, 458, 455, 452, 449, 446, 443, 440, 437, 434, 431, 428, 425, 422, 419, 416, 413, 410, 407, 404, 401, 398, 395, 392, 389, 386, 383, 380, 377}, new AfraidOfEven().restoreProgression(new int[]{1, 509, 253, 503, 125, 497, 247, 491, 61, 485, 241, 479, 119, 473, 235, 467, 29, 461, 229, 455, 113, 449, 223, 443, 55, 437, 217, 431, 107, 425, 211, 419, 13, 413, 205, 407, 101, 401, 199, 395, 49, 389, 193, 383, 95, 377}));
    ExampleRunner.eq(101, new int[]{5, 8, 11, 14}, new AfraidOfEven().restoreProgression(new int[]{5, 1, 11, 7}));
    ExampleRunner.eq(102, new int[]{7, 6, 5, 4}, new AfraidOfEven().restoreProgression(new int[]{7, 3, 5, 1}));
    ExampleRunner.eq(103, new int[]{1, 12, 23, 34}, new AfraidOfEven().restoreProgression(new int[]{1, 3, 23, 17}));
    ExampleRunner.eq(104, new int[]{4, 9, 14, 19}, new AfraidOfEven().restoreProgression(new int[]{1, 9, 7, 19}));
    ExampleRunner.eq(105, new int[]{1000, 999, 998, 997}, new AfraidOfEven().restoreProgression(new int[]{125, 999, 499, 997}));
    ExampleRunner.eq(106, new int[]{7, 24, 41, 58, 75, 92, 109, 126, 143, 160, 177, 194, 211, 228, 245, 262, 279, 296, 313, 330, 347, 364, 381, 398, 415, 432, 449, 466, 483, 500, 517, 534, 551, 568, 585, 602, 619}, new AfraidOfEven().restoreProgression(new int[]{7, 3, 41, 29, 75, 23, 109, 63, 143, 5, 177, 97, 211, 57, 245, 131, 279, 37, 313, 165, 347, 91, 381, 199, 415, 27, 449, 233, 483, 125, 517, 267, 551, 71, 585, 301, 619}));
  }
}
